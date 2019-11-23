package cn.hotel.service;

import cn.hotel.entity.Users;

public interface UserService {
	Users loginUsers(String userName, String password);//登录
}
