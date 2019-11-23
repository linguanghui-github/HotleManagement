package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hotel.dao.AttributeDao;
import cn.hotel.entity.AttributeDetails;
import cn.hotel.entity.AttributePo;
import cn.hotel.service.AttributeService;
@Service("attributeService")
public class AttributeServiceImpl implements AttributeService {
	@Autowired
	private AttributeDao attributeDao;
	
	public void setAttributeDao(AttributeDao attributeDao) {
		this.attributeDao = attributeDao;
	}

	@Override
	public List<AttributeDetails> getAttributeDetails(Integer aId) {
		// TODO Auto-generated method stub
		return attributeDao.getAttributeDetails(aId);
	}

	@Override
	public Integer addAttribute(AttributeDetails attributeDetails) {
		// TODO Auto-generated method stub
		return attributeDao.addAttribute(attributeDetails);
	}

	@Override
	public Integer deleteAttribute(Integer [] id) {
		// TODO Auto-generated method stub
		return attributeDao.deleteAttribute(id);
	}

	@Override
	public List<AttributePo> selectGuestRoomLevel() {
		// TODO Auto-generated method stub
		return attributeDao.selectGuestRoomLevel();
	}

	@Override
	public List<AttributePo> selectRoomState() {
		// TODO Auto-generated method stub
		return attributeDao.selectRoomState();
	}

	@Override
	public List<AttributePo> selectCommodityType() {
		// TODO Auto-generated method stub
		return attributeDao.selectCommodityType();
	}

	@Override
	public List<AttributePo> selectUOM() {
		// TODO Auto-generated method stub
		return attributeDao.selectUOM();
	}

	@Override
	public List<AttributePo> selectTargetType() {
		// TODO Auto-generated method stub
		return attributeDao.selectTargetType();
	}

	@Override
	public List<AttributePo> selectGender() {
		// TODO Auto-generated method stub
		return attributeDao.selectGender();
	}

	@Override
	public List<AttributePo> selectNation() {
		// TODO Auto-generated method stub
		return attributeDao.selectNation();
	}

	@Override
	public List<AttributePo> selectPassengerLevel() {
		// TODO Auto-generated method stub
		return attributeDao.selectPassengerLevel();
	}

	@Override
	public List<AttributePo> selectEducationDegree() {
		// TODO Auto-generated method stub
		return attributeDao.selectEducationDegree();
	}

	@Override
	public List<AttributePo> selectPapers() {
		// TODO Auto-generated method stub
		return attributeDao.selectPapers();
	}

	@Override
	public List<AttributePo> selectThingReason() {
		// TODO Auto-generated method stub
		return attributeDao.selectThingReason();
	}

	@Override
	public List<AttributePo> selectPassengerType() {
		// TODO Auto-generated method stub
		return attributeDao.selectPassengerType();
	}

	@Override
	public List<AttributePo> selectBillUnit() {
		// TODO Auto-generated method stub
		return attributeDao.selectBillUnit();
	}

	@Override
	public List<AttributePo> selectPayWay() {
		// TODO Auto-generated method stub
		return attributeDao.selectPayWay();
	}

	@Override
	public List<AttributePo> selectRentOutType() {
		// TODO Auto-generated method stub
		return attributeDao.selectRentOutType();
	}

	@Override
	public List<AttributePo> selectIsPay() {
		// TODO Auto-generated method stub
		return attributeDao.selectIsPay();
	}

	@Override
	public List<AttributePo> selectPredetermineState() {
		// TODO Auto-generated method stub
		return attributeDao.selectPredetermineState();
	}

}
