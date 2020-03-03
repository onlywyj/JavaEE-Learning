package com.wyj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.model.PageBean;
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
		  }
		
		if("add".equals(type)) {
			
			String username_add = request.getParameter("username");

            String password_add = request.getParameter("password");

            String grade_add = request.getParameter("grade");

            String email_add = request.getParameter("email");

            User user = new User();

            user.setUsername(username_add);

            user.setPassword(password_add);

            user.setGrade(Integer.parseInt(grade_add));

            user.setEmail(email_add);

            userService.addUser(user);
            
			ArrayList<User> allUser = userService.getAllUser();
			
			request.setAttribute("allUser", allUser);
			
			request.getSession().setAttribute("user", user);

            request.getRequestDispatcher("list.jsp").forward(request, response);							
			
		  }else if("delete".equals(type)) {

				String id = request.getParameter("id");
				
				User user = new User();
				
				user.setId(Integer.parseInt(id));
				//将字符串转为整形
				if(userService.deleteUser(user)) {
					//再一次向数据库发出请求，读取全体用户的信息。
					//取值，取出全体用户的信息，放置在attitude域
					ArrayList<User> allUser = userService.getAllUser();
					
					request.setAttribute("allUser", allUser);
					
					request.getSession().setAttribute("user", user);
					//页面跳转至正确的新的页面
					request.getRequestDispatcher("list.jsp").forward(request, response);			
			
		         }
			}else if("userModify".equals(type)) {
				
				String id = request.getParameter("id");

	            User user = userService.findUserById(id);

	            request.setAttribute("user", user);

	            request.getRequestDispatcher("userModify.jsp").forward(request, response);

	        }else if("modify".equals(type)) {

	            String id = request.getParameter("id");

	            String username_mod = request.getParameter("username");

	            String password_mod = request.getParameter("password");

	            String grade_mod = request.getParameter("grade");

	            String email_mod = request.getParameter("email");

	            User user = new User();

	            user.setId(Integer.parseInt(id));

	            user.setUsername(username_mod);

	            user.setPassword(password_mod);

	            user.setGrade(Integer.parseInt(grade_mod));

	            user.setEmail(email_mod);

	            userService.modifyUser(user);          

				ArrayList<User> allUser = userService.getAllUser();
				
				request.setAttribute("allUser", allUser);
				
				request.getSession().setAttribute("user", user);

	            request.getRequestDispatcher("list.jsp").forward(request, response);
				
			}
	}
}
