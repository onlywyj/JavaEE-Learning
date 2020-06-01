package com.wyj.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		System.out.println("preHandle...");
		//获取请求的RUi:去除http:localhost:8080这部分剩下的
		String uri = request.getRequestURI();
		//URL:除了login.jsp是可以公开访问的，其他的URL都进行拦截控制
		if(uri.indexOf("/login") >=0) {
			return true;
		}
		if(uri.indexOf("/checkUser") >=0) {
			return true;
		}
		//获取session
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username!=null) {
			return true;
		}
		request.setAttribute("msg", "您还没有登录！");
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		return false;
	}

}
