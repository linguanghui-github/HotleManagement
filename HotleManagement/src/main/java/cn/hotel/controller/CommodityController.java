package cn.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.hotel.utils.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hotel.entity.AttributeDetails;
import cn.hotel.entity.Commodity;
import cn.hotel.service.AttributeService;
import cn.hotel.service.CommodityService;

/**
 *
 * @author
 *
 */
@Controller
@RequestMapping("/commodity")
public class CommodityController {

	@Autowired
	private CommodityService commodityService;
	@Autowired
	private AttributeService attributeService;
	

	public void setAttributeService(AttributeService attributeService) {
		this.attributeService = attributeService;
	}
	
	public void setCommodityService(CommodityService commodityService) {
		this.commodityService = commodityService;
	}


	/**
	 * 商品详细信息 分页 模糊
	 */
	@RequestMapping("tolist")
	public String feYe(String txtname,Integer commodityTypeID,Integer pageIndex,Integer pageSize,HttpServletRequest request) {
		List<AttributeDetails> listOne=attributeService.getAttributeDetails(3);
		
		if (txtname==null) {
			txtname="";
		}
		if (commodityTypeID==null) {
			commodityTypeID=15;
		}
		PageInfo<Commodity> list=commodityService.pagesInfo(txtname, commodityTypeID, pageIndex, pageSize);
		/*PageInfo<Commodity> fy=ser.pagesInfo("雪碧", 16, 1, 3);
	   model.addAttribute("fy",fy);*/
		request.setAttribute("listOne", listOne);
		request.setAttribute("list", list);
		request.setAttribute("txtname", txtname);
		request.setAttribute("commodityTypeID", commodityTypeID);
		
		return "/commodity/list";
	}
	/**
	 * 更新
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("update")
	public String updateCommodity(Commodity commodity,HttpServletRequest request){
		Integer num = commodityService.updateCommodity(commodity);
		return "redirect:/commodity/tolist.do?commodityTypeID="+commodity.getCommodityTypeID();
	}
	
	@RequestMapping("delete")
	public String deleteCommodity(Integer [] id ,Integer commodityTypeID){
		commodityService.deleteCommodity(id);
		return "redirect:/commodity/tolist.do?commodityTypeID="+commodityTypeID;
		
	}
	/**
	 * 添加
	 * @param commodity
	 * @return
	 */
	@RequestMapping("add")
	public String addCommodity(Commodity commodity){
		Integer num=commodityService.addCommodity(commodity);
		return "redirect:/commodity/tolist.do?commodityTypeID="+commodity.getCommodityTypeID();
		
	}
	
	@RequestMapping("newadd")
	public String addAttribute(AttributeDetails attributeDetails){
		attributeService.addAttribute(attributeDetails);
		
		return "redirect:/commodity/tolist.do";
		
	}
	@RequestMapping("newdelete")
	public String delAttribute(Integer [] id){
		attributeService.deleteAttribute(id);
		return "redirect:/commodity/tolist.do";
	}
}
