package com.xworkz.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/register")
public class Hospital extends HttpServlet {

	public Hospital() {
		System.out.println("From Default Constructor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fistName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String mobileNo = req.getParameter("mobile");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmpassword");

		System.out.println(fistName + " " + lastName + " " + email + " " + age + "  " + mobileNo + " " + password + " "
				+ confirmPassword + " ");
		resp.setContentType("Text/html");
		String message = null;
		String fontColor = "green";

		if (fistName != null && !fistName.isEmpty()) {
			message = "Saving" + fistName + "is successful";
		} else {
			message = "Saving" + fistName + "failed";
			fontColor = "red";
		}

		if (lastName != null && !lastName.isEmpty()) {
			message = "Saving" + lastName + "is successful";
		} else {
			message = "Saving" + lastName + "failed";
			fontColor = "red";
		}

		if (email != null && !email.isEmpty()) {
			message = "Saving" + email + "is successful";
		} else {
			message = "Saving" + email + "failed";
			fontColor = "red";
		}

		if (age != null && !age.isEmpty()) {
			message = "Saving" + age + "is successful";
		} else {
			message = "Saving" + age + "failed";
			fontColor = "red";
		}

		if (mobileNo != null && !mobileNo.isEmpty()) {
			message = "Saving" + mobileNo + "is successful";
		} else {
			message = "Saving" + mobileNo + "failed";
			fontColor = "red";
		}

		if (password != null && !password.isEmpty()) {
			message = "Saving" + fistName + "is successful";
		} else {
			message = "Saving" + fistName + "failed";
			fontColor = "red";
		}

		if (confirmPassword != null && !confirmPassword.isEmpty()) {
			message = "Saving" + confirmPassword + "is successful";
		} else {
			message = "Saving" + confirmPassword + "failed";
			fontColor = "red";
		}

		String html = "<html><body><h1 style='color:" + fontColor + " " + message + "</h1></body></html> ";
		PrintWriter writer = resp.getWriter();
		writer.println("<h1 color:green>Out PatientRegister is Success </h1>");
		writer.println("<h3>Below are the Details </h3>");
		writer.println("Full Name :-" + fistName + " " + lastName);
		writer.println("\n Current Date :-" + LocalDate.now());
		writer.println("\n Age :-" + age);
		writer.println("\n Email :-" + email);
		writer.write(html);
		writer.close();

	}

}
