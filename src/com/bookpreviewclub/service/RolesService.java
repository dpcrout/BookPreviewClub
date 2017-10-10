package com.bookpreviewclub.service;

import com.bookpreviewclub.dao.RolesDAO;
import com.bookpreviewclub.dto.RolesDTO;

public class RolesService {
	
	
	public RolesDTO getRoles()
	
	{
		
	String dbUrl = "jdbc:sqlserver://localhost;username=bpcuser2;password=bpc123!;databasename=BookPreviewClub";
	// SQL Query to Execute on table from the database.
	String query = "Select * FROM UserRoles";
		
		
	RolesDAO bpcDAO = new RolesDAO();
	RolesDTO roles;
	roles = bpcDAO.getRoles(dbUrl, query);
	return roles;
	
	
	} 
	

}
