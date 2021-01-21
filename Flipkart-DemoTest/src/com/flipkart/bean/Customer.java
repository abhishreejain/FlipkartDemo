package com.flipkart.bean;

public class Customer {
	
	private int customerID;
	private String customerName;
	private String address;
	/**
	 * @return the customerID
	 */
	public int getCustomerId() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerId(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}
