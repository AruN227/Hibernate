package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Course;
import com.hibernate.entity.Instructor;
import com.hibernate.entity.InstructorDetail;

public class Demo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			//Instructor instructor = new Instructor("Kalai","selva","sky@gamil.com");
			//InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com/sky","Coding");
			
			
			/*Instructor instructor = new Instructor("Thulasi","Gr","grt@gamil.com");
			InstructorDetail instructorDetail = new InstructorDetail("http://www.google.com/youtube/grt","Writing");*/
			
			//instructor.setInstructorDetail(instructorDetail);
			
			session.beginTransaction();
		
	//	System.out.println("Saving Instructor: " +instructor);
	//	session.save(instructor);
			
			//delete
	int theId=1;
	Instructor tempInstructor = session.get(Instructor.class, theId);

//	Course myCourse1 = new Course("Java");
//	Course myCourse2 = new Course("Spring Boot");
//	
//	tempInstructor.add(myCourse1);
//	tempInstructor.add(myCourse2);
//	
//	session.save(myCourse1);
//	session.save(myCourse2);
		
	System.out.println("Instructor details" + tempInstructor);
	System.out.println("Course Details" + tempInstructor.getCourses());
			
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
