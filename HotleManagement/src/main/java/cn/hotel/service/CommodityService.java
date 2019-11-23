package cn.hotel.service;

import java.util.List;
import cn.hotel.entity.Commodity;
import cn.hotel.utils.PageInfo;

public interface CommodityService {
	/**
	 * 分页 支持模糊查询 
	 * @param name
	 * @param role
	 * @return
	 */
	public PageInfo<Commodity> pagesInfo(String name, Integer rid,
                                         Integer pageIndex,
                                         Integer pageSize);
	public Integer addCommodity(Commodity commodity);
	public Integer updateCommodity(Commodity commodity);
	public Integer deleteCommodity(Integer[] id);
	public Commodity getCommodity(Integer id);
	public List<Commodity> fuzzySelect(String commodityName, int commodityTypeID);
}
