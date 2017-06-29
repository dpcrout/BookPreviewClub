package com.bookpreviewclub.view;

import java.util.List;

import com.bookpreviewclub.dto.IndividualEmailDTO;

public class IndividualEmailView {

	public void printIndividualEmailDetails(List<IndividualEmailDTO> individualEmailList){

		for (int j = 0; j < individualEmailList.size(); j++) {
											
			IndividualEmailDTO individualEmail = individualEmailList.get(j);
			System.out.println("Last Name = " + individualEmail.getLastName());
			System.out.println("First Name = " + individualEmail.getFirstName());
			System.out.println("Email Address = " + individualEmail.getEmailAddress());
		}
	}
	
}
