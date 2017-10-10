package com.bookpreviewclub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookpreviewclub.dao.BookDAO;
import com.bookpreviewclub.dto.BookDTO;
import com.bookpreviewclub.dto.GenreBooksDTO;

@Service
public class BookService 
{
	@Autowired
	BookDAO bookDao;
	
	public List<BookDTO> getBookList()
	{
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		bookList = bookDao.getAll();
		return bookList;
	} 
	
	public List<GenreBooksDTO> getHorrorBookList()
	{
		List<GenreBooksDTO> horrorbooklist = new ArrayList<GenreBooksDTO>();
		horrorbooklist = bookDao.getHorror();
		return horrorbooklist;
	}
	
	public List<GenreBooksDTO> getComedyBookList()
	{
		List<GenreBooksDTO> comedybooklist = new ArrayList<GenreBooksDTO>();
		comedybooklist = bookDao.getComedy();
		return comedybooklist;
	}
	
	public List<GenreBooksDTO> getRomanceBookList()
	{
		List<GenreBooksDTO> romancebooklist = new ArrayList<GenreBooksDTO>();
		romancebooklist = bookDao.getRomance();
		return romancebooklist;
	}

	
	public List<GenreBooksDTO> getScienceFictionBookList()
	{
		List<GenreBooksDTO> sciencefictionbooklist = new ArrayList<GenreBooksDTO>();
		sciencefictionbooklist = bookDao.getSciFi();
		return sciencefictionbooklist;
	}
	

	
}
	
