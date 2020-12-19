package om.sri.common;

public enum Prefix {

	CUSTOMER("CUS_"), DEPOSITOR("DEP_"), USER("USR_"), FINANCE("FIN_"), OUT("OUT_");

	String prefix;

	Prefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @param prefix
	 *            the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
