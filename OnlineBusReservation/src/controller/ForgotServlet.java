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

 
@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 String userID = request.getParameter("userID");
		
		 try
		 {
		 Registration register = new Registration();
		 register.setUserID(userID);
		 DatabaseConnectivity data = new DatabaseConnectivity();
		 boolean check = data.forgotPassword(register);
		 
		 if(check)
		 {
			 response.sendRedirect("NewPassword.jsp");
			 request.getSession().setAttribute("userID", userID);
		 }
		 else
		 {
			 String url = "forgotpassword.jsp";
			 RequestDispatcher rd = request.getRequestDispatcher(url);
			 response.getWriter().write("UserID did not matched");
			 rd.include(request, response);
			 
		 }
				 
		 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
		 
		 
	}

}
