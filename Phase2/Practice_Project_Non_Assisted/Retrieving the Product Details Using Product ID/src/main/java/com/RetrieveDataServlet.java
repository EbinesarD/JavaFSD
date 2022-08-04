package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/retrieve")
public class RetrieveDataServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=  resp.getWriter();
		Properties props= new Properties();
		resp.setContentType("text/html");
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection  con=DBConfig.getConnection(props);
		if(con!=null) {
			//out.println("Connection is  Established\n");
			try {
				out.print("Product Details: ");
				Statement stmt = con.createStatement();
				ResultSet  rs=stmt.executeQuery("select * from eproduct where id = "+req.getParameter("id"));
				
				while(rs.next()) {
					out.println("<br>Id: "+rs.getInt(1)+" <br>Product Name: "+rs.getString(2)+"<br> Product Price: "
							+rs.getBigDecimal(3)+"<br> TimeStamp: "
							+rs.getTimestamp(4)+"<br>");
				}
					
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
