package com.app.soap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.soap.model.Number;
import com.app.soap.service.NumberConvertService;

@RestController
@RequestMapping("/api")
public class NumberConvertController {

	@Autowired
	NumberConvertService service;
	
	@GetMapping("/convert/{number}")
	public ResponseEntity<String> convertNumberToWord(@PathVariable int number){
		
		String convertedWord = service.numberToWord(number);
		return new ResponseEntity<String>(convertedWord, HttpStatus.OK);
	}
	
	@GetMapping("/words")
	public ResponseEntity<List<Number>> getAllWords(){
		
		List<Number> allWords = service.getAllConvertedWords();
		return new ResponseEntity<List<Number>>(allWords, HttpStatus.OK);
	}
	
}
