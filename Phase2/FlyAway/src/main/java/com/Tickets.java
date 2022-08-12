package com;

import java.util.Date;

public class Tickets {
	private int OrderNumber;
	private String From_place;
	private String To_place;
	private Date Journey_Date;
	private String Quantity;
	private String Airline;
	private String Name;
	private String Address;
	private String Mobile;
	private String Age;
	private String Price;
	private String Time;
	private String Total_Price;
	public Tickets(String from_place, String to_place, Date journey_Date, String quantity, String airline, String name,
			String address, String mobile, String age, String price, String time, String total_Price) {
		
		From_place = from_place;
		To_place = to_place;
		Journey_Date = journey_Date;
		Quantity = quantity;
		Airline = airline;
		Name = name;
		Address = address;
		Mobile = mobile;
		Age = age;
		Price = price;
		Time = time;
		Total_Price = total_Price;
	}
	public int getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		OrderNumber = orderNumber;
	}
	public String getFrom_place() {
		return From_place;
	}
	public void setFrom_place(String from_place) {
		From_place = from_place;
	}
	public String getTo_place() {
		return To_place;
	}
	public void setTo_place(String to_place) {
		To_place = to_place;
	}
	public Date getJourney_Date() {
		return Journey_Date;
	}
	public void setJourney_Date(Date journey_Date) {
		Journey_Date = journey_Date;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getAirline() {
		return Airline;
	}
	public void setAirline(String airline) {
		Airline = airline;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(String total_Price) {
		Total_Price = total_Price;
	}
	
	
	
	
	
}
