package com.bookpreviewclub.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookpreviewclub.dto.GenreBooksDTO;

public class GenreBooksRowMapper implements org.springframework.jdbc.core.RowMapper<GenreBooksDTO> 
{
	public GenreBooksRowMapper() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public GenreBooksDTO mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
	
		GenreBooksDTO book = new GenreBooksDTO();
    	book.setTitle(rs.getString("title"));
    	book.setFirstName(rs.getString("firstName"));
    	book.setLastName(rs.getString("lastName"));
    	book.setPublicationYear(rs.getInt("publicationYear"));
 
    	return(book);	
    }

}
