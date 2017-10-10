package com.bookpreviewclub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookpreviewclub.dto.IndividualEmailDTO;

public class IndividualEmailDAO 
{
	
	public List<IndividualEmailDTO> getIndividualEmailList(String dbUrl, String query) {
		
		ResultSet rs = null;
		List<IndividualEmailDTO> individualEmailList = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection con = DriverManager.getConnection (dbUrl);
			Statement stmt = con.createStatement();

		rs = stmt.executeQuery(query);

		individualEmailList = new ArrayList<IndividualEmailDTO>();
		
	    while (rs.next()) {
	    	IndividualEmailDTO individualEmail = new IndividualEmailDTO();
	    	individualEmail.setLastName(rs.getString("LastName"));
	    	individualEmail.setFirstName(rs.getString("FirstName"));
	    	individualEmail.setEmailAddress(rs.getString("EmailAddress"));
	    	individualEmailList.add(individualEmail);
	    }
	  
		con.close();
		}
	    
		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}

		catch(SQLException e) {
		e.printStackTrace();
		}
		
	    return individualEmailList;
	    
	}
	
}
