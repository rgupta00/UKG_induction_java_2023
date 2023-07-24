package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {

	private BookDao dao;

	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	public BookServiceImpl(BookDao dao) {
		this.dao = dao;
	}

	@Override
	public List<String> getBooks(String subject) {
		return dao.getBooks().stream().filter(b -> b.contains(subject)).collect(Collectors.toList());

	}

}
