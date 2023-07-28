package com.empapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "emp_table_spring_data")
public class Employee {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
