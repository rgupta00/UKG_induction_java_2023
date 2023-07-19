package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

class BookServiceImplTest {

	private BookDao dao;
	private BookService bookService;
	
	@BeforeEach
	public void beforeEach() {
		dao=new BookDaoImpl();
		bookService=new BookServiceImpl(dao);
	}
	
	@Test
	void testGetBooks() {
		assertEquals(2, bookService.getBooks("java").size());
	}
	
	@AfterEach
	public void afterEach() {
		dao=null;
		bookService=null;
	}

}
