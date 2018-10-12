package com.infinira.id.service;

import org.hibernate.Session;

import com.infinira.id.persistence.HibernateUtil;

public class DBService {
	
	 private static volatile DBService dbService;


		public static DBService getInstance () {
			if (dbService == null) {
				synchronized(DBService.class) {
					if (dbService == null) {
						dbService = new DBService ();  // lazy loading                 
					}
				}
			}
	        return dbService;
		}
	    
		private DBService() { 
		}  
		
		public Session getSession() {
			return HibernateUtil.getSessionFactory().openSession();

		}
		
		public void closeSession(Session session) {
			if(session != null ) {
				
			}
			session.close();
		}
		
}
