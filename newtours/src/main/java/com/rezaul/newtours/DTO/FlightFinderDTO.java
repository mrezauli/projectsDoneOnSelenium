package com.rezaul.newtours.DTO;

public class FlightFinderDTO {

	private String passengers; 	
	private String departingFrom; 	
	private String onMonth;
	private String onDay; 
	private String arrivingIn; 	
	private String returningMonth;
	private String returningDay;
	private String airline;
	
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getDepartingFrom() {
		return departingFrom;
	}
	public void setDepartingFrom(String departingFrom) {
		this.departingFrom = departingFrom;
	}
	public String getOnMonth() {
		return onMonth;
	}
	public void setOnMonth(String onMonth) {
		this.onMonth = onMonth;
	}
	public String getOnDay() {
		return onDay;
	}
	public void setOnDay(String onDay) {
		this.onDay = onDay;
	}
	public String getArrivingIn() {
		return arrivingIn;
	}
	public void setArrivingIn(String arrivingIn) {
		this.arrivingIn = arrivingIn;
	}
	
	
	public String getReturningMonth() {
		return returningMonth;
	}
	public void setReturningMonth(String returningMonth) {
		this.returningMonth = returningMonth;
	}
	public String getReturningDay() {
		return returningDay;
	}
	public void setReturningDay(String returningDay) {
		this.returningDay = returningDay;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	@Override
	public String toString() {
		return "FlightFinderDTO [passengers=" + passengers + ", departingFrom=" + departingFrom + ", onMonth=" + onMonth
				+ ", onDay=" + onDay + ", arrivingIn=" + arrivingIn + ", returningMonth=" + returningMonth
				+ ", returningDay=" + returningDay + ", airline=" + airline + "]";
	}
	
	
	
	
	
}
