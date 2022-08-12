<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%ResultSet resultset =null;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flyaway</title>
</head>
<body style="text-align: center; ">
<h3>Airline</h3>


<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/flyaway";%>
<%!String user = "root";%>
<%!String psw = "Ebinesardon@85";%>
<form action="flightdetails" method="post">
<%
Connection con = null;
PreparedStatement ps = null;
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql = "SELECT * FROM routes";
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery(); 
%>
<p>Select Route :
<select name="Route">
<%
while(rs.next())
{
String Route = rs.getString("Route");
%>
<option value="<%=Route %>"><%=Route%> </option>
<%
}

%>
</select>
</p>
<%
}
catch(SQLException sqe)
{ 
out.println(sqe);
}
%>

<br>
Date: <input type="date" name="Date"><br><br>
Total Tickets: <input type="number" name="Tickets"><br><br>
<input type="submit" value="Next">

</form>


</body>
</html>