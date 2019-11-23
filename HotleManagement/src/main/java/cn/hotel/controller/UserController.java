package cn.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hotel.entity.Users;
import cn.hotel.service.UserService;

@Controller
public class UserController {
	@Autowired
	private  UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping(value="login")
	public String loginUsers(String userName,String password){
		Users users = userService.loginUsers(userName, password);
		if (users == null) {
			return "/login/login";
		}
		return "/main/main";
	}
}
