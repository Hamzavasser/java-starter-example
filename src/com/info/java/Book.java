package com.info.java;

public class Book {
	
	public String title;
	public String edition;
	public int pageCount;
	public boolean isOpen;
	
	public Book(String title, String edtion, int pageCount) {
		this.title = title;
		this.edition = edition;
		this.pageCount = pageCount;
	}
	public void open() {
		this.isOpen = true;
	}
	
	public void close() {
		this.isOpen = false;
	}

}
