package com.bookpreviewclub.service;

import java.util.ArrayList;
import java.util.List;

import com.bookpreviewclub.dao.IndividualEmailDAO;
import com.bookpreviewclub.dto.IndividualEmailDTO;

public class IndividualEmailService {
	
	
	public List<IndividualEmailDTO> getIndividualEmailList()
	
	{
		
	String dbUrl = "jdbc:sqlserver://localhost;username=bpcuser2;password=bpc123!;databasename=BookPreviewClub";
	// SQL Query to Execute on table from the database.
	// what about more esoteric queries, should they be defined here as well?
	String query = "SELECT I.LastName, I.FirstName, E.EmailAddress FROM dbo.Individuals as I, dbo.Email as E WHERE I.IndividualID = E.IndividualID";
		
		
	IndividualEmailDAO bpcDAO = new IndividualEmailDAO();
	List<IndividualEmailDTO> individualEmailList = new ArrayList<IndividualEmailDTO>();
	individualEmailList = bpcDAO.getIndividualEmailList(dbUrl, query);
	return individualEmailList;
	
	
	} 
	

}
