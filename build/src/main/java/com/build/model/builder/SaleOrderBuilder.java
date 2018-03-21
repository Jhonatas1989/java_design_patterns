package com.build.model.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.build.model.Client;
import com.build.model.OrderItem;
import com.build.model.SaleOrder;

/**
 * @author Jhonatas Oliveira
 *
 */
public class SaleOrderBuilder {

	SaleOrder instance;

	/**
	 * 
	 */
	public SaleOrderBuilder() {
		this.instance = new SaleOrder();
	}

	/**
	 * @param numberSaleOrder
	 * @return
	 */
	public SaleOrderBuilder withNumberSaleOrder(String numberSaleOrder) {
		this.instance.setNumberSaleOrder(numberSaleOrder);
		return this;
	}

	/**
	 * @param name
	 * @return
	 */
	public SaleOrderBuilder withVipClient(String name) {
		defineClient(name, true);
		return this;
	}

	/**
	 * @param name
	 * @return
	 */
	public SaleOrderBuilder withoutVipClient(String name) {
		defineClient(name, false);
		return this;
	}

	/**
	 * @param name
	 * @param vip
	 */
	private void defineClient(String name, boolean vip) {
		Client client = new Client();
		client.setName(name);
		client.setVip(true);
		this.instance.setClient(client);
	}

	/**
	 * @param nome
	 * @param valorUnitario
	 * @param quantidade
	 * @return
	 */
	public SaleOrderBuilder withItem(String name, String unitValue, Integer amount) {
		OrderItem item = new OrderItem();
		item.setName(name);
		item.setUnitValue(new BigDecimal(unitValue));
		item.setAmount(amount);

		if (this.instance.getOrdersItem() == null) {
			this.instance.setOrdersItem(new ArrayList<OrderItem>());
		}

		this.instance.getOrdersItem().add(item);

		return this;
	}

	/**
	 * @return
	 */
	public SaleOrder build() {
		if (this.instance.getNumberSaleOrder() == null) {
			throw new IllegalStateException("the number sale order is required");
		}
		return this.instance;
	}
}
