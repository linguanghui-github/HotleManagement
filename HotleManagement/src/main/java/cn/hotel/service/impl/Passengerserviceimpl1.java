package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hotel.dao.PassengerDao;
import cn.hotel.dao.UserDao;
import cn.hotel.entity.Passenger;
import cn.hotel.service.Passengerservice1;

@Service
@RequestMapping("passengerservice1")
public class Passengerserviceimpl1 implements Passengerservice1{

	@Autowired
	PassengerDao dao;

	public PassengerDao getDao() {
		return dao;
	}

	public void setDao(PassengerDao dao) {
		this.dao = dao;
	}

	

	
	
	@Transactional(readOnly=false)
	@Override
	public void delectpassenger(Integer id) {
		dao.delectpassenger(id);
		
	}
	
	@Transactional(readOnly=false)
	@Override
	public void addpassenger(Passenger er) {
		dao.addpassenger(er);
		
	}

	@Transactional(readOnly=true)
	@Override
	public Passenger selectpass(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectpass(id);
	}

	@Transactional(readOnly=false)
	@Override
	public void updatepass(Passenger er) {
		dao.updatepass(er);
		
	}

	@Transactional(readOnly=true)
	@Override
	public List<Passenger> allpassenger(Integer index01, Integer index, String txtname) {
		// TODO Auto-generated method stub
		return dao.allpassenger(index01, index, txtname);
	}

	@Transactional(readOnly=true)
	@Override
	public Integer size(String txtname) {
		// TODO Auto-generated method stub
		return dao.size(txtname);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Passenger> allpass(String txtname) {
		// TODO Auto-generated method stub
		return dao.allpass(txtname);
	}

	@Transactional(readOnly=true)
	@Override
	public Passenger selectpasspapers(String papersNumber) {
		// TODO Auto-generated method stub
		return dao.selectpasspapers(papersNumber);
	}
	
}
