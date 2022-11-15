package com.bridgelabz.hotelreservation1;

public class Hotels {
	
	private String hotelName;
	private double regularCustomerRate;
	
	public Hotels(String hotelName, double regularCustomerRate) {
		super();
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(double regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}

	@Override
	public String toString() {
		return "Hotels [hotelName=" + hotelName + ", regularCustomerRate=" + regularCustomerRate + "]";
	}
}