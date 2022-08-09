package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
@WebServlet("/submit")
public class SaveServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		
		SessionFactory factory= HibernateUtils.getSessionFactory();
		Session session= factory.openSession();

		String name = req.getParameter("name");
		String price = req.getParameter("price");
		RequestDispatcher rd = null;
		try {
			if(name!=null && price!=null)
			{
				rd=req.getRequestDispatcher("insert");
				rd.forward(req, resp);
			}
		} 
		catch (Exception e) {
			rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			resp.setContentType("text/html");
			out.println("<br><center><span style='color:red'>Please provide input!!</span></center>");		
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
