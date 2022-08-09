package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
@WebServlet("/insert")
public class DataInsertServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		SessionFactory factory= HibernateUtils.getSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		Product p = new Product(name,price);
		session.save(p);
		
		tx.commit();
		
		session.close();
		out.print("Data inserted Successfully");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
