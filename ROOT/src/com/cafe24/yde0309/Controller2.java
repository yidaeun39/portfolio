package com.cafe24.yde0309;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Controller2() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = request.getParameter("result");
		System.out.println("result -> " + result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		System.out.println("password 확인 -> " + password);
		String okPassword = "1234";
		int result = 0;
		if(password.equals(okPassword)) {
			System.out.println("비밀번호 일치");
			result = 1;
			request.setAttribute("result", result);
			response.sendRedirect("/passwordCheck.html");
		} else {
			System.out.println("비밀번호 불일치");
			result = 0;
			request.setAttribute("result", result);
			response.sendRedirect("/index.html");
		}
	}

}
