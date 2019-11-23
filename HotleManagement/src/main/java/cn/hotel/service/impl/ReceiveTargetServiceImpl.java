package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hotel.dao.ReceiveTargetDao;
import cn.hotel.entity.ReceiveTargetPo;
import cn.hotel.service.ReceiveTargetService;
@Service(value="receiveTargetService")
public class ReceiveTargetServiceImpl implements ReceiveTargetService {
	@Autowired
	private ReceiveTargetDao receiveTargetDao;
	
	public void setReceiveTargetDao(ReceiveTargetDao receiveTargetDao) {
		this.receiveTargetDao = receiveTargetDao;
	}



	public List<ReceiveTargetPo> ajaxSelect(String teamName) {
		// TODO Auto-generated method stub
		return receiveTargetDao.ajaxSelect(teamName);
	}

}
