package com.wyj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.domain.Users;
import com.wyj.service.BookService;
import com.wyj.service.MyCart;
import com.wyj.service.UserService;

/**
 * Servlet implementation class GoHall
 */
public class GoHall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");   
		PrintWriter out = response.getWriter();   // 取出从登陆页面数据的用户名和密码。只要是页面传递的 参数，都可以使用 request.getParameter()方法   
		String username = request.getParameter("username");   
		String password = request.getParameter("password");   // 创建一个登陆对象  
		Users users = new Users();   
		users.setUsername(username);   
		users.setPassword(password);   //先判断用户是否已经成功登录过,如果登陆过，则直接跳转到购物大厅。无需再次 分配一个新的购物车。  
		if(request.getSession().getAttribute("userinfo")!=null){    
			BookService bookService = new BookService();    
			ArrayList al = bookService.getAllBooks();    
			request.setAttribute("books", al);       
			request.getRequestDispatcher("/hall.jsp").forward(request,response);    
			return ;//这句话必须加上，禁止程序继续向下执行 
			}   
		// 用对应的业务逻辑类UserService 来完成验证用户的工作。首先要新建一个业 务逻辑类的对象,在调用这个对象对应的方法即可  
		UserService userService = new UserService();   
		if (userService.checkUsers(users)) {
			request.getSession().setAttribute("userinfo", users);    // 说明是合法的，可以跳转到购物大厅    // 在跳转之前，得到所有的书信息，放入request的Attribute域中，以 便带入到下一个页面，一定不能放入session中，    //用户登录成功时，就给这个用户分配一个空的购物车   
			MyCart myCart=new MyCart();   
			request.getSession().setAttribute("myCart", myCart);
			BookService bookService = new BookService();   
			ArrayList al = bookService.getAllBooks();   
			request.setAttribute("books", al);          
			request.getRequestDispatcher("/hall.jsp").forward(request,response);   
			} else {   
				request.setAttribute("errinfo", "错误的用户名或密码！");   
				request.getRequestDispatcher("/login.jsp").forward(request,response);   
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doGet(request, response);
	}

}
