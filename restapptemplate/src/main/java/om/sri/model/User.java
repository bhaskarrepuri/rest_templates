package om.sri.model;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User implements UserDetails {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "userid", unique = true, nullable = false, length = 45)
	private String userId;

	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@JsonIgnore
	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "name", nullable = false)
	private String firstName;

	@Column(name = "surname", nullable = false)
	private String lastName;

	@Column(name = "fathername", nullable = false)
	private String fathername;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", length = 10)
	private Date dob;

	@Column(name = "email")
	private String email;

	@Column(name = "phonenumber")
	private Long phoneNumber;

	@Column(name = "landnumber")
	private Long landnumber;

	@Column(name = "role", nullable = false)
	private String role;

	@Column(name = "village", nullable = false)
	private String village;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "createdby", nullable = true)
	private Integer createdby;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", length = 10)
	private Date createddate;

	@Column(name = "updatedby", nullable = true)
	private Integer updatedby;

	@Column(name = "status")
	private String status;

	@Column(name = "enabled")
	private boolean enabled;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateddate", length = 10)
	private Date lastPasswordResetDate;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_authority", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
	private List<Authority> authorities;

	public User(String userId, String username, String password, String firstName, String lastName, String fathername,
			String gender, String email, Date dob, long phoneNumber, long landnumber, String role, String village,
			String address, Integer createdby, Integer updatedby, String status, boolean enabled,
			List<Authority> authorities) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fathername = fathername;
		this.gender = gender;
		this.dob = new Date();
		this.email = email;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.landnumber = landnumber;
		this.role = role;
		this.village = village;
		this.address = address;
		this.createdby = createdby;
		this.createddate = new Date();
		this.updatedby = updatedby;
		this.status = status;
		this.enabled = enabled;
		this.lastPasswordResetDate = new Date();
		this.authorities = authorities;
	}

	public void setPassword(String password) {
		Timestamp now = new Timestamp(DateTime.now().getMillis());
		this.setLastPasswordResetDate(now);
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	

}
