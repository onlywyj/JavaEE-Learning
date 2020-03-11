package com.wyj.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.model.PageBean;
import com.wyj.model.User;
import com.wyj.service.UserService;
import com.wyj.service.UserServiceImpl;


public class PageServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	private UserService userService = new UserServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String currentPage = request.getParameter("currentPage");

        int pageSize = 10;    //每页数量为10

        ArrayList<User> recordList = userService.getAllUsersByPage(Integer.parseInt(currentPage), pageSize);

        int recordCount = userService.getUserCount();

        PageBean pageBean = new PageBean(Integer.parseInt(currentPage),pageSize,recordCount,recordList);

        request.setAttribute("pageBean", pageBean);

        request.getRequestDispatcher("list.jsp").forward(request, response);

    }	

}
