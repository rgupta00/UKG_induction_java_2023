package com.demo2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class A_Create {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        SessionFactory sessionFactory=
                new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        Session session=sessionFactory.openSession();

        Transaction tx=session.getTransaction();
        try{
            tx.begin();

            //String name, double salary, String dept, EmpType empType
            Employee employee = new Employee("raj",56000.00,"IT", EmpType.T,
                    LocalDate.of(2000, Month.MAY, 11));

            employee.setTempPassword("foo12344#");
            session.save(employee);

//            Employee e2=session.get(Employee.class, 1);
//            System.out.println(e2.getName());
//            System.out.println(e2.getTempPassword());

            tx.commit();
        }catch (Exception e){

            tx.rollback();
        }

        session.close();
        sessionFactory.close();

    }
}