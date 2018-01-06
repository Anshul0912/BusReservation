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
<form action = "ReserveBusServlet" method = "post">
<fieldset>
<legend><b>Available Buses</b></legend>
<table border = "1" style="width:80%" align="center">
 <tr>
 <td>Select</td> 
  <td>BusID</td>
  
 <td align = "left">Departure</td>
 
 <td align = "left">Arrival</td>
   
 <td>Fare</td>
 <td> 
 </tr>
  
    <c:forEach var="data"  items = "${selectBusData}">
    <tr>
        <td><input type = "radio" name = "selectbus" value="${data.getBusId()}"></td>
        <td><c:out value="${data.getBusId()}"/></td>
        <td><c:out value="${data.getDeparture()}"/></td>
        <td><c:out value="${data.getArrival()}"/></td>
        <td><c:out value="${data.getFare()}"/></td>
    </tr>
    </c:forEach>
   <tr><td><input type = "submit" name=submit value="Select Bus"> 
</td></tr></table>
</fieldset>
  </form>

</body>
</html>