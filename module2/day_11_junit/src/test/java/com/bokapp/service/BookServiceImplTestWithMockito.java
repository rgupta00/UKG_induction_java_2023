package com.bokapp.service;

import com.bokapp.dao.BookDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTestWithMockito {

    @Mock
    private BookDao bookDao;

    //mockito will inject bookDao into bookservice : dependeny injection (String)
    @InjectMocks
    private BookServiceImpl bookService;
    List<String> bookList;

    @BeforeEach
    public void beforeEach(){
         bookList=   Arrays.asList("Effective java","head first java","rich dad poor dad");
    }

    @Test
    public void testNoOfJavaBookAreTwo(){
        when(bookDao.getAll()).thenReturn(bookList);
        Assertions.assertEquals(2,bookService.getJavaBooks().size());
    }


    @Test
    public void testGetById(){
        //List<String> bookList=   Arrays.asList("Effective java","head first java","rich dad poor dad");
        when(bookDao.getById(2)).thenReturn("java in action");
        Assertions.assertEquals("java in action",bookService.getById(2));
    }


}
