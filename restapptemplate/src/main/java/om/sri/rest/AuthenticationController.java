package om.sri.rest;

import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import om.sri.common.ApiResponse;
import om.sri.common.DeviceProvider;
import om.sri.model.User;
import om.sri.model.UserTokenState;
import om.sri.security.TokenHelper;
import om.sri.security.auth.JwtAuthenticationRequest;
import om.sri.service.impl.CustomUserDetailsService;


/**
 * Created by Srinivas Repuri on 2018-10-10.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthenticationController {


	@Autowired
	TokenHelper tokenHelper;

	@Lazy
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Autowired
	private DeviceProvider deviceProvider;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ApiResponse<UserTokenState> createAuthenticationToken(
			@RequestBody JwtAuthenticationRequest authenticationRequest, HttpServletResponse response, Device device)
			throws AuthenticationException, IOException {
		Authentication authentication = null;
		try {
			// Perform the security
			authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		} catch (Exception e) {
			// return new ResponseEntity<String>("Authentication failed",
			// HttpStatus.UNAUTHORIZED);
			return new ApiResponse<>(HttpStatus.UNAUTHORIZED.value(), "failure");
		}

		// Inject into security context
		SecurityContextHolder.getContext().setAuthentication(authentication);

		// token creation
		User user = (User) authentication.getPrincipal();
		String jws = tokenHelper.generateToken(user.getUsername(), device);
		int expiresIn = tokenHelper.getExpiredIn(device);
		// Return the token
		// return ResponseEntity.ok(new UserTokenState(jws, expiresIn));
		return new ApiResponse<>(HttpStatus.OK.value(), "success", new UserTokenState(jws, expiresIn));
	}

	@RequestMapping(value = "/refresh", method = RequestMethod.POST)
	public ResponseEntity<?> refreshAuthenticationToken(HttpServletRequest request, HttpServletResponse response,
			Principal principal) {

		String authToken = tokenHelper.getToken(request);

		Device device = deviceProvider.getCurrentDevice(request);

		if (authToken != null && principal != null) {
			String refreshedToken = tokenHelper.refreshToken(authToken, device);
			int expiresIn = tokenHelper.getExpiredIn(device);

			return ResponseEntity.ok(new UserTokenState(refreshedToken, expiresIn));
		} else {
			UserTokenState userTokenState = new UserTokenState();
			return ResponseEntity.accepted().body(userTokenState);
		}
	}

	@RequestMapping(value = "/change-password", method = RequestMethod.POST)
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')  or hasRole('EMPLOYEE')")
	public ResponseEntity<?> changePassword(@RequestBody PasswordChanger passwordChanger) {
		userDetailsService.changePassword(passwordChanger.oldPassword, passwordChanger.newPassword);
		Map<String, String> result = new HashMap<>();
		result.put("result", "success");
		return ResponseEntity.accepted().body(result);
	}

	static class PasswordChanger {
		public String oldPassword;
		public String newPassword;
	}
}