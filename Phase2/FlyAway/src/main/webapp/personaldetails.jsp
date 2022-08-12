<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Details</title>
</head>
<body style="text-align: center; ">
<%
String ID=request.getParameter("ID");
session.setAttribute("ID", ID);
%>
<h3>Personal Details</h3>
<form action="displaydetails" method="post">
	Name: <input type="text" name="Name" ><br>
	Age:<input type="number" name="Age"><br>
	Address: <input type="text" name="Address" ><br>
	Mobile: <input type="number" name="Mobile" ><br><br>
	<input type="submit" value="Next">
</form>
</body>
</html>