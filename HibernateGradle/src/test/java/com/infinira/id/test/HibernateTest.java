package com.infinira.id.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infinira.id.model.Address;

import com.infinira.id.model.UserDetails;
import com.infinira.id.service.LoginService;

public class HibernateTest {

	public static void main(String[] args) {
	
		
		
		UserDetails user = new UserDetails();
		//user.setUserId(1);
		user.setUserName("harsha2");
		user.setEmail("harsha@gmail.com");
		user.setDob(new Date());
		Address homeAddress = new Address();
		homeAddress.setAddress1("DRno 3 39 ,tadigadapa,teachers colony");
		homeAddress.setCity("vijayawada");
		homeAddress.setCountry("INDIA");
		homeAddress.setpincode("521137");
		user.setHomeAddress(homeAddress);
		user.setPassword("Harsha12345@");
		user.setPasswordQus("place");
		user.setPasswordAns("vijayawada");


		try {
			

			//LoginService.getInstance().createUser(user);
			SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			 session.beginTransaction();
			 session.save(user);
			 session.getTransaction().commit();
			 session.close();
			 System.out.println("Done");
		}
		catch (Throwable th) {
			throw new RuntimeException(th);
		}
		System.out.println("Done");


	}

}
