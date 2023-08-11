package com.app.soap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "number")
public class Number {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String convertedWord;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConvertedWord() {
		return convertedWord;
	}
	public void setConvertedWord(String convertedWord) {
		this.convertedWord = convertedWord;
	}
	
	
}
