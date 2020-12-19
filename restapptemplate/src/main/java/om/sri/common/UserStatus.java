package om.sri.common;

public enum UserStatus {

	ACTIVE("A", "ACTIVE"), INACTIVE("I", "INACTIVE");

	String status;

	String vaule;

	UserStatus(String status, String value) {
		this.status = status;
		this.vaule = value;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the vaule
	 */
	public String getVaule() {
		return vaule;
	}

	/**
	 * @param vaule the vaule to set
	 */
	public void setVaule(String vaule) {
		this.vaule = vaule;
	}

	public static UserStatus getStatusByValue(String value) {
		UserStatus c = null;
		for (UserStatus customerStatus : UserStatus.values()) {
			if (customerStatus.getVaule().equals(value))
				c = customerStatus;
		}
		return c;
	}
}
