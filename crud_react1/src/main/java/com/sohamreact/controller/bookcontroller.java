package com.sohamreact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sohamreact.entity.books;
import com.sohamreact.service.bookservice;




@RestController
@CrossOrigin
public class bookcontroller {
	
	@Autowired
	private bookservice br;
	
	
	@GetMapping("/books")
	public List<books> getBooks() {
		System.out.println("ttt");
		return this.br.getBooks();
	}
	
	@GetMapping("/books/{id}")
	public books getBookone(@PathVariable Long  id) {
		return this.br.getBookone(id);
	}
	

	
	@PostMapping("/books")
	public books addBook(@RequestBody books b) {
		
		return this.br.addBook(b);

	}
	
	@PutMapping("/books/{id}")
	public books addBookone(@PathVariable Long  id ,@RequestBody books b) {
		
		return this.br.addBookone(b,id);

	}
	
	@DeleteMapping("/books/{id}")
	public books deleteBookone(@PathVariable Long  id ) {
		
		return this.br.deleteBookone(id);

	}
	
	
	
	
	
}
