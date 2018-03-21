package com.build;

import com.build.model.SaleOrder;
import com.build.model.builder.SaleOrderBuilder;

/**
 * @author Jhonatas Oliveira
 *
 */
public class SystemSalesOrder {
	
	public static void main(String[] args) {

		SaleOrder saleOrder = new SaleOrderBuilder()
				.withNumberSaleOrder("1234567890")
				.withVipClient("John")
				.withItem("Hammer", "200", 2)
				.withItem("Drilling Machine", "300", 1)
				.build();

		System.out.println(saleOrder);
	}

}
