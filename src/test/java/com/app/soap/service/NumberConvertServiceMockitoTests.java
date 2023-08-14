package com.app.soap.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.spel.ast.OpAnd;

import com.app.soap.model.Number;
import com.app.soap.repo.NumberRepository;

@SpringBootTest(classes = {NumberConvertServiceMockitoTests.class})
public class NumberConvertServiceMockitoTests {

	
	@Mock
	NumberRepository numberRepo;
	@InjectMocks
	NumberConversionServiceImpl service ;
	
	
	
	@Test
	@DisplayName("Fetch All Words")
	void test_getAllWord() {
		List<Number> numbers = new ArrayList<Number>();
		
		numbers.add(new Number(1,"hundred",100));
		numbers.add(new Number(2,"twenty",20));

		when(numberRepo.findAll()).thenReturn(numbers);
		assertEquals(numbers, service.getAllConvertedWords());
	}
	

	
	@Test
	@DisplayName("Delete Word")
	void test_deleteWord() {
		
		Number number = new Number(1,"twenty",20);
		service.deleteWordById(number.getId());
		
		verify(numberRepo, times(1)).deleteById(number.getId());
	}
	
	@Test
	@DisplayName("Convert number to word")
	void test_convertNumberToWord() {
		
		assertEquals("ten", service.convertNumberToWord(10).trim());
	}
	


}
