package om.sri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import om.sri.model.User;


/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

	@Query("SELECT MAX(u.id) from User u")
	Integer getMaxUserId();
}
