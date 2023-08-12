package com.app.soap.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NumberConvertServiceTests {

	@Autowired
	NumberConvertService service;
	
	@Disabled
	@Test
	@DisplayName("Number To Word Test")
    void numberToWord() {
		
		System.out.println(service.numberToWord(11));
		assertEquals("eleven", service.numberToWord(11));
	}
	
	

}
