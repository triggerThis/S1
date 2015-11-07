package com.lqSite1.huiju;
import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StudentOperateRemark {
    //Hibernate  Session
    //Session JSP Session
    private Session session=null;
    //session
    @SuppressWarnings("deprecation")
	public void StudentOperate(){
    	String hibernatePropsFilePath = "/hibernate.cfg.xml";

        File hibernatePropsFile = new File(hibernatePropsFilePath);

        Configuration configuration = new Configuration(); configuration.configure(hibernatePropsFile);

        StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    	
       // Hibernate
       Configuration config=new Configuration().configure();
       //SessionFactory
       SessionFactory factory=config.buildSessionFactory();
       //SessionFactory Session
       this.session=factory.openSession();
       
   	/*
       You can load hibernate.cfg.xml from a different directory (not necessarily the classpath) using the configure(File configFile) method that takes the hibernateConfig File argument. (note, I am using hibernate 4.3.7)

       Like this:

       String hibernatePropsFilePath = "/etc/configs/hibernate.cfg.xml";

       File hibernatePropsFile = new File(hibernatePropsFilePath);

       Configuration configuration = new Configuration(); configuration.configure(hibernatePropsFile);

       StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

       ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();

       SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    */
    }

   

    //session
    //
    public void insert(Student student){
      
       Transaction tran=this.session.beginTransaction();

       
       this.session.save(student);

      
       tran.commit();
    }
}