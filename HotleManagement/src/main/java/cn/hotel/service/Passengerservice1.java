package cn.hotel.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hotel.entity.Passenger;

public interface Passengerservice1 {
	List<Passenger> allpassenger(Integer index01
            , Integer index
            , String txtname);
	Integer size(String txtname);
	void delectpassenger(Integer id);
	void addpassenger(Passenger er);
	Passenger selectpass(Integer id);
	void updatepass(Passenger er);
	List<Passenger> allpass(String txtname);
	Passenger selectpasspapers(String papersNumber);
}
