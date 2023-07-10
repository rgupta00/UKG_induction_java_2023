package com.day3.session1.ex1.relationship_bw_objects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Compostion and aggrigation
class Employee{
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    //20%
    public void raisdSalaryPercentage(int incrementPercentage){
        employeeSalary=employeeSalary*(100+incrementPercentage)/100;
    }
    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public void printEmployeeDetails(){
        System.out.println("*******************************");
        System.out.println("employee id: "+employeeId);
        System.out.println("employee name: "+employeeName);
        System.out.println("employee salary: "+employeeSalary);
        System.out.println("*******************************");
    }
}
// Company <>-------------Employee
class Company{
    private String companyName;
    private String registerOffice;

    private final String PAN_CARD;//final*

    //Link list of employee object
    private List<Employee> employees;


    public Company(String companyName, String registerOffice, String panCard) {
        this.companyName = companyName;
        this.registerOffice = registerOffice;
        this.PAN_CARD=panCard;
        this.employees = new LinkedList<>();//LinkedList aka doubly LL      vs ArrayList is a growable Array*
    }
    public void addEmployee(int employeeId, String employeeName, double employeeSalary){
        employees.add(new Employee(employeeId, employeeName, employeeSalary));
    }
    public void printCompanyDetails(){
        System.out.println("company Name:"+companyName);
        System.out.println("company registerOffice:"+registerOffice);
        System.out.println("----------printing employee details---------------");
        for(Employee employee: employees){
            employee.printEmployeeDetails();
        }
    }
}
public class B_HasA {
    public static void main(String[] args) {

        Company company = new Company("UKG","Noida 62","55555A");
        company.addEmployee(1,"raj",56000);
        company.addEmployee(12,"ekta",66000);

        company.printCompanyDetails();




    }
}
