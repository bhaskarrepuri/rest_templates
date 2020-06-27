package om.sri.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import om.sri.dto.UserDTO;
import om.sri.model.Authority;
import om.sri.model.User;
import om.sri.service.UserService;

/**
 * 
 * @author Srinivas Repuri
 *
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController extends BaseController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(method = GET, value = "/user/{userId}")
	@PreAuthorize("hasRole('OWNER') or hasRole('EMPLOYEE') or hasRole('ADMIN')")
	public User loadById(@PathVariable Long userId) {
		return this.userService.findById(userId);
	}

	@PreAuthorize("hasRole('OWNER') or hasRole('EMPLOYEE') or hasRole('ADMIN')")
	@RequestMapping(method = GET, value = "/user/all")
	public List<User> loadAll() {
		return this.userService.findAll();
	}

	/*
	 * We are not using userService.findByUsername here(we could), so it is good
	 * that we are making sure that the user has role "ROLE_USER" to access this
	 * endpoint.
	 */
	@RequestMapping("/whoami")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN') or hasRole('ADMIN')")
	public User user(Principal user) {
		try {
			// userService.saveEmployee();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		boolean isExists = userService.isUserExists(user.getName());
		return this.userService.findByUsername(user.getName());
	}

	/**
	 * Service used for load all user authorities. Service accessible login user
	 * have 'ADMIN' & 'OWNER' & 'EMPLOYEE'
	 * 
	 * @return
	 */
	@RequestMapping(method = GET, value = "/loadallauthorities")
	@PreAuthorize("hasRole('OWNER') or hasRole('EMPLOYEE') or hasRole('ADMIN')")
	public List<Authority> loadAllAuthorities() {
		log.debug("--loadallauthorities--");
		return userService.loadAllAuthorities();
	}

	@RequestMapping("/isuserexists/{username}")
	@PreAuthorize("hasRole('OWNER') or hasRole('EMPLOYEE') or hasRole('ADMIN')")
	public boolean isUserExists(@PathVariable String username) {
		return userService.isUserExists(username);
	}

	@RequestMapping("/saveuser")
	@PreAuthorize("hasRole('OWNER') or hasRole('EMPLOYEE') or hasRole('ADMIN')")
	public ResponseEntity<?> saveUser(@RequestBody UserDTO user, Principal sessionUser) {
		ResponseEntity<String> responseEntity;
		System.out.println(user);
		try {
			userService.saveUser(user);
			responseEntity = new ResponseEntity<>(propFileService.getUserSaveSuccessMessage(), HttpStatus.CREATED);
		} catch (Exception e) {
			responseEntity = logError(log, propFileService.getUserSaveSuccessMessage() + e.getMessage(), e,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

}
