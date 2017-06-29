package com.bookpreviewclub.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.bookpreviewclub.config.MvcInitializer;
import com.bookpreviewclub.dto.BookDTO;
import com.bookpreviewclub.dto.GenreBooksDTO;

@Repository
public class BookDAO implements IBookDAO
{
	AnnotationConfigWebApplicationContext context = MvcInitializer.getContext();
	
	public List<BookDTO> getAll() 
	{
		JdbcTemplate jdbcTemplateBean = (JdbcTemplate)context.getBean("getJdbcTemplate");
		String SQL = "Select * FROM dbo.Book";
	    return jdbcTemplateBean.query( SQL, new BookRowMapper());
	}
	
	public List<GenreBooksDTO> getHorror()
	{
		JdbcTemplate jdbcTemplateBean = (JdbcTemplate)context.getBean("getJdbcTemplate");
		String SQL = "SELECT B.Title, I.FirstName, I.LastName, B.PublicationYear FROM dbo.Book as B, dbo.Individuals as I, dbo.IndividualToAuthorXWalk as X WHERE I.IndividualID = X.IndividualID and B.AuthorID = X.AuthorID and (B.GenreID like '1')";
		return jdbcTemplateBean.query( SQL, new GenreBooksRowMapper());
	}
	
	public List<GenreBooksDTO> getComedy()
	{
		JdbcTemplate jdbcTemplateBean = (JdbcTemplate)context.getBean("getJdbcTemplate");
		String SQL = "SELECT B.Title, I.FirstName, I.LastName, B.PublicationYear FROM dbo.Book as B, dbo.Individuals as I, dbo.IndividualToAuthorXWalk as X WHERE I.IndividualID = X.IndividualID and B.AuthorID = X.AuthorID and (B.GenreID like '2')";
		return jdbcTemplateBean.query( SQL, new GenreBooksRowMapper());
	}
	
	public List<GenreBooksDTO> getRomance()
	{
		JdbcTemplate jdbcTemplateBean = (JdbcTemplate)context.getBean("getJdbcTemplate");
		String SQL = "SELECT B.Title, I.FirstName, I.LastName, B.PublicationYear FROM dbo.Book as B, dbo.Individuals as I, dbo.IndividualToAuthorXWalk as X WHERE I.IndividualID = X.IndividualID and B.AuthorID = X.AuthorID and (B.GenreID like '3')";
		return jdbcTemplateBean.query( SQL, new GenreBooksRowMapper());
	}
	
	public List<GenreBooksDTO> getSciFi()
	{
		JdbcTemplate jdbcTemplateBean = (JdbcTemplate)context.getBean("getJdbcTemplate");
		String SQL = "SELECT B.Title, I.FirstName, I.LastName, B.PublicationYear FROM dbo.Book as B, dbo.Individuals as I, dbo.IndividualToAuthorXWalk as X WHERE I.IndividualID = X.IndividualID and B.AuthorID = X.AuthorID and (B.GenreID like '4')";
		return jdbcTemplateBean.query( SQL, new GenreBooksRowMapper());
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
	public void create(List lst) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean insertRecords(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
