package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class A_AddEmp {
    public static void main(String[] args) {


        //SessionFactory and EntityManagerFactory (one and the same thing): thread safe, singleton
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("ukgdemo");

        //Session and EntityManager is one and the same thing
        //all the crud op must be done EntityManager (hold a db connection)
        EntityManager em=emf.createEntityManager();

        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();

            Employee e1=new Employee("ekta",7080);
            Employee e2=new Employee("amit",7900);
            Employee e3=new Employee("kapil",7500);
            Employee e4=new Employee("sumit",7900);
            em.persist(e1);
            em.persist(e2);
            em.persist(e3);
            em.persist(e4);


            System.out.println("----emp is saved---");
            tx.commit();
        }catch (Exception ex){
            tx.rollback();
        }

        em.close();

        emf.close();


    }
}