package com.bookapp.service;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

//1. it will make ur project enable to be handle by mockito
@ExtendWith(MockitoExtension.class)
class BookServiceImplTestUsingMockito {
	@Mock	//i want a mock (fake object ) as i am doing unit test actually
	private BookDao dao;
	
	@InjectMocks
	private BookServiceImpl bookService;
	@BeforeEach
	public void beforeEach() {
		List<String> allbooks=Arrays.asList("java","adv java","rich dad poor dad");
		//most imp concept of mockito
		//construft 2. set the behaviour 3.verify
		when(dao.getBooks()).thenReturn(allbooks);//
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
