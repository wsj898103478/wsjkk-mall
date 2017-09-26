package com.mmall.controller.portal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 这是一个controller,所以加上Spring的@Controller,这样UserController就能起到Controller的作用
 * 
 *
 */
@Controller
@RequestMapping("/user/")
public class UserController {
	/**
	 * 用户登录
	 * @ResponseBody作用:该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为
	 * 指定格式后，写入到Response对象的body数据区。使用时机:返回的数据不是html标签的页面，而是其他某种格式的数据时
	 * 使用(如json、xml等)
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "login,do",method = RequestMethod.POST)
	@ResponseBody
	public Object login(String username,String password,HttpSession session){
		return null;
	}
}
