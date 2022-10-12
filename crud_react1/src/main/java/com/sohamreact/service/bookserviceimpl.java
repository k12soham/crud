package com.sohamreact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamreact.entity.books;
import com.sohamreact.repo.bookrepo;

@Service
public class bookserviceimpl implements bookservice{
	@Autowired
	private bookrepo bkrepo;
	
	@Override
	public List<books> getBooks() {
		// TODO Auto-generated method stub
		return bkrepo.findAll();
	}

	@Override
	public books addBook(books b) {
		// TODO Auto-generated method stub
		bkrepo.save(b);
		return b;
	}

	

	@Override
	public books getBookone(Long id) {
		// TODO Auto-generated method stub
		return bkrepo.findById(id).get();
		
	}

	

	@Override
	public books addBookone(books b, Long id) {
		// TODO Auto-generated method stub
		books bk= bkrepo.getById(id);
		bk.setName(b.getName());
		bk.setAuthor_name(b.getAuthor_name());
		bk.setPrice(b.getPrice());
		
		
		books updatebk = bkrepo.save(bk);
		return updatebk;
	}

	@Override
	public books deleteBookone(Long id) {
		// TODO Auto-generated method stub
		
		books bk= bkrepo.getById(id);
	  
		bkrepo.deleteById(id);
		return null;
	}




}
