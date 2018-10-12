package com.infinira.id.service;

import java.util.List;

import com.infinira.id.dao.UserDetailsDao;
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
		
		// Creating User
		public void createUser(UserDetails user) {
			UserDetailsDao.createUser(user); 
		}
		// update user
		public int  updateUser(UserDetails user) {
	        return  UserDetailsDao.updateUser(user); 
		}
		// Get User 
		public UserDetails getUser(long userId) {
	         return UserDetailsDao.getUser(userId); 
		}
		// Delete User
		public void deleteUser(UserDetails user) {
			UserDetailsDao.deleteUser(user); 
		}
		

}
