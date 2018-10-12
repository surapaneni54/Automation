package com.infinira.id.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infinira.id.service.RegisterService;

@RestController
@RequestMapping("/register")
public class Testcontroler {
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = { "/test123" }, method = RequestMethod.POST)
	public void Create(HttpServletRequest request, HttpServletResponse response) {
		boolean st = false;
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		
		try {
			System.out.println(firstname);
			System.out.println(lastname);
//			if (st == true) {
//				//response.sendRedirect("/lic_registration/index.jsp?msg=Record created successfully");
//			} else {
//				//response.sendRedirect("/lic_registration/index.jsp?msg=Problem in record creation");
//			}
		} catch (Exception ex) {
			throw new RuntimeException("Error in record creation", ex);
		}

	}
	
}
