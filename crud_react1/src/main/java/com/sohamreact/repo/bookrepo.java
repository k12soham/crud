package com.sohamreact.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sohamreact.entity.books;


public interface bookrepo extends JpaRepository<books, Long> {

}
