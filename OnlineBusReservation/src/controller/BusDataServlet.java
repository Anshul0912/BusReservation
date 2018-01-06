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

 
@WebServlet("/BusDataServlet")
public class BusDataServlet extends HttpServlet {
	DatabaseConnectivity data = new DatabaseConnectivity();
	private static final long serialVersionUID = 1L;
	 private String source;
	 private String destination;
	 private String busType;
	 private String onwardDate;
	 private String returnDate;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		try {
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Busdata busdata = new Busdata();
		
        source = request.getParameter("Source");
		destination = request.getParameter("Destination");
		busType = request.getParameter("BusType");
		onwardDate = request.getParameter("Sdate");
		returnDate = request.getParameter("Rdate");
		
		 
		
		busdata.setSource(source);
		busdata.setDestination(destination);
		busdata.setBusType(busType);
		busdata.setOnwardDate(onwardDate);
		busdata.setReturnDate(returnDate);
		 
		   try {
			   
			   RequestDispatcher requestDispatcher = request.getRequestDispatcher("SelectBus.jsp");
			   request.setAttribute("selectBusData", data.selectBus(busdata) );
			   requestDispatcher.forward(request, response);
			 } catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		 
		  
	}

}
