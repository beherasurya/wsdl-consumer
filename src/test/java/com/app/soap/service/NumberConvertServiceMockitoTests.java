package com.app.soap.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.soap.model.Number;
import com.app.soap.repo.NumberRepository;

@SpringBootTest(classes = (NumberConvertServiceMockitoTests.class))
public class NumberConvertServiceMockitoTests {

	
	@Mock
	NumberRepository numberRepo;
	@InjectMocks
	NumberConversionServiceImpl service ;
	

	@Test
	@DisplayName("Number To Word ")
     void numberToWord() {

		Number number = new Number(1,"ten",10);
		when(numberRepo.save(number)).thenReturn(number);
		
		assertEquals(number,service.numberToWord(10));
		
	}
	
	@Test
	@DisplayName("Fetch All Words")
	void getAllWord() {
		List<Number> numbers = new ArrayList<Number>();
		
		numbers.add(new Number(1,"hundred",100));
		numbers.add(new Number(2,"twenty",20));

		when(numberRepo.findAll()).thenReturn(numbers);
		assertEquals(numbers, service.getAllConvertedWords());
	}
	@Disabled
	@Test
	@DisplayName("Get Word By ID")
	void getWordById() {
		Number number = new Number(1,"twenty",20);
		int id=1;
		
		when(numberRepo.findById(id).get()).thenReturn(number);		
		assertEquals(number, service.getWordById(id));
	}
	
	
	

}
