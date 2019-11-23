package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hotel.dao.CommodityDao;
import cn.hotel.entity.Commodity;
import cn.hotel.utils.PageInfo;
import cn.hotel.service.CommodityService;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityDao dao;

	public void setDao(CommodityDao dao) {
		this.dao = dao;
	}

	@Override
	public PageInfo<Commodity> pagesInfo(String name, Integer rid, Integer pageIndex, Integer pageSize) {
		PageInfo<Commodity> fy = new PageInfo<Commodity>();
		fy.setPageIndex(pageIndex);
		fy.setPageSize(pageSize);
	/*	if (name == null) {
			name = "";
		}*/
		Integer totalCount = dao.sunTiao(name, rid);

		if (totalCount != 0) {
			fy.setTotalCount(totalCount);

			List<Commodity> list = dao.commInfoList(name, rid, (fy.getPageIndex() - 1) * fy.getPageSize(),
					fy.getPageSize());
			fy.setList(list);
		}
		return fy;
	}

	@Override
	public Integer addCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		return dao.addCommodity(commodity);
	}

	@Override
	public Integer updateCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		return dao.updateCommodity(commodity);
	}

	@Override
	public Integer deleteCommodity(Integer[] id) {
		// TODO Auto-generated method stub
		return dao.deleteCommodity(id);
	}

	@Override
	public Commodity getCommodity(Integer id) {
		// TODO Auto-generated method stub
		return dao.getCommodity(id);
	}

	@Override
	public List<Commodity> fuzzySelect(String commodityName, int commodityTypeID) {
		// TODO Auto-generated method stub
		return dao.fuzzySelect(commodityName, commodityTypeID);
	}
	
	

}
