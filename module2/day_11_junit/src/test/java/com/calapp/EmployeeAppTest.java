package com.calapp;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeAppTest {

    @DisplayName("test for add Employee")
    @Order(value = 1)
    @Test
    public void addEmp(TestInfo testInfo){
        System.out.println("-----------------"+testInfo.toString());//log file*
        System.out.println("add Emp");
    }
    @RepeatedTest(1)//?
    @DisplayName("test for update Employee")
    @Order(value = 2)
    @Test
    public void updateEmp(){
        System.out.println("update Emp");
    }

    @DisplayName("test for getById Employee")
    @Order(value = 3)
    @Test
    public void getByIdEmp(){
        System.out.println("getById Emp");
    }
    @DisplayName("test for delete Employee")
    @Order(value = 8)
    @Test
    public void deleteEmp(){
        System.out.println("delete Emp");
    }


}
