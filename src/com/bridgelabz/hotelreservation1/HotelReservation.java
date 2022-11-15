package com.bridgelabz.hotelreservation1;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
	ArrayList<Hotels> hotelList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void addHotel() {
		System.out.println("Enter a Hotel name:");
		String hotelName = sc .next();
	    System.out.println("Enter number of days :");
	     int days = sc.nextInt();
		System.out.println("Enter rate for regular customer:");
		double regularCustomerRate = sc.nextDouble();
		hotelList.add(new Hotels(hotelName , regularCustomerRate));	
		display();
	}
	public void display() {
		System.out.println(hotelList);
	}
}
