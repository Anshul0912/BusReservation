package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.DatabaseConnectivity;
import model.Busdata;
import model.TravellerDetails;

 
@WebServlet("/GenerateReceipt")
public class GenerateReceipt extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	private String firstName;
	private String lastName;
	private int age;
	private String emailId;
	private int contactNumber;
	private String numberOfSeats;
	private int BusId;
	private String Source;
	private String Destination;
	private String OnwardDate;
	private String ReturnDate;
	private String Departure;
	private String Arrival;
	private String Fare;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	DatabaseConnectivity data = new DatabaseConnectivity();	
	   
	TravellerDetails travellerDetails = new TravellerDetails();
	
	BusId = Integer.parseInt(request.getParameter("BusID"));
	firstName = request.getParameter("firstName");
	lastName = request.getParameter("lastName");
	age = Integer.parseInt(request.getParameter("age"));
	emailId = request.getParameter("emailId");
	contactNumber = Integer.parseInt(request.getParameter("contactNumber"));
	numberOfSeats = request.getParameter("seats");
	Source = request.getParameter("Source");
	Destination = request.getParameter("Destination");
	OnwardDate = request.getParameter("OnwardDate");
	ReturnDate = request.getParameter("ReturnDate");
	Departure = request.getParameter("Departure");
	Arrival = request.getParameter("Arrival");
	Fare = request.getParameter("Fare");
	
	
	travellerDetails.setFirstName(firstName);
	travellerDetails.setLastName(lastName);
	travellerDetails.setAge(age);
	travellerDetails.setEmailId(emailId);
	travellerDetails.setContactNumber(contactNumber);
	travellerDetails.setNumberOfSeats(numberOfSeats);
	travellerDetails.setBusId(BusId);
	
	try {  
		   RequestDispatcher requestDispatcher = request.getRequestDispatcher("GenerateReceipt.jsp");
		 Busdata busData=data.getSelectedBus(BusId).iterator().next();
		   request.setAttribute("BusID", busData.getBusId());
		   request.setAttribute("Arrival", busData.getArrival());
		   request.setAttribute("Departure", busData.getDeparture());
		   request.setAttribute("busType", busData.getBusType());
		   request.setAttribute("Source", busData.getSource());
		   request.setAttribute("Destination", busData.getDestination());
		   request.setAttribute("OnwardDate", busData.getOnwardDate());
		   request.setAttribute("ReturnDate", busData.getReturnDate());
		   request.setAttribute("Fare", busData.getFare());
		   request.setAttribute("Fullname", firstName+" "+lastName);
		   request.setAttribute("age", age);
		   request.setAttribute("emailid", emailId);
		   request.setAttribute("contact", contactNumber);
		   request.setAttribute("numberofseats", numberOfSeats);
		   
		   requestDispatcher.forward(request, response);
		 } catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	
	
    
	
 }

}
