package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.DatabaseConnectivity;
import model.Registration;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private String userID;
	private String password;
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		Registration register = new Registration();
		
		
		userID = request.getParameter("userid");
		password = request.getParameter("password");
		
		register.setUserID(userID);
		register.setPassword(password);

		try {
			
		   DatabaseConnectivity data = new DatabaseConnectivity();
		   boolean checkData = data.LoginUser(register);
		   
		   if(checkData==true)
		   {
			    RequestDispatcher requestDispatcher = request.getRequestDispatcher("BusData.jsp");
			    request.setAttribute("source", data.sourceData());
			    request.setAttribute("destination", data.destinationData());
			   
			   requestDispatcher.forward(request, response);
			  }
		   else
		   {
			    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                response.getWriter().write("UserID and Password do not match please try again");
                rd.include(request, response);
			   
		   }
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
   }

}
