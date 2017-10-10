package com.bookpreviewclub.controller;

import com.bookpreviewclub.dto.YearBookDTO;
import com.bookpreviewclub.service.YearBookService;
import com.bookpreviewclub.view.YearBookView;
import java.util.List;

public class YearBookController {

		private YearBookDTO model;
		private YearBookView view;
	
		public YearBookController(YearBookDTO model, YearBookView view) {
			this.model = model;
			this.view = view;
		}
		
		public void getYearBookList(){
			YearBookService service = new YearBookService();
			List<YearBookDTO> yearBookList = service.getYearBookList();
			YearBookView view = new YearBookView();
			view.printYearBookDetails(yearBookList);
			
		}
}
