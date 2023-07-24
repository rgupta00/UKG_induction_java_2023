package com.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class B_GetAll {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        SessionFactory sessionFactory=
                new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        Session session=sessionFactory.openSession();

       //i want all the rec to be printed on console-> spring + hib
        //ORM:SQL--> HQL(OO way of writing SQL)

//        List<Employee> list=session
//                .createQuery("select e from Employee e",Employee.class)
//                        .getResultList();
//
//        list.forEach(emp-> System.out.println(emp));



//        List<Object[]> list=session
//                .createQuery("select e.name, e.salary from Employee e",Object[].class)
//                .getResultList();
//
//      for(Object[]temp: list){
//          System.out.println(temp[0]+" : "+temp[1]);
//      }

        //name and salary -> EmployeeData

        List<EmployeeData> list=session
                .createQuery("select new com.demo.EmployeeData(e.name, e.salary) from Employee e",
                        EmployeeData.class)
                .getResultList();


        list.forEach(ed-> System.out.println(ed));
        session.close();
        sessionFactory.close();

    }
}