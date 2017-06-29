
package com.bookpreviewclub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookpreviewclub.dto.YearBookDTO;

public class YearBookDAO implements IYearBookDAO{
	
	public List<YearBookDTO> getYearBookList(String dbUrl, String query) {
		
		ResultSet rs = null;
		List<YearBookDTO> yearBookList = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection con = DriverManager.getConnection (dbUrl);
			Statement stmt = con.createStatement();

		rs = stmt.executeQuery(query);

		yearBookList = new ArrayList<YearBookDTO>();
		
	    while (rs.next()) {
	    	YearBookDTO yearBook = new YearBookDTO();
	    	yearBook.setTitle(rs.getString("Title"));
	    	yearBookList.add(yearBook);
	    }
	  
		con.close();
		}
	    
		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}

		catch(SQLException e) {
		e.printStackTrace();
		}
		
	    return yearBookList;
	    
	}

	@Override
	public void add(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object find(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(List lst) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean insertRecords(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
