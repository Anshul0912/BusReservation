<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="ConfirmationServlet" method = "post">
  <fieldset>
  <legend><b>Booking Details</b></legend><br>
  <table border = "1" style="width:80%">
 <tr>
      <td align = "left">CustomerName</td>
      <td align = "left">Age</td>
      <td align = "left">ContactNumber</td>
      <td align = "left">EmailID</td>        
      <td align = "left">Source</td>         
      <td align = "left">Destination</td>  
      <td align = "left">OnwardDate</td>   
      <td align = "left">ReturnDate</td> 
      <td align = "left">NumberOfSeats</td> 
      <td align = "left">Departure</td>   
      <td align = "left">Arrival</td>      
      <td align = "left">Fare</td>         
</tr>

<tr>
  <td><c:out value="${Fullname}"/></td> 
  <td><c:out value="${age}"/></td>
  <td><c:out value="${contact}"/></td>
  <td><c:out value="${emailid}"/></td>
    <td><c:out value="${Source}"/></td>  
     <td><c:out value="${Destination}"/></td>
    <td><c:out value="${OnwardDate}"/></td>
    <td><c:out value="${ReturnDate}"/></td>
     <td><c:out value="${numberofseats}"/></td> 
    <td><c:out value="${Departure}"/></td>
    <td><c:out value="${Arrival}"/></td>
    <td><c:out value="${Fare}"/></td>
</tr>
</table></fieldset><br><br>
 

 
 <input type="hidden" name="BusID" value="${BusID}"/>
 <input type="hidden" name="seats" value="${numberofseats}"/>
 <input type="submit" value="Confirm Booking">
 
</form>


</body>
</html>