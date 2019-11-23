package cn.hotel.entity;

import java.io.Serializable;

public class Users implements Serializable {

	private static final long serialVersionUID = 3296106641783078626L;
	private Integer id;//id
	private String userName;//名称
	private String password;//密码
	public Users(Integer id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public Users() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	  
	
}
