package cn.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hotel.entity.Commodity;

public interface CommodityDao {
	// 查询商品详细信息
	public List<Commodity> commInfoList(@Param("name") String name, @Param("rid") Integer rid,
                                        @Param("currentPage") Integer currentPage,
                                        @Param("pageSize") Integer pageSize);

	//统计总数
	public Integer sunTiao(@Param("name") String name, @Param("rid") Integer rid);
	
	//根据id查询
	public Commodity getCommodity(Integer id);
	
	//添加
	public Integer addCommodity(Commodity commodity);
	
	//修改
	public Integer updateCommodity(Commodity commodity);
	
	//删除
	public Integer deleteCommodity(Integer[] id);
	
	//根据条件查询 （无分页）
	 public List<Commodity> fuzzySelect(@Param("commodityName") String commodityName,
                                        @Param("commodityTypeID") int commodityTypeID);
}
