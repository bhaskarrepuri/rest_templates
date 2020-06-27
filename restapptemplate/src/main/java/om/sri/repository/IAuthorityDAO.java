package om.sri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import om.sri.model.Authority;


/**
 * Created by fan.jin on 2016-10-15.
 */
public interface IAuthorityDAO extends JpaRepository<Authority, Long> {
	Authority findById(long id);

	Authority findByName(String name);
}
