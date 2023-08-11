package com.app.soap.service;

import java.util.List;

import com.app.soap.model.Number;

public interface NumberConvertService {

	public String numberToWord(int number);
	public List<Number> getAllConvertedWords();
}
