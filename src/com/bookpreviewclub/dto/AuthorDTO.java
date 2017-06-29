package com.bookpreviewclub.dto;

public class AuthorDTO {
	
	private int authorID;
	private int genreID;
	private String category;
	private String penName;
	private String authorSite;
	  
	
	public int getAuthorID() {
		return authorID;
	}


	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}


	public int getGenreID() {
		return genreID;
	}


	public void setGenreID(int genreID) {
		this.genreID = genreID;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getPenName() {
		return penName;
	}


	public void setPenName(String penName) {
		this.penName = penName;
	}


	public String getAuthorSite() {
		return authorSite;
	}


	public void setAuthorSite(String authorSite) {
		this.authorSite = authorSite;
	}


}
