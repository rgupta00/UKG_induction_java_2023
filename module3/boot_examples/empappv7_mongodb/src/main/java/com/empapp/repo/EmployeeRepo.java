package com.empapp.repo;

import com.empapp.entities.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Sprinng data => auto gen of dao layer :)
@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
}
