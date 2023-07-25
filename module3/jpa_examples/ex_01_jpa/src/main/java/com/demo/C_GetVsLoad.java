package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class C_GetVsLoad {
    public static void main(String[] args) {

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ukgdemo");

        EntityManager em=emf.createEntityManager();

//       Employee employe=em.find(Employee.class, 2);//find is same as get of hibernate
//        System.out.println("------------------");
//        System.out.println(employe);


        Employee emp=em.getReference(Employee.class, 2);//find is same as get of hibernate
        System.out.println("------------------");
        System.out.println(emp);

        em.close();

        emf.close();


    }
}