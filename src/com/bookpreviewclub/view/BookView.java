package com.bookpreviewclub.view;

import java.util.List;

import com.bookpreviewclub.dto.BookDTO;

public class BookView {
	public void printBookDetails(List<BookDTO> bookList){

		for (int j = 0; j < bookList.size(); j++) {

		BookDTO book = bookList.get(j);
		System.out.println("Book ID = " + book.getBookID());
		System.out.println("Author ID = " + book.getAuthorID());
		System.out.println("Genre ID = " + book.getGenreID());
    	System.out.println("Publisher = " + book.getPublisher());
    	System.out.println("Publication Year = " + book.getPublicationYear());
    	System.out.println("ISBN = " + book.getIsbn());
    	System.out.println("Title = " + book.getTitle());
    	System.out.println("ASIN = " + book.getAsin());
    	System.out.println("Cover Image = " + book.getCoverImage());
    	System.out.println("Download Link = " + book.getDownloadLink());
		}

	}
}
