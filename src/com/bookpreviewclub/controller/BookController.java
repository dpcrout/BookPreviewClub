package com.bookpreviewclub.controller;

import java.util.List;

import com.bookpreviewclub.dto.BookDTO;
import com.bookpreviewclub.service.BookService;
import com.bookpreviewclub.view.BookView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController 
{ 
	//instantiates service object when the application starts, no need to instantiate via java
	@Autowired BookService bookService;
	
	
	// list page
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String showBookList(Model model)
	{
		//logger.debug("showAll()");
		model.addAttribute("books", bookService.getBookList());
		return("booklist");
	}
	
	@RequestMapping(value = "/books/horror", method = RequestMethod.GET)
	public String showHorrorBookList(Model model)
	{
		//logger.debug("showALL()");
		model.addAttribute("books", bookService.getHorrorBookList());
		return("horrorbooklist");
	}
	
	@RequestMapping(value = "/books/comedy", method = RequestMethod.GET)
	public String showComedyBookList(Model model)
	{
		//logger.debug("showALL()");
		model.addAttribute("books", bookService.getComedyBookList());
		return("comedybooklist");
	}
	
	@RequestMapping(value = "/books/romance", method = RequestMethod.GET)
	public String showRomanceBookList(Model model)
	{
		//logger.debug("showALL()");
		model.addAttribute("books", bookService.getRomanceBookList());
		return("romancebooklist");
	}
	
	@RequestMapping(value = "/books/science-fiction", method = RequestMethod.GET)
	public String showScienceFictionBookList(Model model)
	{
		//logger.debug("showALL()");
		model.addAttribute("books", bookService.getScienceFictionBookList());
		return("sciencefictionbooklist");
	}
	
	
	

	
	

	
}

