package om.sri.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import om.sri.repository.UserRepositoryTest;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql({ "/data/import.sql" })
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void findAll() {
		assertEquals(2, userRepository.findAll().size());
		assertEquals("Fan", userRepository.findByUsername("user").getFirstName());
	}

}
