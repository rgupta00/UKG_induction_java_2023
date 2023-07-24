package com.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class C_LifeCycle {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        SessionFactory sessionFactory=
                new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        Session session=sessionFactory.openSession();

        Transaction tx=session.getTransaction();
        Employee e=null;
        try{
            tx.begin();
            //transient state
             e=new Employee("indu",8500.00,"IT");

            //persisted state
            session.save(e);
            e.setDept("Training2");
            e.setDept("Fin2");
            e.setDept("MKT2"); //dirty state
            e.setDept("IT"); //dirty state

            tx.commit();

        }catch (Exception ex){

            tx.rollback();
        }
        e.setDept("PQR");
        session.close();
        //emp object become detached

        e.setDept("ABC");

        sessionFactory.close();

    }
}