package com.itheruan.web.servlet.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheruan.doamin.User;
import com.itheruan.service.impl.UserServiceImpl;
import com.itheruan.utils.JsonUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/user/userServlet.do")
public class UserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		if ("findAllUser".equals(method)) {
			// 查询所有用户信息
			findAllUser(request, response);
		} else if ("findUserByNameAndPassoword".equals(method)) { 
			//根据用户名和密码查找用户
			findUserByNameAndPassoword(request, response);

		}

		/*
		 * else if ("findCartByCartId".equals(menthod)) { //根据卡id查询卡信息
		 * findCartByCartId(request, response);
		 * 
		 * } else if ("findPieChart".equals(menthod)) { //查看饼状图 findPieChart(request,
		 * response);
		 * 
		 * }
		 */
	}

	/**
	 * 根据用户名和密码查找用户
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void findUserByNameAndPassoword(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	
		
		User user = new UserServiceImpl().findUserByNameAndPassoword(request.getParameter("username"), request.getParameter("userpassword"));
	
		System.out.println(user);
		
		if (user!=null) {
			//登录成功
				request.getSession().setAttribute("user", user);
			  response.sendRedirect(request.getContextPath()+"/image/imageServlet.do?method=findImagesByUserId");
		}else {
			System.out.println("komh");
		}
		
		
	}

	/**
	 * 查询所有用户信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void findAllUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		List<User> userList = new UserServiceImpl().findAllUser();
		JsonUtil.writeValue(userList, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
}
