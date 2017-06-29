package com.bookpreviewclub.view;

import java.util.List;

import com.bookpreviewclub.dto.YearBookDTO;

public class YearBookView {

	public void printYearBookDetails(List<YearBookDTO> yearBookList){

		for (int j = 0; j < yearBookList.size(); j++) {
											
			YearBookDTO yearBook = yearBookList.get(j);
			System.out.println("Title = " + yearBook.getTitle());
		}
	}
	
}
