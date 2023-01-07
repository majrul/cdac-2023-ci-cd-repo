package com.cdac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("majrul") && password.equals("123"))
			response.getWriter().write("<h1>Welcome back</h1>");
		else
			response.getWriter().write("<h2>Incorrect username/password</h2>");
	}

}
