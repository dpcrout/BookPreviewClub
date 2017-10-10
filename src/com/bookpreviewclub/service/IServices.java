package com.bookpreviewclub.service;

public interface IServices 
{
	public void unMarshalObject( Object obj, String strComponentType );
	public void pushData(Object obj);
	public void pullData(Object obj);
	public void synchronizeData(Object obj1, Object  obj2);
}
