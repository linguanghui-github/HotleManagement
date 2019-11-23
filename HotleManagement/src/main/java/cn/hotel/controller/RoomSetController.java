package cn.hotel.controller;

import javax.servlet.http.HttpServletRequest;

import cn.hotel.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hotel.entity.Room;
import cn.hotel.service.AttributeService;
import cn.hotel.service.RoomSetService;
@Controller
@RequestMapping("/room")
public class RoomSetController {
	@Autowired
	private RoomSetService roomSetService;
	@Autowired
	private AttributeService attributeService;

	public void setRoomSetService(RoomSetService roomSetService) {
		this.roomSetService = roomSetService;
	}
	
	public void setAttributeService(AttributeService attributeService) {
		this.attributeService = attributeService;
	}
	/**
	 * 查询房间 支持模糊查询 分页
	 * @param txtname
	 * @param pageIndex
	 * @param pageSize
	 * @param request
	 * @return
	 */
	@RequestMapping("/roomSet")
	public String findRoomSet(String txtname,Integer pageIndex,Integer pageSize,HttpServletRequest request) {
		
		PageInfo<Room> roomSet=roomSetService.getRoomInfoSet(txtname,pageIndex,pageSize);
		if (roomSet!=null) {
			request.setAttribute("roomSet", roomSet);
			request.setAttribute("txtname", txtname);
			return "/roomset/roomset";
		}
		return "/mian/mian";
	}
	
	@RequestMapping("addroom")
	public String addRoomSet(Room room){
		Integer num=roomSetService.addRoom(room);
		if (num==null) {
			return "/roomset/add";
		}
		return "redirect:/room/roomSet";
	}
	@RequestMapping("/updateroom")
	public String updateRoom(Room room){
	Integer num=roomSetService.updateRoom(room);
	if (num==null) {
		return "redirect:/room/check";
	}
	return "redirect:/room/roomSet";
		
		
	}
	@RequestMapping("delete")
	public String deleteRoom(Integer [] id){
		Integer num=roomSetService.deleteRoom(id);
		return "redirect:/room/roomSet";
	}
	
}
