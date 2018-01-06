package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Busdata;

 
@WebServlet("/SelectBusServlet")
public class SelectBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	 private String source;
	 private String destination;
	 private String busType;
	 private String onwardDate;
	 private String returnDate;
	 
	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Busdata busdata = new Busdata();
		
		source = request.getParameter("Source");
		destination = request.getParameter("destination");
		busType = request.getParameter("BusType");
		onwardDate = request.getParameter("Sdate");
		returnDate = request.getParameter("Rdate");
		
		
		busdata.setSource(source);
		busdata.setDestination(destination);
		busdata.setBusType(busType);
		busdata.setOnwardDate(onwardDate);
		busdata.setReturnDate(returnDate);
		
		
		
		
		
		
		
	}

}
