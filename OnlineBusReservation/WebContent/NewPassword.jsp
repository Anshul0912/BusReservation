<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="NewPasswordServlet" method = post>
<table align = center>
<tr><td><b>UserID</b></td>
<td><input type = text readonly name="userID" value="<%=session.getAttribute("userID")%>"></td></tr>
<tr><td><b>Enter New Password</b></td>
<td><input type = password name = "NewPassword"></td></tr>
<tr><td><b>Re-Enter Password</b></td>
<td><input type = password name = "ReEnterNewPassword"></td></tr>
<tr><td></td>
<td><input type = "submit" name = "submit" value="submit"></td></tr>

</table>
 </form>


</body>
</html>