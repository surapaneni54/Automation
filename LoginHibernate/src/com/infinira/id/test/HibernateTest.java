package com.infinira.id.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infinira.id.model.Address;
import com.infinira.id.model.UserDetails;
import com.infinira.id.persistence.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
	
		UserDetails user = new UserDetails();
		//user.setUserId(1);
		user.setUserName("harsha2");
		user.setEmail("harsha@gmail.com");
		user.setPassword("harsha123");
		user.setDob(new Date());
		Address homeAddress = new Address();
		homeAddress.setAddress1("DRno 3 39 ,tadigadapa,teachers colony");
		homeAddress.setCity("vijayawada");
		homeAddress.setCountry("INDIA");
		homeAddress.setpincode("521137");
		
//		Address officeAddress = new Address();
//		officeAddress.setAddress1("RS puram");
//		officeAddress.setCity("CEB");
//		officeAddress.setCountry("INDIA");
//		officeAddress.setpincode("123456");
//		
		user.setHomeAddress(homeAddress);
		//user.setOfficeAddress(officeAddress);
	
		try {
			//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();;
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
			
			
			

		}
		catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("Done");


	}

}
