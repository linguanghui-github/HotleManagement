package cn.hotel.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import cn.hotel.entity.Passenger;
import cn.hotel.service.Passengerservice1;

@Controller
public class PassengerController  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8606988443050996314L;
	
	@Autowired
	Passengerservice1 service;

	public Passengerservice1 getService() {
		return service;
	}

	public void setService(Passengerservice1 service) {
		this.service = service;
	}
	
	//查询所有旅客
	@RequestMapping(value="/allPassenger")
	public String allPassenger(Model model,Integer xyy,String txtname){
		List<Passenger> er=new ArrayList<Passenger>();
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
		return "/passenger/list"; 
	}
	
	
	//删除单个或者多个旅客对象
	@RequestMapping(value="/delectassenger")
	public String delectPassenger(Integer[] id){
		
    for (int i = 0; i < id.length; i++) {
    	service.delectpassenger(id[i]);
	}
		return "forward:allPassenger?xyy=1"; 
	}
	//添加旅客对象
	@RequestMapping(value="/addassenger")
	public String addassenger(Passenger er){
		service.addpassenger(er);
		return "forward:allPassenger?xyy=1"; 
	}
	
	//进入修改界面
	@RequestMapping(value="/update")
	public String update(Integer id,Model model){
		Passenger pass=service.selectpass(id);
		model.addAttribute("pass", pass);
		return "/passenger/update"; 
	}
	
	//修改旅客
	@RequestMapping(value="/updatepass")
	public String updatepass(Passenger er){
        service.updatepass(er);
		
		return "forward:allPassenger?xyy=1"; 
	}
	
	@RequestMapping(value="selectallpass",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Object selectallpass(@RequestParam String txtname){
		List<Passenger> er=new ArrayList<Passenger>();
		if(txtname==null || txtname.length()==0){
			er=service.allpass(null);
		}else{
			er=service.allpass(txtname);
		}
		String a=null;
		for (Passenger passenger : er) {
			a+="<tr>"+
		         " <td><input type='radio' name='id' value='"+passenger.getId()+"'></td>"+
		         "<td>"+passenger.getName()+"</td>";
		         if(passenger.getGenderID()==32){
		        	 a+="<td>男</td>";
		         }else{
		        	 a+="<td>女</td>";
		         }
		         if(passenger.getPapersID()==37){
		        	 a+="<td>普通身份证</td>";
		         }else{
		        	 a+="<td>第二代身份证</td>";
		         }
		         a+="<td>"+passenger.getPapersNumber()+"</td>"+ 
		        "</tr>";
		}
		return JSONArray.toJSONString(a);
	}
	@RequestMapping(value="selectallpass02",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Object selectallpass02(@RequestParam Integer id){
		Passenger er= service.selectpass(id);
		return JSONArray.toJSONString(er);
	}
	@RequestMapping(value="selectpasspapers",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Object selectpasspapers(@RequestParam String papersNumber){
		Passenger er= service.selectpasspapers(papersNumber);
		if(er==null){
			return JSONArray.toJSONString(null);
		}
		return JSONArray.toJSONString("Nonull");
	}
	
	
	
	@RequestMapping("/adds")
	public String add(){
		
		return "/passenger/add";
	}
	}
	
    

