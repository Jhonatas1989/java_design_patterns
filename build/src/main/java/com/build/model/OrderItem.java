package com.build.model;

import java.math.BigDecimal;

/**
 * @author Jhonatas Oliveira
 *
 */
public class OrderItem {

	private String name;
	private Integer amount;
	private BigDecimal unitValue;

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
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	/**
	 * @return the unitValue
	 */
	public BigDecimal getUnitValue() {
		return unitValue;
	}

	/**
	 * @param unitValue
	 *            the unitValue to set
	 */
	public void setUnitValue(BigDecimal unitValue) {
		this.unitValue = unitValue;
	}

	@Override
	public String toString() {
		return "OrderItem [name=" + name + ", amount=" + amount + ", unitValue=" + unitValue + "]";
	}

}
