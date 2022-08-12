package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/displaydetails")
public class DisplayDetails extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		
		HttpSession session = req.getSession();
		String ID =(String) session.getAttribute("ID");
		System.out.println("ID: "+ID);
		String query ="select * from routes where ID="+ID;
		RequestDispatcher rd= null;
		Properties props= new Properties();
		resp.setContentType("text/html");
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection  con=DBConfig.getConnection(props);
		if(con!=null) {
			
			try {
				Statement stmt = con.createStatement();
				ResultSet  rs=stmt.executeQuery(query);
				String From_place;
				String To_place;
				String Price_pt;
				String Airline;
				Date Journey_Date;
				String Time;
				while(rs.next()) {
					From_place=rs.getString(2);
					To_place = rs.getString(3);
					Price_pt = rs.getString(5);
					Airline = rs.getString(6);
					Journey_Date = rs.getDate(7);
					Time = rs.getString(8);
				}
					
					String Name = req.getParameter("Name");
					session.setAttribute("Name", Name);
					String Age=req.getParameter("Age");
					session.setAttribute("Age", Age);					
					String Address = req.getParameter("Address");
					session.setAttribute("Address", Address);
					String Mobile = req.getParameter("Mobile");	
					session.setAttribute("Mobile", Mobile);

					if(Name!=null && Age!=null && Address!=null && Mobile!=null)
						{
							resp.sendRedirect("insert");
						}	
				
					
			} catch (SQLException e) {
				e.printStackTrace();
				rd=req.getRequestDispatcher("personaldetails.jsp");
				rd.include(req, resp);
				out.println("<br><center><span style='color:red'>Please provide input!!</span></center>");				
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
