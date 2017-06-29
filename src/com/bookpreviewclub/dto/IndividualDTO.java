package com.bookpreviewclub.dto;

public class IndividualDTO {
	
	private int individualID;
	//best way to approach date? class?
	private int birthDate;
	private String lastName;
	private String firstName;
	private String gender;
	
	
	public int getIndividualID() {
		return individualID;
	}
	public void setIndividualID(int individualID) {
		this.individualID = individualID;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int date) {
		this.birthDate = date;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}
