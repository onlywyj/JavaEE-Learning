package com.wyj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.model.PageBean;
import com.wyj.model.User;
import com.wyj.service.UserService;
import com.wyj.service.UserServiceImpl;
import com.wyj.util.MD5;

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

		
		if("login".equals(type)) {
			
			String username = request.getParameter("username");
			
			//String password = request.getParameter("password");
			
			String password = MD5.getResult(request.getParameter("password"));
			
			System.out.println(username+" "+password);
			
			User user = new User();
			
			user.setUsername(username);
			
			user.setPassword(password);
			
			if(userService.checkUser(user)) {
				
				int currentPage = 1;

				int pageSize = 5;    //每页数量为5

	            ArrayList<User> recordList = userService.getAllUsersByPage(currentPage, pageSize);

	            int recordCount = userService.getUserCount();

	            PageBean pageBean = new PageBean(currentPage,pageSize,recordCount,recordList);

	            request.setAttribute("pageBean", pageBean);
				//把正确的登录用户名放入session中 30min
				request.getSession().setAttribute("username", username);
				//页面跳转至正确的新的页面
				request.getRequestDispatcher("list.jsp").forward(request, response);
				
			}else {				
				//重新跳转至login.jsp,并传递一个参数error
				request.getRequestDispatcher("login.jsp?error=yes").forward(request, response);

			  }
		  }
	
		if("add".equals(type)) {
			
			String username_add = request.getParameter("username");

            String password_add = MD5.getResult(request.getParameter("password"));

            String grade_add = request.getParameter("grade");

            String email_add = request.getParameter("email");

            User user = new User();

            user.setUsername(username_add);

            user.setPassword(password_add);

            user.setGrade(Integer.parseInt(grade_add));

            user.setEmail(email_add);

            userService.addUser(user);
			
			request.setAttribute("allUser", userService.getAllUsers());

            request.getRequestDispatcher("list.jsp").forward(request, response);	
			
		  }else if("delete".equals(type)) {

				String id = request.getParameter("id");
				
				User user = new User();
				
				user.setId(Integer.parseInt(id));
				//将字符串转为整形
				if(userService.deleteUser(user)) {
					
					request.setAttribute("allUser", userService.getAllUsers());
					
					//页面跳转至正确的新的页面
					request.getRequestDispatcher("list.jsp").forward(request, response);	
			
		         }
			}else if("delBySelected".equals(type)) {

	            String [] para = request.getParameterValues("myselect");       

	            StringBuffer inParams = new StringBuffer();

	            for(int i=0; i<para.length; i++){

	                   inParams.append(para[i]);

	                   inParams.append(",");

	                }

	            String para2 = inParams.substring(0, inParams.length()-1);	//去掉para2中的最后一个逗号

	            userService.deleteUserBySelected(para2);
	           
	            ArrayList<User> allUser = userService.getAllUsers();
				
				request.setAttribute("allUser", allUser);
	            
				//此方法不知为何取不出来数据，暂时记录
	            //request.setAttribute("allUsers", userService.getAllUsers());

	            request.getRequestDispatcher("list.jsp").forward(request, response);				
		
	        }else if("userModify".equals(type)) {
				
				String id = request.getParameter("id");

	            User user = userService.findUserById(id);

	            request.setAttribute("user", user);

	            request.getRequestDispatcher("userModify.jsp").forward(request, response);

	        }else if("modify".equals(type)) {

	            String id = request.getParameter("id");

	            String username_mod = request.getParameter("username");

	            String password_mod = MD5.getResult(request.getParameter("password"));

	            String grade_mod = request.getParameter("grade");

	            String email_mod = request.getParameter("email");

	            User user = new User();

	            user.setId(Integer.parseInt(id));

	            user.setUsername(username_mod);

	            user.setPassword(password_mod);

	            user.setGrade(Integer.parseInt(grade_mod));

	            user.setEmail(email_mod);

	            userService.modifyUser(user);          
				
				request.setAttribute("allUser", userService.getAllUsers());

	            request.getRequestDispatcher("list.jsp").forward(request, response);
				
			}
		
		if("signout".equals(type)) {

	    //销毁session
		request.getSession().removeAttribute("username");
		//request.getSession().invalidate();
		
		//清除页面缓存
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		//请求和响应的信息都不应该被存储在对方的磁盘系统中； 
		response.addHeader( "Cache-Control", "no-store");
		//于客户机的每次请求，代理服务器必须向服务器验证缓存是否过时；
		response.addHeader( "Cache-Control", "must-revalidate");
		
		//删除cookie
		Cookie cookie=new Cookie("user", null); //既然删除cooki,user属性值直接设为 null
		//设置setMaxAge(0)
		cookie.setMaxAge(0);
		//响应
		//response.addCookie(cookie);
		
		//跳转到登录页面
		response.sendRedirect("login.jsp");
	
		}
		
	}
}
