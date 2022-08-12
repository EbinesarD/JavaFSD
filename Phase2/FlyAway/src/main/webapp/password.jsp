<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body style="text-align: center; ">
<form action="newpassword" method="post">
	<input type="text" name="Name" placeholder="Enter Username"><br>
	<input type="password" name="Password" placeholder="Enter old password"><br>
	<input type="password" name="NPassword" placeholder="Enter new password"><br><br>
	<input type="submit" value="Save">
</form>
</body>
</html>