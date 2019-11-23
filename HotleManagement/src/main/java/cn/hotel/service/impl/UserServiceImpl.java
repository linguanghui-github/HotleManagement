package cn.hotel.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hotel.dao.UserDao;
import cn.hotel.entity.Users;
import cn.hotel.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * 用户登录
	 */
	@Override
	public Users loginUsers(String userName, String password) {
		
		return userDao.loginUsers(userName, password);
	}

}
