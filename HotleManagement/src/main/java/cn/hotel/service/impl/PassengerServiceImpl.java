package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hotel.dao.PassengerDao;
import cn.hotel.entity.PassengerPo;
import cn.hotel.service.PassengerService;
@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	private PassengerDao passengerDao;
	

	public void setPassengerDao(PassengerDao passengerDao) {
		this.passengerDao = passengerDao;
	}

	@Override
	public List<PassengerPo> selectAll() {
		return passengerDao.selectAll();
	}

	@Override
	public List<PassengerPo> selectAjaxList(String name) {
		return passengerDao.selectAjaxList(name);
	}

	@Override
	public PassengerPo selectById(Integer id) {
		return passengerDao.selectById(id);
	}

	@Override
	public int insertAll(PassengerPo passengerPo) {
		// TODO Auto-generated method stub
		return passengerDao.insertAll(passengerPo);
	}

	@Override
	public int updateById(PassengerPo passengerPo) {
		// TODO Auto-generated method stub
		return passengerDao.updateById(passengerPo);
	}

}
