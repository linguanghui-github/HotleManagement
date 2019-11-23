package cn.hotel.service;

import java.util.List;

import cn.hotel.entity.PassengerPo;

public interface PassengerService {
	//查询所有数据  非本派所用
	public List<PassengerPo> selectAll();

	//模糊查询 运用 Ajax 非分页
	public List<PassengerPo> selectAjaxList(String name);

	public	PassengerPo selectById(Integer id);

	public int insertAll(PassengerPo passengerPo);

	public int updateById(PassengerPo passengerPo);
}
