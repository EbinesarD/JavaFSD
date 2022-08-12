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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
@WebServlet("/insert")
public class InsertDetails extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		SessionFactory factory= HibernateUtils.getSessionFactory();
		Session session= factory.openSession();
		HttpSession hsession = req.getSession();
		Properties props= new Properties();
		resp.setContentType("text/html");
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		Connection  con=DBConfig.getConnection(props);
		if(con!=null) {
			
			try {
				Statement stmt = con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from routes where ID = "+hsession.getAttribute("ID"));
				String From_place = null;
				String To_place=null;
				String Price=null;
				String Airline=null;
				Date Journey_Date = null;
				String Time=null;
				
				while(rs.next()) {
					From_place=rs.getString(2);
					To_place = rs.getString(3);
					Price = rs.getString(5);
					Airline = rs.getString(6);
					Journey_Date = rs.getDate(7);
					Time = rs.getString(8);
				}
					
					String Name = (String) hsession.getAttribute("Name");
					String Age= (String) hsession.getAttribute("Age");
					String Address = (String) hsession.getAttribute("Address");
					String Mobile = (String) hsession.getAttribute("Mobile");	
					String Quantity = (String) hsession.getAttribute("Quantity");
					double p = Double.parseDouble(Price);
					double q = Double.parseDouble(Quantity);
					double total = p*q;
					String Total_Price = Double.toString(total);
					Transaction tx= session.beginTransaction();
					Tickets t = new Tickets(From_place,To_place,Journey_Date,Quantity,Airline,Name,Address,Mobile,Age,Price,Time,Total_Price);
					session.save(t);				
					tx.commit();
					resp.sendRedirect("booking");
					session.close();
					System.out.println("\nData inserted");
					
					
					
			} catch (SQLException e) {
				System.out.println("Catch Exception caught "+e);
				e.printStackTrace();
			}
			catch (Exception e) {
				System.out.println(e);
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
