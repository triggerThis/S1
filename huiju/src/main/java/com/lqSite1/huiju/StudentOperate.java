package com.lqSite1.huiju;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

public class StudentOperate {
	//Hibernate  Session
    //Session JSP Session
    private Session session=null;
    //session
    //@SuppressWarnings("deprecation")
	public StudentOperate(){
    	
    	
       // Hibernate
       Configuration config=new Configuration().configure();
       //SessionFactory
       SessionFactory factory=config.buildSessionFactory();
       //SessionFactory Session
       this.session=factory.openSession();
       
   	
    }

   

    //session
    //
    public void insert(Student student){
      
       Transaction tran=this.session.beginTransaction();

       
       this.session.save(student);

      
       tran.commit();
    }
}