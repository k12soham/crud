package com.sohamreact.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class books {
@Id
private long id;
private String name;
private String author_name;
private long price;


public books() {
	super();
	// TODO Auto-generated constructor stub
}


public books(long id, String name, String author_name, long price) {
	super();
	this.id = id;
	this.name = name;
	this.author_name = author_name;
	this.price = price;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAuthor_name() {
	return author_name;
}


public void setAuthor_name(String author_name) {
	this.author_name = author_name;
}


public long getPrice() {
	return price;
}


public void setPrice(long price) {
	this.price = price;
}


@Override
public String toString() {
	return "books [id=" + id + ", name=" + name + ", author_name=" + author_name + ", price=" + price + "]";
}




}
