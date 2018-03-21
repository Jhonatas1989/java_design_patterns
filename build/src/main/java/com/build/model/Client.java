package com.build.model;

/**
 * @author Jhonatas Oliveira
 *
 */
public class Client {

	private String name;
	private boolean vip;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vip
	 */
	public boolean isVip() {
		return vip;
	}

	/**
	 * @param vip
	 *            the vip to set
	 */
	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", vip=" + vip + "]";
	}

}
