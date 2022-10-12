package com.sohamreact.service;

import java.util.List;

import com.sohamreact.entity.books;


public interface bookservice {
	
	public List<books> getBooks();

	
	public books addBook(books b);


	public books getBookone(Long id);


	public books addBookone(books b, Long id);


	public books deleteBookone(Long id);
}
