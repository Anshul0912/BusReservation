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

<form action = "BusDataServlet" method = "post">
<fieldset><legend><b>Search Your Bus</b></legend>
<table align="center"><tr>
<td>
   SelectSource </td> 
   <td>
   <select name = "Source">
  <c:forEach var="data"  items = "${source}">
   <option><c:out value="${data}"/></option>
    </c:forEach>
   </select></td></tr>
   <tr><td></td></tr>
   <tr>
   <td>
   SelectDestination</td> <td> <select name = "Destination">
   <c:forEach var="data"  items = "${destination}">
   <option><c:out value="${data}"/></option>
   </c:forEach></select></td></tr>
   <tr><td></td></tr>
   <tr><td>
   BusType </td><td><select name = "BusType">
   <option> AC </option>
   <option> NON-AC </option>
   </select></td></tr>
   <tr><td></td></tr>
   <tr><td>Onward Date:</td>
   <td><input type = "date" name = "Sdate"/></td></tr>
   <tr><td></td></tr>
   <tr><td>Return Date:</td>
   <td><input type = "date" name = "Rdate"/></td></tr>
   <tr>
   <td></td>
   <tr><td></td></tr>
   <td><input type = "submit" name=submit value="Search Buses"></td></tr> 
 </table>
</fieldset>
</form>
</body>
</html>