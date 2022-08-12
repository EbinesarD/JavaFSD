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
@WebServlet("/booking")
public class Booking extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=  resp.getWriter();
		Properties props= new Properties();
		resp.setContentType("text/html");
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection  con=DBConfig.getConnection(props);
		HttpSession session = req.getSession();
		String Name = (String) session.getAttribute("Name");
		
		if(con!=null) {
			//out.println("Connection is  Established\n");
			try {
				out.print("<h2>Flight Details: </h2>");
				Statement stmt = con.createStatement();
				ResultSet  rs=stmt.executeQuery("select * from tickets where Name = '"+Name+"' and Journey_Date = '"+session.getAttribute("Date")+"' and Age = "+session.getAttribute("Age")
														+" and Mobile = "+session.getAttribute("Mobile"));
				
				while(rs.next()) {
					out.print("<body style='text-align: center;'");
					String OrderNumber = rs.getString(1);
					session.setAttribute("OrderNumber", OrderNumber);
					out.println("<br><b>Order Number: </b>"+rs.getInt(1)+"<br><b>From: </b>"+rs.getString(2)
						+"<br><b>To: </b>"+rs.getString(3)+"<b><br> Date: </b>"+rs.getDate(4)
						+"<br><b>No. of Tickets: </b>"+rs.getString(5)+"<br><b>Airline: </b>"+rs.getString(6)
						+"<br><b>Name: </b>"+rs.getString(7)+"<br><b>Address: </b>"+rs.getString(8)
						+"<br><b>Mobile: </b>"+rs.getString(9)+"<br><b>Age: </b>"+rs.getString(10)
						+"<br><b>Price per ticket: </b>"+rs.getString(11)+"<br><b>Time: </b>"+rs.getString(12)+"<br><br>");
				}
				out.print("<form action='pay' method='post'>");
				out.print("<input type='submit' value='Pay'></form>");
					out.print("</body>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			
			out.print("Error While Connecting Connections");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	
}
