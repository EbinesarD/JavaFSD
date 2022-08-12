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
@WebServlet("/pay")
public class Pay extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		Properties props= new Properties();
		resp.setContentType("text/html");
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection  con=DBConfig.getConnection(props);
		try {
			out.print("<h2>Payment: </h2>");
			Statement stmt = con.createStatement();
			ResultSet  rs=stmt.executeQuery("select * from tickets where OrderNumber ="+session.getAttribute("OrderNumber"));
			
			while(rs.next()) {
				out.print("<body style='text-align: center;'");
		
				out.println("<br><b>Order Number: </b>"+rs.getInt(1)+"<br><b>Total Price: </b>"+rs.getString(13));
			}
			out.print("<form action='confirm.jsp' method='post'>");
			out.print("<input type='submit' value='Confirm'></form>");
				out.print("</body>");
		} catch (SQLException e) {
			resp.sendRedirect("booking");
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
