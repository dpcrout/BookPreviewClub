package com.bookpreviewclub.controller;

import com.bookpreviewclub.dto.AuthorDTO;
import com.bookpreviewclub.service.AuthorService;
import com.bookpreviewclub.view.AuthorView;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//spring framework/bootstrap/eclipse neon
//will probably have more methods

@Controller
public class AuthorController
{ 
	//private AuthorDTO model;
	//private AuthorView view;
	
	@Autowired
	private AuthorService authorService;
	
		
	// list page
	@RequestMapping(value = "/authors", method = RequestMethod.GET)
	public String showAuthorList(Model model) 
	{
			//logger.debug("showAll()");
			model.addAttribute("authors", authorService.getAuthorList());
			return ("authorlist");
	}
	
}

