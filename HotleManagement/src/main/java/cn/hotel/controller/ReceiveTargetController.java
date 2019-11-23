package cn.hotel.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hotel.entity.ReceiveTarget;
import cn.hotel.service.ReceiveTargetservice1;

@Controller
public class ReceiveTargetController  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4223626572975330967L;
	
	@Autowired
	ReceiveTargetservice1 service;

	public ReceiveTargetservice1 getService() {
		return service;
	}

	public void setService(ReceiveTargetservice1 service) {
		this.service = service;
	}
	
	//查询所有接待信息
	@RequestMapping(value="/allreceive")
	public String allPassenger(Model model,Integer xyy,String txtname){
		List<ReceiveTarget> er=new ArrayList<ReceiveTarget>();
		if(xyy==null || xyy==0){
			er= service.allpassenger((xyy-1)*10, 10, txtname);
			model.addAttribute("xyy", 1);
		}else{
			er= service.allpassenger((xyy-1)*10, 10, txtname);
			model.addAttribute("xyy", xyy);
		}
		Integer a=null;
		if(service.size(txtname)%10==0){
			a=service.size(txtname)/10;
		}else{
			a=(service.size(txtname)/10)+1;
		}
		
		model.addAttribute("txtname", txtname);
		model.addAttribute("list", er);
		model.addAttribute("a", a);
		return "/receivetarget/list"; 
	}
	
	
	//删除单个或者多个接待对象
	@RequestMapping(value="/delectreceive")
	public String delectPassenger(Integer[] id){
		
    for (int i = 0; i < id.length; i++) {
    	service.delectrece(id[i]);
	}
		return "forward:allreceive?xyy=1"; 
	}
	
	//进入修改界面
	@RequestMapping(value="/updatereceive")
	public String updatereceive(Integer id,Model model){
		ReceiveTarget pass=service.selectrece(id);
		model.addAttribute("list", pass);
		return "/receivetarget/update"; 
	}
	
	@RequestMapping(value="/updateReceiveTarget")
	public String updateReceiveTarget(ReceiveTarget et,Model model){
		service.updatectrece(et);
		return "forward:allreceive?xyy=1"; 
	}
	@RequestMapping(value="/addReceiveTarget")
	public String addReceiveTarget(ReceiveTarget et,Model model){
		service.addctrece(et);
		return "forward:allreceive?xyy=1"; 
	}
	
	@RequestMapping("/addss")
	public String add(){
		
		return "/receivetarget/add";
	}
	
	}
	
    

