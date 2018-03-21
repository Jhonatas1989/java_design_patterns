package com.build.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Jhonatas Oliveira
 *
 */

public class SaleOrder {

	private String numberSaleOrder;
	private Client client;
	private List<OrderItem> ordersItem;

	/**
	 * @return the numberSaleOrder
	 */
	public String getNumberSaleOrder() {
		return numberSaleOrder;
	}

	/**
	 * @param numberSaleOrder
	 *            the numberSaleOrder to set
	 */
	public void setNumberSaleOrder(String numberSaleOrder) {
		this.numberSaleOrder = numberSaleOrder;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the ordersItem
	 */
	public List<OrderItem> getOrdersItem() {
		return ordersItem;
	}

	/**
	 * @param ordersItem
	 *            the ordersItem to set
	 */
	public void setOrdersItem(List<OrderItem> ordersItem) {
		this.ordersItem = ordersItem;
	}

	/**
	 * @return total order value
	 */
	public BigDecimal getTotalOrderValue() {
		BigDecimal totalOrderValue = BigDecimal.ZERO;

		for (OrderItem item : ordersItem) {
			totalOrderValue = totalOrderValue.add(item.getUnitValue().multiply(new BigDecimal(item.getAmount())));
		}

		// if you are a VIP client, give a 4% discount
		if (client.isVip()) {
			totalOrderValue = totalOrderValue.multiply(new BigDecimal("0.96"));
		}
		return totalOrderValue;

	}

	@Override
	public String toString() {
		return "SaleOrder [numberSaleOrder=" + numberSaleOrder + ", client=" + client + ", ordersItem=" + ordersItem
				+ "]" + "\n" + "Total order value: " + this.getTotalOrderValue();
	}

}
