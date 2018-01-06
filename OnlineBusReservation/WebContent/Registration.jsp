<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="RegistrationServlet" method="post">
  
  UserID:<br>
  <input type="text" name="userID" placeholder = "UserID" > <br><br>
  First name:<br>
  <input type="text" name="firstName" placeholder = "firstname" > <br><br>
  Last name:<br>
   <input type="text" name="lastName" placeholder = "lastname"><br><br>
   Gender
   <input type="radio" name="gender" value="male" checked> Male
  <input type="radio" name="gender" value="female"> Female<br><br>
  Date of Birth:<br>
  <input type = "text" name = "dateOfBirth" > <br><br>
  Mobile Number:<br>
  <input type ="text" name="mobileNumber"><br><br>
  Email ID:<br>
  <input type = "text" name = "emailID"><br><br>
  Age:<br>
  <input type = "text" name = "age"><br><br>
  
   Password:<br>
  <input type ="password" name = "password"><br><br>
  
   Re-enter Password:<br>
  <input type = "password" name = "reenterPassword"> 
<br><br>  
   <input type = "Submit" value = "login">
  
 </form>
</body>
</html>