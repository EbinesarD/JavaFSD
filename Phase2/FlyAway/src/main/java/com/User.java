package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/user")
public class User extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=  resp.getWriter();
		Properties props= new Properties();
		RequestDispatcher rd =null;
		resp.setContentType("text/html");
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection  con=DBConfig.getConnection(props);
		if(con!=null)
		{
			try {
				Statement stmt = con.createStatement();
				ResultSet  rs=stmt.executeQuery("select * from admin where Name = '"+req.getParameter("Name")+ "' and Password = '"+req.getParameter("Password")+"';");
				if(rs.next())
				{
					rd=req.getRequestDispatcher("admin.jsp");
					rd.forward(req, resp);
				}
				else
				{				
					rd=req.getRequestDispatcher("index.jsp");
					rd.forward(req, resp);
					out.println("Please enter a valid UserName and Password<br>");
				}
			} catch (Exception e) {
				e.printStackTrace();
				rd=req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
				out.println("Please enter a valid UserName and Password<br>");
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
