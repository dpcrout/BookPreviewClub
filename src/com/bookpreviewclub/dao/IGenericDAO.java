package com.bookpreviewclub.dao;

import java.sql.SQLException;
import java.util.List;

/*
 * This is the root DAO Interface
 */
public interface IGenericDAO<E,K>
{
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	
	/**
	 * @param entity
	 * 
	 * GenericDao interface contains common methods used by multiple dao classes.
	 * Also, we are using Java generic concept in this interface. 
	 * E and K letters represent Model class type and primary key type, respectively. 
	 */
	
		//Basic CRUD Operations
	    public void add(E entity) ;
	    public void saveOrUpdate(E entity) ;
	    public void update(E entity) ;
	    public void remove(E entity);
	    public E find(K key);
	    public List<E> getAll() ;
	    public void create(List lst);
	    public Boolean insertRecords(Object obj) throws SQLException;
}
