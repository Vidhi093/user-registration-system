package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

	static UserInfo info = new UserInfo();
	static List<UserInfo> users = info.getInfos(); 
	  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter printWriter = resp.getWriter();
		
		boolean loginresult = false;
		for (UserInfo user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            	loginresult = true;
            	printWriter.print("<!DOCTYPE html>\r\n"
            			+ "<html>\r\n"
            			+ "<head>\r\n"
            			+ "  <title>User Dashboard</title>\r\n"
            			+ "  <style>\r\n"
            			+ "    body {\r\n"
            			+ "      margin: 0;\r\n"
            			+ "      padding: 0;\r\n"
            			+ "      font-family: sans-serif;\r\n"
            			+ "      background: linear-gradient(#141e30, #243b55);\r\n"
            			+ "      display: flex;\r\n"
            			+ "      justify-content: center;\r\n"
            			+ "      align-items: center;\r\n"
            			+ "      height: 100vh;\r\n"
            			+ "    }\r\n"
            			+ "\r\n"
            			+ "    .dashboard-box {\r\n"
            			+ "      width: 400px;\r\n"
            			+ "      padding: 40px;\r\n"
            			+ "      background: rgba(0,0,0,.5);\r\n"
            			+ "      box-sizing: border-box;\r\n"
            			+ "      box-shadow: 0 15px 25px rgba(0,0,0,.6);\r\n"
            			+ "      border-radius: 10px;\r\n"
            			+ "      color: #fff;\r\n"
            			+ "      text-align: center;\r\n"
            			+ "    }\r\n"
            			+ "\r\n"
            			+ "    .dashboard-box h2 {\r\n"
            			+ "      margin: 0 0 30px;\r\n"
            			+ "      padding: 0;\r\n"
            			+ "    }\r\n"
            			+ "    .info{\r\n"
            			+ "      \r\n"
            			+ "      display: flex;\r\n"
            			+ "     \r\n"
            			+ "      text-align:center;\r\n"
            			+ "      justify-content: space-between;\r\n"
            			+ "    }\r\n"
            			+ "    .data{\r\n"
            			+ "      margin-right: 10px;\r\n"
            			+ "     \r\n"
            			+ "    }\r\n"
            			+ "    \r\n"
            			+ "    .showpass{\r\n"
            			+ "      display: flex;\r\n"
            			+ "      \r\n"
            			+ "    }\r\n"
            			
            			+ "    .password {\r\n"
            			+ "      display: none;\r\n"
            			+ "    }\r\n"
            			+ "\r\n"
            			+ "    .show-password:checked + .data {\r\n"
            			+ "      display: inline;\r\n"
            			+ "    }"
            			+ "    .dashboard-box a {\r\n"
            			+ "      display: inline-block;\r\n"
            			+ "      padding: 10px 20px;\r\n"
            			+ "      color: #03e9f4;\r\n"
            			+ "      font-size: 16px;\r\n"
            			+ "      text-decoration: none;\r\n"
            			+ "      text-transform: uppercase;\r\n"
            			+ "      transition: .5s;\r\n"
            			+ "      margin-top: 40px;\r\n"
            			+ "      letter-spacing: 4px;\r\n"
            			+ "      border-radius: 5px;\r\n"
            			+ "    }\r\n"
            			+ "\r\n"
            			+ "    .dashboard-box a:hover {\r\n"
            			+ "      background: #03e9f4;\r\n"
            			+ "      color: #fff;\r\n"
            			+ "      box-shadow: 0 0 5px #03e9f4,\r\n"
            			+ "                  0 0 25px #03e9f4,\r\n"
            			+ "                  0 0 50px #03e9f4,\r\n"
            			+ "                  0 0 100px #03e9f4;\r\n"
            			+ "    }\r\n"
            			+ "  </style>\r\n"
            			+ "</head>\r\n"
            			+ "<body>\r\n"
            			+ "\r\n"
            			+ "<div class=\"dashboard-box\">\r\n"
            			+ "  <h2>User Dashboard</h2>\r\n"
            			+ " \r\n"
            			+ " <div class=\"info\">\r\n"
            			+ "   <p>Name :</p>\r\n"
            			+ "  <p class=\"data\" >"+user.getName()+"</p>\r\n"
            			+ " </div>\r\n"
            			+ " \r\n"
            			+ "  <div class=\"info\">\r\n"
            			+ "   <p>Email :</p>\r\n"
            			+ "  <p class=\"data\">"+user.getEmail()+"</p>\r\n"
            			+ " </div>\r\n"
            			+ "  <div class=\"info\">\r\n"
            			+ "  <p>Username :</p>\r\n"
            			+ "  <p class=\"data\">"+user.getUsername()+"</p>\r\n"
            			+ " </div>\r\n"
            			+ "  <div class=\"info\">\r\n"
            			+ "  <label for=\"password\">Password:</label>\r\n"
            			+ "    <input type=\"checkbox\" class=\"show-password\">\r\n"
            			+ "    <p class=\"data password\">"+user.getPassword()+"</p>"
            			+ " </div>\r\n"
            			+ "  <a href=\"updateform.html\">Update</a>\r\n"
            			+ "  <a href=\"login_signup.html\">Go to Home Page</a>\r\n"
            			+ "</div>\r\n"
            			+ "\r\n"
            			+ "</body>\r\n"
            			+ "</html>\r\n");
            	
                break;
            } 
        }
		
		if (loginresult == false) {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "  <title>Invalid Login</title>\r\n"
					+ "  <style>\r\n"
					+ "    /* Styles for the login box */\r\n"
					+ "    html {\r\n"
					+ "      height: 100%;\r\n"
					+ "    }\r\n"
					+ "    body {\r\n"
					+ "      margin: 0;\r\n"
					+ "      padding: 0;\r\n"
					+ "      font-family: sans-serif;\r\n"
					+ "      background: linear-gradient(#141e30, #243b55);\r\n"
					+ "      display: flex;\r\n"
					+ "      justify-content: center;\r\n"
					+ "      align-items: center;\r\n"
					+ "      height: 100vh;\r\n"
					+ "    }\r\n"
					+ "\r\n"
					+ "    .login-box {\r\n"
					+ "      position: absolute;\r\n"
					+ "      top: 50%;\r\n"
					+ "      left: 50%;\r\n"
					+ "      width: 400px;\r\n"
					+ "      padding: 40px;\r\n"
					+ "      transform: translate(-50%, -50%);\r\n"
					+ "      background: rgba(0,0,0,.5);\r\n"
					+ "      box-sizing: border-box;\r\n"
					+ "      box-shadow: 0 15px 25px rgba(0,0,0,.6);\r\n"
					+ "      border-radius: 10px;\r\n"
					+ "      text-align: center;\r\n"
					+ "      color: #fff;\r\n"
					+ "    }\r\n"
					+ "\r\n"
					+ "    .login-box h2 {\r\n"
					+ "      margin: 0 0 30px;\r\n"
					+ "      padding: 0;\r\n"
					+ "    }\r\n"
					+ "\r\n"
					+ "    .login-box a {\r\n"
					+ "      display: inline-block;\r\n"
					+ "      padding: 10px 20px;\r\n"
					+ "      color: #03e9f4;\r\n"
					+ "      font-size: 16px;\r\n"
					+ "      text-decoration: none;\r\n"
					+ "      text-transform: uppercase;\r\n"
					+ "      overflow: hidden;\r\n"
					+ "      transition: .5s;\r\n"
					+ "      margin-top: 20px;\r\n"
					+ "      border-radius: 5px;\r\n"
					+ "    }\r\n"
					+ "\r\n"
					+ "    .login-box a:hover {\r\n"
					+ "      background: #03e9f4;\r\n"
					+ "      color: #fff;\r\n"
					+ "      box-shadow: 0 0 5px #03e9f4,\r\n"
					+ "                  0 0 25px #03e9f4,\r\n"
					+ "                  0 0 50px #03e9f4,\r\n"
					+ "                  0 0 100px #03e9f4;\r\n"
					+ "    }\r\n"
					+ "  </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "\r\n"
					+ "<div class=\"login-box\">\r\n"
					+ "  <h2>Invalid Login</h2>\r\n"
					+ "  <p>Your username or password is incorrect. Please try again.</p>\r\n"
					+ "  <a href=\"loginform.html\">Go back to Login</a> \r\n"
					+ "  <a href=\"registerform.html\">Go to Register</a>\r\n"
					+ "</div>\r\n"
					+ "\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n");
		
		}
	}
}
