<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="D:\JavaWorkspace\OnlineBusReservation\bus.jpg" ><fieldset>
<h1 style = "text-align:center;">Welcome to Online Bus Booking</h1>
<form action="">
<center><table>
<tr><td>
<input type="submit" name=Submit value="New User" onclick="document.forms[0].action = 'Registration.jsp'; return true">
</td><td>
<input type="submit" name=Submit value="Existing User" onclick="document.forms[0].action = 'Login.jsp'; return true">
</td>
</tr></table></center>
</form></fieldset>
</body>
</html>