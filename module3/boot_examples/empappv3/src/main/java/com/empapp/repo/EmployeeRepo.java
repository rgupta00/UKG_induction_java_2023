package com.empapp.repo;

import com.empapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Sprinng data => auto gen of dao layer :)
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
