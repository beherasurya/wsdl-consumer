package com.app.soap.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.soap.model.Number;
import com.app.soap.repo.NumberRepository;
import com.dataaccess.webservicesserver.NumberConversion;

@Service
public class NumberConversionServiceImpl implements NumberConvertService{

	@Autowired
	NumberRepository numberRepo;
	NumberConversion conversion = new NumberConversion();
	
	@Override
	public String numberToWord(int number) {

	String convertedWord = conversion.getNumberConversionSoap().numberToWords(BigInteger.valueOf(number));
	Number num = new Number();
	
	num.setConvertedWord(convertedWord);
	numberRepo.save(num);
	
	return convertedWord;	
	}

	@Override
	public List<Number> getAllConvertedWords() {

		List<Number> allConvertedWords = numberRepo.findAll();
		return allConvertedWords;
	}

	

	
}
