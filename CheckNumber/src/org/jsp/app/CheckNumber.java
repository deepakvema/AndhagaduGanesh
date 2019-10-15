package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/CheckNumber")
public class CheckNumber extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String number=req.getParameter("number");
		int num=Integer.parseInt(number);
		if(num<0) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Negativev.html");
			System.out.println("-ve");
			requestDispatcher.include(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Positive.html");
			requestDispatcher.include(req, resp);
			System.out.println("+ve");
		}
	}
	

}
