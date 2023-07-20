package com.bokapp.service;

import com.bokapp.dao.BookDao;

import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService{
    private BookDao  bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    @Override
    public List<String> getJavaBooks() {
        return bookDao.getAll().stream().filter(b-> b.contains("java")).collect(Collectors.toList());
    }

    @Override
    public String getById(int id) {
        return bookDao.getById(id);
    }
}
