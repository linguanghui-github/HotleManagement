package cn.hotel.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import cn.hotel.entity.Passenger;
import cn.hotel.entity.ReceiveTarget;

@Service
public interface ReceiveTargetservice1 {
	List<ReceiveTarget> allpassenger(Integer index01, Integer index, String txtname);
	Integer size(String txtname);
	ReceiveTarget selectrece(Integer id);
	void delectrece(Integer id);
	void updatectrece(ReceiveTarget et);
	void addctrece(ReceiveTarget et);
}
