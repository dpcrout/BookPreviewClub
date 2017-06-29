package com.bookpreviewclub.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookpreviewclub.dto.AuthorDTO;
import com.bookpreviewclub.dto.BookDTO;

public class BookRowMapper implements org.springframework.jdbc.core.RowMapper<BookDTO> 
{
	public BookRowMapper() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
	
		BookDTO book = new BookDTO();
    	book.setBookID(rs.getInt("bookID"));
    	book.setAuthorID(rs.getInt("authorID"));
    	book.setGenreID(rs.getInt("genreID"));
    	book.setPublisher(rs.getString("publisher"));
    	book.setPublicationYear(rs.getInt("publicationYear"));
    	book.setIsbn(rs.getInt("isbn"));
    	book.setTitle(rs.getString("title"));
    	book.setAsin(rs.getInt("asin"));
    	book.setCoverImage(rs.getString("coverImage"));
    	book.setDownloadLink(rs.getString("downloadLink"));
    	book.setSeries(rs.getString("series"));
    	book.setFormat(rs.getString("format"));
    	book.setSynopsis(rs.getString("synopsis"));
    	book.setSource(rs.getString("source"));
    	book.setPages(rs.getInt("pages"));
    	
    
    	return(book);	}

}
