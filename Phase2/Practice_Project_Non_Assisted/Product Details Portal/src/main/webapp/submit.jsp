<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details Portal</title>
</head>
<body>
<jsp:useBean id="obj" class="com.Product" scope="session"></jsp:useBean>

<jsp:setProperty property="pid" name="obj" />
<jsp:setProperty property="name" name="obj" />
<jsp:setProperty property="price" name="obj" />

<h2>Product Details: </h2><br>
ID:  <jsp:getProperty property="pid" name="obj"/><br>
NAME:  <jsp:getProperty property="name" name="obj"/><br>
Price:  <jsp:getProperty property="price" name="obj"/><br>

</body>
</html>