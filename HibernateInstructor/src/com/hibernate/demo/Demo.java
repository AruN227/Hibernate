package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class Demo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			/*Instructor instructor = new Instructor("Arun","Ak","ak@gamil.com");
			InstructorDetail instructorDetail = new InstructorDetail("http://www.google.com/youtube","Coding");
			
			Instructor instructor = new Instructor("Thulasi","Gr","grt@gamil.com");
			InstructorDetail instructorDetail = new InstructorDetail("http://www.google.com/youtube/grt","Writing");
			
			instructor.setInstructorDetail(instructorDetail);*/
			
			session.beginTransaction();
		
		/*System.out.println("Saving Instructor: " +instructor);
		session.save(instructor);*/
			
			//delete
			int theId=2;
			
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			System.out.println("instructorDetail" +tempInstructorDetail);
		
		//	System.out.println("associated instructor" + instructorDetail.);
			
			
			
			if(tempInstructorDetail != null) {
				session.delete(tempInstructorDetail);
			}
		
			
			session.getTransaction().commit();
			System.out.println("done");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			session.close();
			factory.close();
		}
		
		
		
	}

}
