package com.tap.models;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderItem {

	
	private int orderItemId;
	private int orderId;
	private int menuItemId;
	private int quantity;
	private double priceAtOrder;
	private Date createdAt;
	
	//Default constructor;

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
//	patameterized constructor

	public OrderItem(int orderItemId, int orderId, int menuItemId, int quantity, double priceAtOrder, Date createdAt) {
		super();
		this.orderItemId = orderItemId;
		this.orderId = orderId;
		this.menuItemId = menuItemId;
		this.quantity = quantity;
		this.priceAtOrder = priceAtOrder;
		this.createdAt = createdAt;
	}
//	Getters and setters

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(int menyItemId) {
		this.menuItemId = menyItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPriceAtOrder() {
		return priceAtOrder;
	}

	public void setPriceAtOrder(double priceAtOrder) {
		this.priceAtOrder = priceAtOrder;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt1(Date timestamp) {
		this.createdAt = timestamp;
	}
	
	
//	for debugging

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", orderId=" + orderId + ", menuItemId=" + menuItemId
				+ ", quantity=" + quantity + ", priceAtOrder=" + priceAtOrder + ", createdAt=" + createdAt + "]";
	}

	public void setCreatedAt(Timestamp timestamp) {
		// TODO Auto-generated method stub
		
	}
	
}
