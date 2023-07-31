package com.empapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//:) u dont need to write dao layer u need just declare it...

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByName(String name);
	//@query JPQL

}
