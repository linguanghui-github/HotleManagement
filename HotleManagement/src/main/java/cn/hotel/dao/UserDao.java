package cn.hotel.dao;

import org.apache.ibatis.annotations.Param;

import cn.hotel.entity.Users;


public interface UserDao {
	Users loginUsers(@Param("userName") String userName, @Param("password") String password);//登录
	
}
