package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/save")
public class FirstServlet extends HttpServlet {

	public FirstServlet() {
		System.out.println("Calling from Default Constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("From doget of FirstServlet");
		super.doGet(req, resp);

		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String adrs1 = req.getParameter("adrs1");
		String adrs2 = req.getParameter("adrs2");
		String village = req.getParameter("village");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		String pincode = req.getParameter("pin");
		String continent = req.getParameter("continent");
		String planet = req.getParameter("planet");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String age = req.getParameter("age");
		String father = req.getParameter("father");
		String mother = req.getParameter("mother");

		System.out
				.println("Details from User" + '\n' + firstName + '\n' + lastName + '\n' + adrs1 + '\n' + adrs2 + '\n'+
						village+'\n'+city+'\n'+state+'\n'+country+'\n'+pincode+'\n'+continent+'\n'+planet+'\n'+gender+
						'\n'+dob+'\n'+age+'\n'+father+'\n'+mother);

	}

}
