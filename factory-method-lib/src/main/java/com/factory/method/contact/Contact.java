package com.factory.method.contact;

/**
 * @author Jhonatas Oliveira
 *
 */
public class Contact {
	public String name;
	public String email;

	/**
	 * @param name
	 * @param email
	 */
	public Contact(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
