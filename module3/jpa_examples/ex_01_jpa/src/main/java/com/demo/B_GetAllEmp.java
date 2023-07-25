package com.demo;

import javax.persistence.*;
import java.util.List;

public class B_GetAllEmp {
    public static void main(String[] args) {


        //SessionFactory and EntityManagerFactory (one and the same thing): thread safe, singleton
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ukgdemo");

        //Session and EntityManager is one and the same thing
        //all the crud op must be done EntityManager (hold a db connection)
        EntityManager em=emf.createEntityManager();

        //HQL vs JPQL

      /*  TypedQuery<Employee> query = em.createQuery(
                "select e from Employee e", Employee.class);

        List<Employee> results = query.getResultList();*/


        List<Employee> employeeList=em
                .createQuery("select e from Employee e where e.salary=?2 and e.name=?1",Employee.class)
                .setParameter(1,"raj")
                .setParameter(2,7000.00)
                        .getResultList();

        employeeList.forEach(e-> System.out.println(e));

//        List<String> employeeNameList=em
//                .createQuery("select e.name from Employee e",String.class)
//                .getResultList();

        //employeeNameList.forEach(e-> System.out.println(e));

        em.close();

        emf.close();


    }
}