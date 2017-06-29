package com.bookpreviewclub.controller;

import com.bookpreviewclub.dto.IndividualEmailDTO;
import com.bookpreviewclub.service.IndividualEmailService;
import com.bookpreviewclub.view.IndividualEmailView;
import java.util.List;

public class IndividualEmailController {

		private IndividualEmailDTO model;
		private IndividualEmailView view;
	
		public IndividualEmailController(IndividualEmailDTO model, IndividualEmailView view) {
			this.model = model;
			this.view = view;
		}
		
		public void getIndividualEmailList(){
			IndividualEmailService service = new IndividualEmailService();
			List<IndividualEmailDTO> individualEmailList = service.getIndividualEmailList();
			IndividualEmailView view = new IndividualEmailView();
			view.printIndividualEmailDetails(individualEmailList);
			
		}
}
