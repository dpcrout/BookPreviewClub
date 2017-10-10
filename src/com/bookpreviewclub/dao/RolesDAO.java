package com.bookpreviewclub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookpreviewclub.dto.RolesDTO;

public class RolesDAO implements IRolesDAO
{

	public RolesDTO getRoles (String dbUrl, String query)
	{
		ResultSet rs = null;
		RolesDTO roles = new RolesDTO();
		try {

		// This instantiates what JDBC Driver will be used for the connection. The Class SQLServerDriver is loaded from the sqljdbc42.jar file located in the library	
		
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//Gets a Database Connection, based on the defined Connection URL
		Connection con = DriverManager.getConnection (dbUrl);
		
		// A Statement Object is used for sending SQL Statements to the database
		Statement stmt = con.createStatement();
		
		
		// The query is then executed, and the results are stored in a Result Set Object 
		rs = stmt.executeQuery(query);

		
	    while (rs.next()) {
	    	//array list
	    	roles.setUserRoleID(rs.getInt("UserRoleID"));
	    	roles.setUserID(rs.getInt("UserID"));
	    	roles.setRoleID(rs.getInt("RoleID"));
	    	
	    }

		// Very important to close the connections
		con.close();
		} //end try
		
	
		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}

		catch(SQLException e) {
		e.printStackTrace();
		}
		
		return roles;	
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
