package om.sri.service;

import java.text.ParseException;
import java.util.List;

import om.sri.dto.UserDTO;
import om.sri.model.Authority;
import om.sri.model.User;


/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
	User findById(Long id);

	User findByUsername(String username);

	List<User> findAll();

	List<Authority> loadAllAuthorities();

	boolean isUserExists(String username);

	String getId(String prefix, Integer currentId);

	void saveUser(UserDTO user) throws ParseException;

}
