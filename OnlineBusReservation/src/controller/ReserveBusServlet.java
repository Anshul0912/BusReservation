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
 
@WebServlet("/ReserveBusServlet")
public class ReserveBusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private String selectBus;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		DatabaseConnectivity data = new DatabaseConnectivity();
		 Busdata busData = new Busdata();
		 selectBus = request.getParameter("selectbus");
		
		 try {  
			   RequestDispatcher requestDispatcher = request.getRequestDispatcher("ReserveBus.jsp");
			   busData=data.getSelectedBus(Integer.parseInt(selectBus)).iterator().next();
			   request.setAttribute("BusID", busData.getBusId());
			   request.setAttribute("Arrival", busData.getArrival());
			   request.setAttribute("Departure", busData.getDeparture());
			   request.setAttribute("busType", busData.getBusType());
			   request.setAttribute("Source", busData.getSource());
			   request.setAttribute("Destination", busData.getDestination());
			   request.setAttribute("OnwardDate", busData.getOnwardDate());
			   request.setAttribute("ReturnDate", busData.getReturnDate());
			   request.setAttribute("Fare", busData.getFare());
			   requestDispatcher.forward(request, response);
			 } catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	
	}

}
