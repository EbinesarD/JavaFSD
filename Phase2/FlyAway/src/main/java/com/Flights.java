package com;
import java.util.Date;
public class Flights {
	private int ID;
	private String From_place;
	private String To_place;
	private int Airline_ID;
	private double Price;
	private String Airline;
	private Date Date;
	private String Time;
	private String Route;
	
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
	public int getAirline_ID() {
		return Airline_ID;
	}
	public void setAirline_ID(int airline_ID) {
		Airline_ID = airline_ID;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getAirline() {
		return Airline;
	}
	public void setAirline(String airline) {
		Airline = airline;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getRoute() {
		return Route;
	}
	public void setRoute(String route) {
		Route = route;
	}

	
	

}
