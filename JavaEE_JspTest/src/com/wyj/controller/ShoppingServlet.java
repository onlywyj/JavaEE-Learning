package com.wyj.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.service.BookService;
import com.wyj.service.MyCart;

public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");   
		PrintWriter out = response.getWriter();   
		//接收type值，以区分用户所想执行的动作   
		String type=request.getParameter("type");   
		MyCart myCart=new MyCart();   
		if("addBook".equals(type)){    
			//接收用户想购买的书号    
			String id=request.getParameter("id");    
			myCart=(MyCart)request.getSession().getAttribute("myCart");    
			//购买书的方法2   
			myCart.addBook2(id);   
			BookService bookService = new BookService();   
			ArrayList al = bookService.getAllBooks();   
			request.setAttribute("books", al);   
			request.getRequestDispatcher("/hall.jsp").forward(request, response);   
			return;   
			}else if("deleteBook".equals(type)){    
				//接收用户想删除的书号    
				String id=request.getParameter("id");    
				//取出购物车，并把这本书从这个购物车里删除   
				myCart =(MyCart)request.getSession().getAttribute("myCart");    
				myCart.deleteBook(id);   
				}else if("updateBook".equals(type)){    
					myCart =(MyCart)request.getSession().getAttribute("myCart"); 
					//得到用户希望更新的书号和数量  
					String []id=request.getParameterValues("id");    
					String []num=request.getParameterValues("booknum");     
					//拿到了要更新的书号和对应的数量，更新整个购物车  
					for(int i=0;i<id.length;i++){  
						myCart.updateBook(id[i], Integer.parseInt(num[i])); 
						}       
					}else if("showMyCart".equals(type)){ 
						myCart =(MyCart)request.getSession().getAttribute("myCart");
						
						}else if("clearBook".equals(type)){ 
							myCart =(MyCart)request.getSession().getAttribute("myCart");   
							myCart.clearBook();   
							}   
		//把要显示的总价格，放入到request域中，准备显示   
		request.setAttribute("totalPrice", myCart.getTotalPrice());
		request.setAttribute("bookList", myCart.showMyCart());   
		//跳转到“显示我的购物车”页面去
		request.getRequestDispatcher("/showMyCart.jsp").forward(request, response);    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}

}
