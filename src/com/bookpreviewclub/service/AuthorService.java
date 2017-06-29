package com.bookpreviewclub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookpreviewclub.dao.AuthorDAO;
import com.bookpreviewclub.dto.AuthorDTO;

@Service("authorService")
public class AuthorService 
{
	@Autowired
	AuthorDAO authorDao;
	
	public List<AuthorDTO> getAuthorList()
	{
		List<AuthorDTO> authorList = new ArrayList<AuthorDTO>();
		authorList = authorDao.getAll();
		return authorList;
	} 
}
