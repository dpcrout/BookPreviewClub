package com.bookpreviewclub.service;

import java.util.ArrayList;
import java.util.List;

import com.bookpreviewclub.dao.YearBookDAO;
import com.bookpreviewclub.dto.YearBookDTO;

public class YearBookService {
	
	
	public List<YearBookDTO> getYearBookList()
	
	{
		
	String dbUrl = "jdbc:sqlserver://localhost;username=bpcuser2;password=bpc123!;databasename=BookPreviewClub";
	// SQL Query to Execute on table from the database.
	// what about more esoteric queries, should they be defined here as well?
	String query = "SELECT B.Title FROM dbo.Book as B WHERE (B.PublicationYear < 1990 and B.PublicationYear > 1979)";
		
		
	YearBookDAO bpcDAO = new YearBookDAO();
	List<YearBookDTO> yearBookList = new ArrayList<YearBookDTO>();
	yearBookList = bpcDAO.getYearBookList(dbUrl, query);
	return yearBookList;
	
	
	} 
	

}
