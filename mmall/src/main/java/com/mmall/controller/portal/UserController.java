package com.mmall.controller.portal;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ����һ��controller,���Լ���Spring��@Controller,����UserController������Controller������
 * 
 *
 */
@Controller
@RequestMapping("/user/")
public class UserController {
	/**
	 * �û���¼
	 * @ResponseBody����:��ע�����ڽ�Controller�ķ������صĶ���ͨ���ʵ���HttpMessageConverterת��Ϊ
	 * ָ����ʽ��д�뵽Response�����body��������ʹ��ʱ��:���ص����ݲ���html��ǩ��ҳ�棬��������ĳ�ָ�ʽ������ʱ
	 * ʹ��(��json��xml��)
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
