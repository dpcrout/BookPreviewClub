package com.bookpreviewclub.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookpreviewclub.dto.AuthorDTO;

public class AuthorRowMapper implements org.springframework.jdbc.core.RowMapper<AuthorDTO> 
{
	public AuthorRowMapper() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public AuthorDTO mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
	
		AuthorDTO author = new AuthorDTO();

		author.setAuthorID(rs.getInt("authorID"));
		author.setAuthorID(rs.getInt("genreID"));
		author.setCategory(rs.getString("category"));
		author.setPenName(rs.getString("penName"));
		author.setAuthorSite(rs.getString("authorWebSite"));
		
		
		return author;
	}

}
