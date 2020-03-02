package com.wyj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.model.User;
import com.wyj.service.UserService;
import com.wyj.service.UserServiceImpl;


public class UserServlet extends HttpServlet {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private UserService userService = new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this.doGet(request, response);
		//两种方法
		
		String type = request.getParameter("type");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+" "+password);

		if("login".equals(type)) {
			
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			if(userService.checkUser(user)) {
				//取值，取出全体用户的信息，放置在attitude域
				ArrayList<User> allUser = userService.getAllUser();
				request.setAttribute("allUser", allUser);
				//把正确的登录用户名放入session中 30min
				request.getSession().setAttribute("username", username);
				//页面跳转至正确的新的页面
				request.getRequestDispatcher("list.jsp").forward(request, response);
				
			}else {
				//设置登录出错信息提示
				request.setAttribute("message","错误的用户名和密码");
				//重新跳转至login.jsp
				request.getRequestDispatcher("login.jsp").forward(request, response);

			}
		}else if("delete".equals(type)) {
			String id = request.getParameter("id");
			//将字符串转为整形
			if(userService.deleteUser(Integer.parseInt(id))) {
				//再一次向数据库发出请求，读取全体用户的信息。
				//取值，取出全体用户的信息，放置在attitude域
				ArrayList<User> allUser = userService.getAllUser();
				request.setAttribute("allUser", allUser);
				//页面跳转至正确的新的页面
				request.getRequestDispatcher("list.jsp").forward(request, response);
				
			}
			
		}
	}

	
}
