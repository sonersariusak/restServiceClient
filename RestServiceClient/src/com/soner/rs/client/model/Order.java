package com.soner.rs.client.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {

	private int orderNumber;
	private String orderName;
	private String orderBuyer;
	private float orderAmount;

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderBuyer() {
		return orderBuyer;
	}

	public void setOrderBuyer(String orderBuyer) {
		this.orderBuyer = orderBuyer;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

}
