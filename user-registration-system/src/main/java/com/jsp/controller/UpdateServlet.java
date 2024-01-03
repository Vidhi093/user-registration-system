package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/update")
public class UpdateServlet extends HttpServlet {

	
	static List<UserInfo> infos = UserInfo.getInfos();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String newEmail = req.getParameter("newEmail");
		PrintWriter printWriter = resp.getWriter();
		boolean updateloop = false;
		for (UserInfo userInfo : infos) {
			if (userInfo.getUsername().equals(username) && userInfo.getPassword().equals(password)) {
				userInfo.setEmail(newEmail);
				printWriter.print("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "<head>\r\n"
						+ "  <title>Email Updated</title>\r\n"
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
						+ "    .login-box p {\r\n"
						+ "      margin-bottom: 20px;\r\n"
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
						+ "  <h2>Email Updated</h2>\r\n"
						+ "  <p>Your email has been successfully updated.</p>\r\n"
						+ "  <a href=\"loginform.html\">Go to Login</a> \r\n"
						+ "</div>\r\n"
						+ "\r\n"
						+ "</body>\r\n"
						+ "</html>\r\n"
						+ "");
				updateloop = true;
				break;
			}
		}
		
		
		
		if (updateloop == false) {
			printWriter.print("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "  <title>Email Not Updated</title>\r\n"
					+ "  <style>\r\n"
					+ "    /* Styles for the message */\r\n"
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
					+ "      background: rgba(0, 0, 0, .5);\r\n"
					+ "      box-sizing: border-box;\r\n"
					+ "      box-shadow: 0 15px 25px rgba(0, 0, 0, .6);\r\n"
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
					+ "      box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4, 0 0 100px #03e9f4;\r\n"
					+ "    }\r\n"
					+ "  </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "\r\n"
					+ "<div class=\"login-box\">\r\n"
					+ "  <h2>Email Not Updated</h2>\r\n"
					+ "  <p>The email update failed. Please try again.</p>\r\n"
					+ "  <a href=\"updateform.html\">Go back to DashBoard</a>\r\n"
					+ "  <a href=\"login_signup.html\">Go to Home Page</a>\r\n"
					+ "</div>\r\n"
					+ "\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "");
		}
		
	}
}
