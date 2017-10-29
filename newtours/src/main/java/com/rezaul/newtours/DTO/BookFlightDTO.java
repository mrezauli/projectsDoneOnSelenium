package com.rezaul.newtours.DTO;

public class BookFlightDTO {

	private String passengersFirstName; 	
	private String passengersLastName; 	
	private String meal;
	private String cardType; 
	private String cardNumber; 	
	private String cardExpirationMonth;
	private String cardExpirationDay;
	private String cardFirstName; 	
	private String cardMiddleName; 	
	private String cardLastName;
	public String getPassengersFirstName() {
		return passengersFirstName;
	}
	public void setPassengersFirstName(String passengersFirstName) {
		this.passengersFirstName = passengersFirstName;
	}
	public String getPassengersLastName() {
		return passengersLastName;
	}
	public void setPassengersLastName(String passengersLastName) {
		this.passengersLastName = passengersLastName;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardExpirationMonth() {
		return cardExpirationMonth;
	}
	public void setCardExpirationMonth(String cardExpirationMonth) {
		this.cardExpirationMonth = cardExpirationMonth;
	}
	public String getCardExpirationDay() {
		return cardExpirationDay;
	}
	public void setCardExpirationDay(String cardExpirationDay) {
		this.cardExpirationDay = cardExpirationDay;
	}
	public String getCardFirstName() {
		return cardFirstName;
	}
	public void setCardFirstName(String cardFirstName) {
		this.cardFirstName = cardFirstName;
	}
	public String getCardMiddleName() {
		return cardMiddleName;
	}
	public void setCardMiddleName(String cardMiddleName) {
		this.cardMiddleName = cardMiddleName;
	}
	public String getCardLastName() {
		return cardLastName;
	}
	public void setCardLastName(String cardLastName) {
		this.cardLastName = cardLastName;
	}
	@Override
	public String toString() {
		return "BookFlightDTO [passengersFirstName=" + passengersFirstName + ", passengersLastName="
				+ passengersLastName + ", meal=" + meal + ", cardType=" + cardType + ", cardNumber=" + cardNumber
				+ ", cardExpirationMonth=" + cardExpirationMonth + ", cardExpirationDay=" + cardExpirationDay
				+ ", cardFirstName=" + cardFirstName + ", cardMiddleName=" + cardMiddleName + ", cardLastName="
				+ cardLastName + "]";
	}
	
	
}
