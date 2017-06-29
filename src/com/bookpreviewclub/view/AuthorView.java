package com.bookpreviewclub.view;

import java.util.List;

import com.bookpreviewclub.dto.AuthorDTO;

public class AuthorView {
	//result set instead of author, use while loop < arraylist.size/length
	
	public void printAuthorDetails(List<AuthorDTO> authorList){

		for (int j = 0; j < authorList.size(); j++) {
										
			AuthorDTO author = authorList.get(j);
			System.out.println("Author ID = " + author.getAuthorID());
			System.out.println("Genre ID = " + author.getGenreID());
			System.out.println("Category = " + author.getCategory());
			System.out.println("Pen Name = " + author.getPenName());
			System.out.println("Author Site = " + author.getAuthorSite());
		}
	}
	
}
