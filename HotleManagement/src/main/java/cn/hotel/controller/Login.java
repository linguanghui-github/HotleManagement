package cn.hotel.controller;

import java.util.List;

import cn.hotel.utils.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.hotel.entity.StayRegisterPo;
import cn.hotel.entity.Users;
import cn.hotel.service.StayRegisterService;
import cn.hotel.service.UserService;


@Controller
@RequestMapping("/Login")
public class Login {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private StayRegisterService stayRegisterService;
	
	@RequestMapping("/tologin")
	public String tologin(){
		return "/login/login";
	}
	
	@RequestMapping("/tomain")
	public ModelAndView tomain(Users user){
		ModelAndView mv=null;
		double zongFeiYongOne=0;
		double zongFeiYongTwo=0;
		String newPassword = PasswordUtil.md5(user.getPassword(),user.getUserName(),5);
		Users u=userService.loginUsers(user.getUserName(),newPassword);
		List<StayRegisterPo> list=stayRegisterService.selectAll();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getReceiveTargetID()==2) {
				zongFeiYongOne+=list.get(i).getSumConst();
			}else {
				zongFeiYongTwo+=list.get(i).getSumConst();
			}
		}
		
		if (u!=null) {
			mv=new ModelAndView("/main/main");
		}else {
			mv=new ModelAndView("/login/login");
		}
		mv.addObject("zongFeiYongOne",zongFeiYongOne);
		mv.addObject("zongFeiYongTwo",zongFeiYongTwo);
		return mv;
	}
	

}
