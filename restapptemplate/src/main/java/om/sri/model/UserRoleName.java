package om.sri.model;

public enum UserRoleName {
	ROLE_USER(1, "ROLE_USER"), ROLE_ADMIN(2, "ROLE_ADMIN"), ROLE_OWNER(3, "ROLE_OWNER");

	int id;

	String vaule;

	UserRoleName(int id, String value) {
		this.id = id;
		this.vaule = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVaule() {
		return vaule;
	}

	public void setVaule(String vaule) {
		this.vaule = vaule;
	}

	public static UserRoleName getStatusByValue(String value) {
		UserRoleName c = null;
		for (UserRoleName customerStatus : UserRoleName.values()) {
			if (customerStatus.getVaule().equals(value))
				c = customerStatus;
		}
		return c;
	}

}
