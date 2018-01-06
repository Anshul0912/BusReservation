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
 * Servlet implementation class NewPasswordServlet
 */
@WebServlet("/NewPasswordServlet")
public class NewPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewPasswordServlet() {
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

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		Registration register = new Registration();
		String userID = request.getParameter("userID");
		String password = request.getParameter("NewPassword");
		String reenterpassword = request.getParameter("ReEnterNewPassword");
		
		register.setUserID(userID);
		register.setPassword(password);
		
		if(password.equals(reenterpassword))
		{
			try
			{
				DatabaseConnectivity data = new DatabaseConnectivity();
				boolean check = data.newPassword(register);
				if(check)
					response.sendRedirect("Login.jsp");
		 	}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("NewPassword.jsp");
			response.getWriter().write("Password not same");
			rd.include(request, response);
			
		}
		
		
	}

}
