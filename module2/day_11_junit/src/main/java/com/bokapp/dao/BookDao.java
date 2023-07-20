package com.bokapp.dao;

import java.util.List;

public interface BookDao {
    public List<String> getAll();
    public String getById(int id);
}
