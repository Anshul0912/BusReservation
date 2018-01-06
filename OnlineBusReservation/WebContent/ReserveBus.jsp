<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="GenerateReceipt" method = "post">
<legend><b>Bus Details</b></legend>
 <table border = "1" style="width:80%">
 <tr>
      <td align = "left">BusID</td>        
      <td align = "left">Source</td>         
      <td align = "left">Destination</td>  
      <td align = "left">OnwardDate</td>   
      <td align = "left">ReturnDate</td>  
      <td align = "left">Departure</td>   
      <td align = "left">Arrival</td>      
      <td align = "left">Fare</td>         
</tr>

<tr>
  <td><c:out value="${BusID}"/></td> 
    <td><c:out value="${Source}"/></td>  
     <td><c:out value="${Destination}"/></td>
    <td><c:out value="${OnwardDate}"/></td>
    <td><c:out value="${ReturnDate}"/></td>
    <td><c:out value="${Departure}"/></td>
    <td><c:out value="${Arrival}"/></td>
    <td><c:out value="${Fare}"/></td>
</tr>
</table><br><br>

 <input type="hidden" name="BusID" value="${BusID}"/>
 <input type="hidden" name="Source" value="${Source}"/>
 <input type="hidden" name="Destination" value="${Destination}"/>
 <input type="hidden" name="OnwardDate" value="${OnwardDate}"/>
 <input type="hidden" name="ReturnDate" value="${ReturnDate}"/>
 <input type="hidden" name="Departure" value="${Departure}"/>
 <input type="hidden" name="Arrival" value="${Arrival}"/>
 <input type="hidden" name="Fare" value="${Fare}"/>
<fieldset><legend><b>Enter Traveller Details</b></legend><br>
First Name:<br>
   <input type="text" name="firstName" placeholder = "firstname" > <br><br>
   Last Name:<br>
   <input type="text" name="lastName" placeholder = "lastname" > <br><br>
   Age:<br>
   <input type="text" name="age" placeholder = "Age" > <br><br>
   EmailId:<br>
   <input type="text" name="emailId" placeholder = "emailId" > <br><br>
   Contact Number:<br>
   <input type="text" name="contactNumber" placeholder = "contactNumber" > <br><br>
    Number of Seats:
   
  <select name = "seats">
   <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
    <option>5</option>
    <option>6</option>
   </select><br><br>
  
  <input type = "submit" name= submit value="Book Bus"> 
</fieldset> 
   </form>
</body>
</html>