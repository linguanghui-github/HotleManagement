package cn.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hotel.entity.AttributeDetails;
import cn.hotel.entity.Commodity;
import cn.hotel.entity.Room;
import cn.hotel.service.AttributeService;
import cn.hotel.service.CommodityService;
import cn.hotel.service.RoomSetService;

@Controller
@RequestMapping("/common")
public class CommonController {
	@Autowired
	private RoomSetService roomSetService;
	@Autowired
	private AttributeService attributeService;
	@Autowired
	private CommodityService commodityService;

	public void setRoomSetService(RoomSetService roomSetService) {
		this.roomSetService = roomSetService;
	}
	
	public void setAttributeService(AttributeService attributeService) {
		this.attributeService = attributeService;
	}
	
	
	public void setCommodityService(CommodityService commodityService) {
		this.commodityService = commodityService;
	}

	@RequestMapping("check")
	public String selectType(String param,Integer id,HttpServletRequest request){
		if (param.equals("addRoom") || param.equals("updateRoom")) {//用于房间使用
		List<AttributeDetails> list=attributeService.getAttributeDetails(1);
		List<AttributeDetails> listOne=attributeService.getAttributeDetails(2);
		if (list!=null) {
			request.setAttribute("listTwo", list);
			request.setAttribute("listOne", listOne);
		}
		if (param.equals("addRoom")) {
			
			
			return "/roomset/add";
		}
		if (param.equals("updateRoom")) {
			Room room=roomSetService.getRoom(id);
			request.setAttribute("listPo", room);
			return "/roomset/update";
		}
		} else if (param.equals("addCommodity") || param.equals("updateCommdity")) {
			List<AttributeDetails> list=attributeService.getAttributeDetails(3);
			List<AttributeDetails> listOne=attributeService.getAttributeDetails(15);
			if (list!=null) {
				request.setAttribute("listTwo", list);
				request.setAttribute("listOne", listOne);
			}
			if (param.equals("addCommodity")) {
				return "/commodity/add";
			}
			if (param.equals("updateCommdity")) {
				Commodity commodity=commodityService.getCommodity(id);
				if (commodity!=null) {
					request.setAttribute("listPo", commodity);
				}
				return "/commodity/update";
			}
		}
		return null;
		
	}

}
