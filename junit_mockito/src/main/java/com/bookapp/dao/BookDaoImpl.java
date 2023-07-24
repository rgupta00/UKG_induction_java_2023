package com.bookapp.dao;

import java.util.*;

public class BookDaoImpl implements BookDao{

	@Override
	public List<String> getBooks() {
		System.out.println("mockito is not going to call it");
		List<String> books=Arrays.asList("java","Adv java","rich dad poor dad");
		
		return books;
	}

}
