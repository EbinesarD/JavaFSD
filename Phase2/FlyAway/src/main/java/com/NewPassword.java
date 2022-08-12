package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/newpassword")

public class NewPassword extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Properties props= new Properties();
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection con=DBConfig.getConnection(props);
		resp.setContentType("text/html");
		String Password = req.getParameter("NPassword");
		String Name = req.getParameter("Name");
		String query = "update admin set Password ='"+Password+"' where Name = '"+Name+"';";
		try
		{
			Statement stmt = con.createStatement();
			stmt.execute(query);
			out.print("Password updated<br>");
			out.print("<a href='admin.jsp'>Go back to admin page</a>");
		}
		catch (SQLException e) {
			e.printStackTrace();
			out.print("Password not updated<br>");
			resp.sendRedirect("admin.jsp");			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}	
}
