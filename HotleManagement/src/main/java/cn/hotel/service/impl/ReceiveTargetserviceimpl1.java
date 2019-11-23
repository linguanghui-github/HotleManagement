package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hotel.dao.PassengerDao;
import cn.hotel.dao.ReceiveTargetDao;
import cn.hotel.entity.ReceiveTarget;
import cn.hotel.service.ReceiveTargetservice1;

@Service
@RequestMapping("receiveTargetservice1")
public class ReceiveTargetserviceimpl1 implements  ReceiveTargetservice1{

	@Autowired
	ReceiveTargetDao dao;

	
	public ReceiveTargetDao getDao() {
		return dao;
	}

	public void setDao(ReceiveTargetDao dao) {
		this.dao = dao;
	}

	@Transactional(readOnly=true)

	public List<ReceiveTarget> allpassenger(Integer index01, Integer index, String txtname) {
		// TODO Auto-generated method stub
		return dao.allpassenger(index01, index, txtname);
	}

	@Transactional(readOnly=true)

	public Integer size(String txtname) {
		// TODO Auto-generated method stub
		return dao.size(txtname);
	}

	@Transactional(readOnly=true)

	public ReceiveTarget selectrece(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectrece(id);
	}

	@Transactional(readOnly=false)

	public void delectrece(Integer id) {
		// TODO Auto-generated method stub
		dao.delectrece(id);
	}

	@Transactional(readOnly=false)

	public void updatectrece(ReceiveTarget et) {
		// TODO Auto-generated method stub
		dao.updatectrece(et);
	}

	@Transactional(readOnly=false)

	public void addctrece(ReceiveTarget et) {
		// TODO Auto-generated method stub
		dao.addctrece(et);
	}

}
