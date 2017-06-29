package com.bookpreviewclub.view;

import com.bookpreviewclub.dto.EmailDTO;

public class EmailView {

		public void printEmailDetails(EmailDTO email){
			System.out.println("Email ID = " + email.getEmailID());
			System.out.println("Individual ID = " + email.getIndividualID());
			System.out.println("Email Address = " + email.getEmailAddress());
		}

	}

