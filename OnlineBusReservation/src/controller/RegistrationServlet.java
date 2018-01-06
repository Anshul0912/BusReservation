package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.DatabaseConnectivity;
import model.Registration;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	  private String userID;
	  private String firstName;
	  private String lastName;
	  private String gender;
	  private String dateOfBirth;
	  private String mobileNumber;
	  private String emailID;
	  private String age;
	  private String password;
	  private String reenterPassword;
	
	
	
	 private static final long serialVersionUID = 1L;
     public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		Registration register = new Registration();
		
		userID = request.getParameter("userID");
		firstName = request.getParameter("firstName");
		lastName = request.getParameter("lastName");
		gender = request.getParameter("gender");
		dateOfBirth =  request.getParameter("dateOfBirth");
		mobileNumber =request.getParameter("mobileNumber");
		emailID = request.getParameter("emailID");
		age = request.getParameter("age");
		password  = request.getParameter("password"); 
		reenterPassword = request.getParameter("reenterPassword"); 
		
		register.setUserID(userID);
		register.setFirstName(firstName);
		register.setLastName(lastName);
		register.setGender(gender);
		register.setDateOfBirth(dateOfBirth);
		register.setMobileNumber(mobileNumber);
		register.setEmailID(emailID);
		register.setAge(age);
		register.setPassword(password);
		register.setReenterPassword(reenterPassword);

		DatabaseConnectivity data;
		try {
			
			data = new DatabaseConnectivity();
			data.RegisterUser(register);
		
		} catch (Exception e) {
			 
			System.out.println(e.getMessage());
		}
		
		response.sendRedirect("Login.jsp");
		
	}

}
