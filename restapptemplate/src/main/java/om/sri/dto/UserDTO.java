package om.sri.dto;

/**
 * Created by fan.jin on 2016-10-15.
 */

public class UserDTO {

	private Integer id;

	private String firstName;

	private String lastName;

	private String fathername;

	private String username;

	private String password;

	private String email;

	private Double phonenumber;

	private String dob;

	private Double landnumber;

	private String village;

	private String address;

	private String role;

	private Integer createdby;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Double phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Double getLandnumber() {
		return landnumber;
	}

	public void setLandnumber(Double landnumber) {
		this.landnumber = landnumber;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", fathername=" + fathername
				+ ", username=" + username + ", password=" + password + ", email=" + email + ", phonenumber="
				+ phonenumber + ", dob=" + dob + ", landnumber=" + landnumber + ", village=" + village + ", address="
				+ address + ", role=" + role + ", createdby =" + createdby + "]";
	}

}
