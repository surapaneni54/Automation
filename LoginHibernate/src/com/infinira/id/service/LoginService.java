package com.infinira.id.service;

import com.infinira.id.dao.LoginDao;
import com.infinira.id.model.UserDetails;

public class LoginService {
	
	 private static volatile LoginService loginServiceInstance;


		public static LoginService getInstance () {
			if (loginServiceInstance == null) {
				synchronized(LoginService.class) {
					if (loginServiceInstance == null) {
						loginServiceInstance = new LoginService ();  // lazy loading                 
					}
				}
			}
	        return loginServiceInstance;
		}
	    
		private LoginService() { 
		}   
		
		public long createUser(UserDetails user) {
	        return LoginDao.create(user); 
		}

}
