package com.demo2;

//all import for JPA

import lombok.*;

import javax.persistence.*;
import java.io.PipedReader;
import java.time.LocalDate;
import java.util.Date;

enum  EmpType{
    P,T;
}
//lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name = "emp_table4")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name", length = 100, nullable = false)
    private String name;
    @Column(name = "emp_salary", nullable = false)
    private double salary;
    @Column(name = "emp_dept", nullable = false)
    private String dept;

    @Enumerated(EnumType.STRING)
    private EmpType empType;

//    @Temporal(TemporalType.DATE)
//    private Date date;

    private LocalDate date;

    //@Temporal(TemporalType.TIMESTAMP)
  //  private Date login;

    //hey hib below data should be there in heap must not stored in db
    @Transient
    public String tempPassword;


    public Employee(String name, double salary, String dept, EmpType empType, LocalDate date) {
        this.name = name;
        this.salary = salary;
        this.dept=dept;
        this.empType=empType;
        this.date=date;
    }
}
