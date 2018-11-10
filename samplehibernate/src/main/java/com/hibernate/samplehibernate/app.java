package com.hibernate.samplehibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class app {
  public static void main( String[] args )  
     {  
          Configuration config = new Configuration();
          config.configure("config/hibernate.cfg.xml");  
             
           
         SessionFactory sessionfactory = config.buildSessionFactory();  
         Session session = sessionfactory.openSession();  
         
           
         studentdetails student=new studentdetails();    
             student.setId(011);    
             student.setName("Logu");    
             student.setAddr("Combo"); 
             student.setAge(21); 
            
          Transaction transaction =session.beginTransaction();  
          session.save(student);  
       //   studentdetails stu1=(studentdetails)session.get(studentdetails.class,011);
         // session.delete(stu1);
          transaction.commit();  
           
          session.close(); 
          sessionfactory.close();
        System.out.println("successfully saved");    
            
     }  
}