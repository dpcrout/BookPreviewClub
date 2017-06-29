package com.bookpreviewclub.view;

import com.bookpreviewclub.dto.IndividualDTO;

public class IndividualView {
	//2/7/17
	//individual + email dto
	
	public void printIndividualDetails (IndividualDTO individual) {
		System.out.println("Individual ID = " + individual.getIndividualID());
		System.out.println("Birthdate = " + individual.getBirthDate());
		System.out.println("Last Name = " + individual.getLastName());
		System.out.println("First Name = " + individual.getFirstName());
		System.out.println("Gender = " + individual.getGender());
		
	}

}
