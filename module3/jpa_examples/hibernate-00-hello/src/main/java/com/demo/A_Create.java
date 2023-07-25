package com.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class A_Create {
    public static void main(String[] args) {

        StandardServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                .configure("foo.cfg.xml").build();

        SessionFactory sessionFactory=
                new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();

        Session session=sessionFactory.openSession();

        Transaction tx=session.getTransaction();
        try{
            tx.begin();

            Employee e=new Employee("ekta",4500.00,"IT");
            Employee e2=new Employee("rajiv",9900.00,"IT");
            Employee e3=new Employee("keshav",10500.00,"Fin");
            Employee e4=new Employee("gunika",9800.00,"Fin");

            //hibernate is not managing the life cycle of e, e2 and e3 e4 until

            session.save(e);
            session.save(e2);
            session.save(e3);
            session.save(e4);


            tx.commit();
        }catch (Exception e){

            tx.rollback();
        }

        session.close();
        sessionFactory.close();

    }
}