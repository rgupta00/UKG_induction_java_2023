package com.one2one.uni;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class One2OneEx {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        SessionFactory sessionFactory=
                new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        Session session=sessionFactory.openSession();

        Transaction tx=session.getTransaction();
        try{
            tx.begin();

            Employee e1=new Employee("raj");
            Employee e2=new Employee("umesh");
            Employee e3=new Employee("ekta");

            Parking parking1=new Parking("A1");
            Parking parking2=new Parking("A1");
            Parking parking3=new Parking("A1");

            parking1.setEmployee(e1);
            parking2.setEmployee(e2);
            parking3.setEmployee(e3);

//            session.save(parking1);
//            session.save(parking2);
//            session.save(parking3);

    //we dont need if we are using  @OneToOne(cascade = CascadeType.PERSIST)
//            session.save(e1);
//            session.save(e2);
//            session.save(e3);

            //some specific paring
//            Parking parkingTemp=session.get(Parking.class, 2);
//            System.out.println(parkingTemp.getParkingLocation());
//            System.out.println(parkingTemp.getEmployee().getEmpName());

            //i want all the parkings
//            List<Parking> parkingList=
//                    session.createQuery("select p from Parking p", Parking.class).getResultList();


            //how to avoid N+1 problem

            //use fetch join
            //from Parking p  fetch join p.employee Employee
            List<Parking> parkingList=
                    session
                            .createQuery("from Parking p join fetch p.employee Employee", Parking.class).getResultList();


            System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
            for(Parking p: parkingList){
                System.out.println(p.getParkingLocation());
                System.out.println("-----------------------");
                System.out.println(p.getEmployee().getEmpName());
            }
            System.out.println("************************");

            //List<Parking> parkingList=session.

            System.out.println("--------------------");

            tx.commit();
        }catch (Exception e){

            tx.rollback();
        }

        session.close();
        sessionFactory.close();

    }
}