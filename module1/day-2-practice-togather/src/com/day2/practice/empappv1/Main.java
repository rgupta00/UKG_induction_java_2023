package com.day2.practice.empappv1;

public class Main {
    public static void main(String[] args) {

        //int id, String name, int noOfDays,
        //  double payPerDay
        Employee employee=
                new PartTimeEmployee(121,"ekta",
                        23,20);
        employee.printEmployeeDetails();



    }
}
