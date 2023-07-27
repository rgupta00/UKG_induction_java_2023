package com.empapp.controller;

import com.empapp.entities.Employee;
import com.empapp.excetions.EmployeeNotFoundException;
import com.empapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//http://localhost:9090/empapp/v1/api/employees
//SRP
@RestController
@RequestMapping(path = "v1/api") //?
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    //ResponeEntity is just like a bag that hold 2 things  data + status code

    //---------------all employees-------------
//    @GetMapping(path = "employees")
//    public List<Employee> getAll(){
//        return employeeService.getAll();
//    }

    @GetMapping(path = "employees")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAll());
    }

    //---------------getting a particular employee------------
    @GetMapping(path = "employees/{id}")
    public ResponseEntity<Employee> getById(@PathVariable int id){
//        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getById(id));

        Employee e=employeeService.getById(id);

        return ResponseEntity.ok().body(employeeService.getById(id));
    }

    //---------adding a new employee -----
    @PostMapping(path = "employees")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        Employee addedEmployee=  employeeService.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("employee added succsssfully and auto gen keys "+ addedEmployee.getId());
    }

    //--------------update a particular employee------------
    @PutMapping(path = "employees/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        Employee employeeUpdated= employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok().body("employee with id "+ id+" is updated succsssfully");
    }

    //---------------deleting a particular employee------------
    @DeleteMapping(path = "employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id){
        try{
            employeeService.deleteEmployee(id);
        }catch (EmployeeNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
         return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}



