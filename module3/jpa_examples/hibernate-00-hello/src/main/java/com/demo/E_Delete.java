package com.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class E_Delete {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("foo.cfg.xml").build();

        SessionFactory sessionFactory=
                new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        Session session=sessionFactory.openSession();

        Transaction tx=session.getTransaction();
        try{
            tx.begin();

            //first u get the object

            Employee e=session.get(Employee.class, 4);

           session.delete(e);


            tx.commit();
        }catch (Exception e){

            tx.rollback();
        }

        session.close();
        sessionFactory.close();

    }
}