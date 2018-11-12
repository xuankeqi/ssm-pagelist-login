package cn.hc.ssm.controllers;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.hc.ssm.entities.User;
import cn.hc.ssm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 登录
	 */
	@RequestMapping("/login")
	public String login(String userName,String password,HttpSession session,Map<String,Object> map) throws ServletException, IOException{
		System.out.println(userName);
		User user = userService.login(userName, password);
		if(user == null){
			session.setAttribute("loginError", "用户名或密码错误");
			return "redirect:/login.jsp";
		}
		session.setAttribute("user", user);
		if("admin".equals(user.getRole())){
			//forward:/showEmpsAndDepts : 转发,链接地址不会变
			//redirect:/getPageBean?pageNo=2&pageSize=2 : 重定向,链接地址变为此地址
			return "redirect:/getPageBean?pageNo=2&pageSize=2";
		}else {
			return "login-success";
		}
	}
	
}
