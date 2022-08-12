package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/flightdetails")
public class FlightsAvailable extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String Quantity = req.getParameter("Tickets");
		session.setAttribute("Quantity", Quantity);
		String Date = req.getParameter("Date");
		session.setAttribute("Date", Date);
		String Route = req.getParameter("Route");
		session.setAttribute("Route", Route);
		System.out.println(session.getAttribute("Route"));
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		Properties props= new Properties();
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection con=DBConfig.getConnection(props);
		resp.setContentType("text/html");
		out.print("Journey Date: "+req.getParameter("Date")+"<br>");
		String query = "select * from routes where Date='"+req.getParameter("Date") +"' and Route = '"+session.getAttribute("Route")+"'";
		
			try
			{
				Statement stmt = con.createStatement();
				ResultSet rs =stmt.executeQuery(query);
				
				out.print("<h2 style='text-align: center;'><b>Flights Available</b></h2><br>");
				while(rs.next())
				{
					out.print("<body style='text-align: center;'>");
					out.print("ID:"+rs.getString(1)+"<br>");
					out.print("From:"+rs.getString(2)+"<br>");
					out.print("To:"+rs.getString(3)+"<br>");
					out.print("Price per ticket:"+rs.getString(5)+"<br>");
					out.print("Airline:"+rs.getString(6)+"<br>");
					out.print("Date:"+rs.getString(7)+"<br>");
					out.print("Time:"+rs.getString(8)+"<br>");
					out.print("<br>--------------------------------------------------<br>");
				}	
				
				out.print("<form action='personaldetails.jsp' method='post' >");
				out.print("<input type='number' name='ID' placeholder='Book a flight by ID'><br><br>");
				out.print("<input type='submit' value='Book'></form></body>");
				
				
			}catch (SQLException e) {
				
				resp.sendRedirect("airline.jsp");
				e.printStackTrace();
				out.print("<center>No Flights available</center>");
			}	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}	
}