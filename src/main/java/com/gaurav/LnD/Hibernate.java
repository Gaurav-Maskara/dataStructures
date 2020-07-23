package com.gaurav.LnD;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Hibernate {
	 
	private static SessionFactory factory; 

	public static void main(String[] args) {
    
		try {
	         factory = new Configuration().configure().buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		
		
		
		
		  Hibernate.addStudents();  // Adding Students
		//Hibernate.updateStudent(1, 98);
		//Hibernate.deleteStudent(2);
		  Hibernate.getAllStudents();
		
	}
	
	
	
	
	public static void addStudents() {
		Certificate cf1=new Certificate(1, "Java Certification");
		Certificate cf2=new Certificate(1, "SQL Certification");
		
		Set<Certificate> certificates=new HashSet<Certificate>();
		certificates.add(cf1);
		certificates.add(cf2);
		
		Student s1= new Student("Gaurav", 1, 28, 99);
		s1.setCertificates(certificates);
		
		Student s2= new Student("Ram", 2, 28, 99);
		s1.setCertificates(certificates);
		
		Student s3= new Student("Shyam", 3, 28, 99);
		s1.setCertificates(certificates);
		
		
		Hibernate.saveStudent(s1);
		Hibernate.saveStudent(s2);
		Hibernate.saveStudent(s3);
	}
	
	
	public static int saveStudent(Student s) {
		  
		  Session session = factory.openSession();
	      Transaction tx = null;
	      Integer studentId = null;
	      
	      try {
	          tx = session.beginTransaction();
	          Student student = s;
	          studentId = (Integer) session.save(student); 
	          tx.commit();
	       } catch (HibernateException e) {
	          if (tx!=null) tx.rollback();
	          e.printStackTrace(); 
	       } finally {
	          session.close(); 
	       }
	       return studentId;
	}
	
	
	public static void getAllStudents() {
		  Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         List students = session.createQuery("FROM Student").list(); 
	         for (Iterator iterator = students.iterator(); iterator.hasNext();){
	            Student student = (Student) iterator.next(); 
	            System.out.print("First Name: " + student.getName()); 
	            System.out.print("  Last Name: " + student.getRollNo()); 
	            System.out.println("  Salary: " + student.getMarks()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	}
	
	
	public static void updateStudent(Integer rollNo, double marks ){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Student student = (Student)session.get(Student.class, rollNo); 
	         student.setMarks(marks);
			 session.update(student); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	
	
	public static void deleteStudent(int rollNo) {
		Session session=factory.openSession();
		Transaction tx=null;
		
		try {
			tx=session.beginTransaction();
			Student student=(Student)session.get(Student.class, rollNo);
			session.delete(student);
			tx.commit();
			
		}catch(HibernateException ex) {
			if(tx!=null)
				tx.rollback();
		}finally {
			session.close();
		}	
	}
	
}























































