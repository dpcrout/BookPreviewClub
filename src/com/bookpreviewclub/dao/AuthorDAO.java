package com.bookpreviewclub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.bookpreviewclub.config.MvcInitializer;
import com.bookpreviewclub.dto.AuthorDTO;


@Repository
public class AuthorDAO implements IAuthorDAO
{
	
	AnnotationConfigWebApplicationContext context = MvcInitializer.getContext();
	
	public List<AuthorDTO> getAll() 
	{
		JdbcTemplate jdbcTemplateBean = (JdbcTemplate)context.getBean("getJdbcTemplate");
		String SQL = "Select * FROM dbo.Author";
	    return jdbcTemplateBean.query( SQL, new AuthorRowMapper());
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
