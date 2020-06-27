package om.sri.service.impl;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import om.sri.common.Prefix;
import om.sri.common.UserStatus;
import om.sri.dto.UserDTO;
import om.sri.model.Authority;
import om.sri.model.User;
import om.sri.model.UserRoleName;
import om.sri.repository.IAuthorityDAO;
import om.sri.repository.UserRepository;
import om.sri.service.UserService;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Service
// @Transactional
public class UserServiceImpl extends BaseService implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private IAuthorityDAO authorityDAO;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User findByUsername(String username) throws UsernameNotFoundException {
		User u = userRepository.findByUsername(username);
		return u;
	}

	public User findById(Long id) throws AccessDeniedException {
		User u = userRepository.getOne(id);
		return u;
	}

	public List<User> findAll() throws AccessDeniedException {
		List<User> result = userRepository.findAll();
		return result;
	}

	@Override
	public List<Authority> loadAllAuthorities() {
		// Load all authorities
		return authorityDAO.findAll();
	}

	@Override
	public boolean isUserExists(String username) {
		User user = userRepository.findByUsername(username);
		if (user == null)
			return false;
		else
			return true;

	}

	@Override
	public String getId(String prefix, Integer currentId) {
		String uniqueId;
		if (currentId != null) {
			uniqueId = prefix + ++currentId;
		} else {
			uniqueId = prefix + 1;
		}
		return uniqueId;
	}

	@Override
	public void saveUser(UserDTO dto) throws ParseException {
		Integer maxId = userRepository.getMaxUserId();
		String userId = getId(Prefix.USER.getPrefix(), maxId);
		Authority authority = authorityDAO.findById(UserRoleName.getStatusByValue(dto.getRole()).getId());
		List<Authority> authorities = Arrays.asList(authority);
		User user = new User(userId, dto.getUsername(), passwordEncoder.encode(dto.getPassword()), dto.getLastName(),
				dto.getFirstName(), dto.getFathername(), "M", dto.getEmail(), new Date(),
				dto.getPhonenumber().longValue(), dto.getLandnumber().longValue(), dto.getRole(), dto.getVillage(),
				dto.getAddress(), dto.getCreatedby(), dto.getCreatedby(), UserStatus.ACTIVE.getStatus(), true,
				authorities);
		userRepository.save(user);
	}

}
