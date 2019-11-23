package cn.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hotel.entity.Passenger;
import cn.hotel.entity.PassengerPo;

public interface PassengerDao {
    //查询所有数据  
    public List<PassengerPo> selectAll();
    
    //模糊查询 运用 Ajax 非分页
    public List<PassengerPo> selectAjaxList(String name);
    
    //根据id查询
    public	PassengerPo selectById(Integer id);
    
    //添加
    public int insertAll(PassengerPo passengerPo);
    
    //修改
    public int updateById(PassengerPo passengerPo);
    
    /*刘成*/
     
     
    List<Passenger> allpassenger(@Param("index") Integer index01
            , @Param("index01") Integer index
            , @Param("txtname") String txtname);
    
	Integer size(@Param("txtname") String txtname);
	
	void delectpassenger(@Param("id") Integer id);
	
	void addpassenger(Passenger er);
	
	Passenger selectpass(@Param("id") Integer id);
	
	void updatepass(Passenger er);
	
	List<Passenger> allpass(@Param("txtname") String txtname);
	
	Passenger selectpasspapers(@Param("papersNumber") String papersNumber);
}
