package cn.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hotel.entity.ReceiveTarget;
import cn.hotel.entity.ReceiveTargetPo;


public interface ReceiveTargetDao {
	
	 //ajax查询 预订所用
    public List<ReceiveTargetPo> ajaxSelect(String teamName);
    
    
	List<ReceiveTarget> allpassenger(@Param("index") Integer index01
            , @Param("index01") Integer index
            , @Param("txtname") String txtname);
	Integer size(@Param("txtname") String txtname);
	ReceiveTarget selectrece(@Param("id") Integer id);
	void delectrece(@Param("id") Integer id);
	void updatectrece(ReceiveTarget et);
	void addctrece(ReceiveTarget et);
}
