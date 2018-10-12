package com.infinira.id.dao;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.hibernate.Query;
import org.hibernate.Session;
import com.infinira.id.model.UserDetails;
import com.infinira.id.service.DBService;

public class UserDetailsDao {

	public static void createUser(UserDetails user) {
		Session session = null;
		try {
				session = DBService.getInstance().getSession();
				if (session == null) {
					System.out.println("session is null");
				}
				session.beginTransaction();
				session.save(user);
				session.getTransaction().commit();
			}catch (Throwable th) {
				throw new RuntimeException("Failed to create User ",th);
			}finally {
				
				DBService.getInstance().closeSession(session);
			}

	}
	
	public static int updateUser(UserDetails user) {
		Session session = null;
		int updatestatus =0;
		try {
				session = DBService.getInstance().getSession();
				session.beginTransaction();
				session.update(user);
				session.getTransaction().commit();
				updatestatus =1;
			}catch (Throwable th) {
				throw new RuntimeException("Failed to update User ",th);
			}finally {
				DBService.getInstance().closeSession(session);
			}
		return updatestatus;
	}
	
	public static UserDetails getUser(long userId) {
		UserDetails user = new UserDetails();
		Session session = null;
		try {
				session = DBService.getInstance().getSession();
				session.beginTransaction();
				user = (UserDetails) session.get(UserDetails.class, userId);
				session.getTransaction().commit();
			}catch (Throwable th) {
				throw new RuntimeException("Failed to Get User info ",th);
			}finally {
				DBService.getInstance().closeSession(session);
			}
		
		return user;
	}

	public static void deleteUser(UserDetails user) {
		Session session = null;
		try {
				session = DBService.getInstance().getSession();
				session.beginTransaction();
				session.delete(user);
				session.getTransaction().commit();
			}catch (Throwable th) {
				throw new RuntimeException("Failed to Delete User ",th);
			}finally {
				DBService.getInstance().closeSession(session);
			}

	}
	
	


}
