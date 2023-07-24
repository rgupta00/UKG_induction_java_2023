package com.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class C_GetById {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        SessionFactory sessionFactory=
                new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        Session session=sessionFactory.openSession();

        //get vs load
        //lazy vs eager
                                        //get by primary
//        Employee e=session.get(Employee.class, 5);//P  it works eagerly
//
//        session.close();//D
//
//        System.out.println(e);


        //in load method  hib dont hit the database it create a proxy object

        Employee e=session.load(Employee.class, 5);//P  it works lazy way
        System.out.println("-------------------");

        //System.out.println(e.getName());

        session.close();//D //LazyInitializationException



//        System.out.println(e.getName());

        sessionFactory.close();

    }
}