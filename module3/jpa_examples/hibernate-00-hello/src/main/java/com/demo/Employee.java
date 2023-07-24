package com.demo;

//all import for JPA

import lombok.*;

import javax.persistence.*;
//lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

//POJO: plan old java object*
//Entity
//related to JPA
@Entity //if u apply this annotation then hibernate will maintain life cycle of this object
//if u dont provide @Table annotation then table "employee"
@Table(name = "emp_table3") //hey hib pls create the table "emp_table2" with name
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double salary;
    private String dept;

    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept=dept;
    }
}
