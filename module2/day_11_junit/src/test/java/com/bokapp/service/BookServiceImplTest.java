//package com.bokapp.service;
//
//import com.bokapp.dao.BookDao;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class BookServiceImplTest {
//
//    private BookDao bookDao;
//    private BookService bookService;
//
//    @BeforeEach
//    public void beforeEach(){
//        bookDao=new BookDaoImpl();
//         bookService = new BookServiceImpl(bookDao);
//    }
//
//    @Test
//    public void testNoOfJavaBookAreTwo(){
//        Assertions.assertEquals(2,bookService.getJavaBooks().size());
//    }
//
//}
