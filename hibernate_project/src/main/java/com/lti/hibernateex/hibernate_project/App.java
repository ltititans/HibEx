package com.lti.hibernateex.hibernate_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration conf = new Configuration().configure();
       StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
       SessionFactory factory = conf.buildSessionFactory(builder.build());
       Session session = factory.openSession();
       Employee employee = new Employee();
       employee.setEmpName("Rahul");
       employee.setBranch("Bangalore");
       session.beginTransaction();
       session.save(employee);
       session.getTransaction().commit();
    }
}
