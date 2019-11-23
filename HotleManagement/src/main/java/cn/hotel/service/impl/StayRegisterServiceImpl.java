package cn.hotel.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import cn.hotel.dao.StayRegisterDao;
import cn.hotel.utils.PageInfo;
import cn.hotel.entity.StayRegister;
import cn.hotel.entity.StayRegisterDetailsVo;
import cn.hotel.entity.StayRegisterPo;
import cn.hotel.entity.StayRegisterVO;
import cn.hotel.service.StayRegisterService;

@Service("stayRegisterService")
public class StayRegisterServiceImpl implements StayRegisterService {
	@Autowired
	private StayRegisterDao stayRegisterDao;
	

	public void setStayRegisterDao(StayRegisterDao stayRegisterDao) {
		this.stayRegisterDao = stayRegisterDao;
	}


	@Override
	public List<StayRegister> selectShuJuTongJi(Timestamp min, Timestamp max) {
		
		return stayRegisterDao.selectShuJuTongJi(min, max);
	}

	@Override
	public int insertAll(StayRegisterPo stayRegisterPo) {
		return stayRegisterDao.insertAll(stayRegisterPo);
	}

	@Override
	public PageInfo<StayRegisterPo> PageInfoFuzzyselectOne(int receiveTargeTypeID, 
			int isBillID,String roomNumber,PageInfo<StayRegisterPo> vo) {
		int start=0;
		if (vo.getPageIndex()>1) {
			start=(vo.getPageIndex()-1)*vo.getPageSize();
		}
		List<StayRegisterPo> list=stayRegisterDao.pageFuzzyselectOne(receiveTargeTypeID, isBillID, roomNumber,start, vo.getPageSize());
		vo.setList(list);
		int count=stayRegisterDao.countFuzzyselectOne(receiveTargeTypeID, isBillID,roomNumber);
		vo.setTotalCount(count);
		return vo;
	}

	@Override
	public StayRegisterPo selectById(Integer id) {
		return this.stayRegisterDao.selectById(id);
	}

	@Override
	public int insertStayregisterdetails(int stayRegisterID, int passengerID) {
		return stayRegisterDao.insertStayregisterdetails(stayRegisterID, passengerID);
	}

	@Override
	public int insertDeposit(StayRegisterPo stayRegisterPo) {
		return stayRegisterDao.insertDeposit(stayRegisterPo);
	}

	@Override
	public List<StayRegisterPo> selectDepositById(int id) {
		return stayRegisterDao.selectDepositById(id);
	}

	@Override
	public int insertConsumptiondetails(StayRegisterPo stayRegisterPo) {
		return stayRegisterDao.insertConsumptiondetails(stayRegisterPo);
	}

	@Override
	public PageInfo<StayRegisterPo> PageInfoConsumption(int consumptionStayRegisterID,PageInfo<StayRegisterPo> vo) {
		int start=0;
		if (vo.getPageIndex()>1) {
			start=(vo.getPageIndex()-1)*vo.getPageSize();
		}
		List<StayRegisterPo> list=stayRegisterDao.pageConsumption(consumptionStayRegisterID, start, vo.getPageSize());
		vo.setList(list);
		int count=stayRegisterDao.countConsumption(consumptionStayRegisterID);
		vo.setTotalCount(count);
		return vo;
	}

	@Override
	public int deleteConsumption(Integer id) {
		return stayRegisterDao.deleteConsumption(id);
	}

	@Override
	public int updateSumConst(int id, Double sumConst) {
		return stayRegisterDao.updateSumConst(id, sumConst);
	}

	@Override
	public List<StayRegisterPo> selectMoney(int id) {
		return stayRegisterDao.selectMoney(id);
	}

	@Override
	public List<StayRegisterPo> selectChangRoom(int id) {
		return stayRegisterDao.selectChangRoom(id);
	}

	@Override
	public List<StayRegisterPo> selectAll() {
		return stayRegisterDao.selectAll();
	}

	@Override
	public int updateRemind(int id, int remind) {
		return stayRegisterDao.updateRemind(id, remind);
	}

	@Override
	public int updateChangRoom(StayRegisterPo stayRegisterPo) {
		return stayRegisterDao.updateChangRoom(stayRegisterPo);
	}

	@Override
	public int pay(int id, String remarks, Timestamp payTime, int payWay) {
		return stayRegisterDao.pay(id, remarks, payTime, payWay);
	}

	@Override
	public PageInfo<StayRegisterPo> PageInfoFuzzyselectTwo(int receiveTargetID,
			int isBillID, String roomNumber, PageInfo<StayRegisterPo> vo) {
		int start=0;
		if (vo.getPageIndex()>1) {
			start=(vo.getPageIndex()-1)*vo.getPageSize();
		}
		List<StayRegisterPo> list=stayRegisterDao.pageFuzzyselectTwo(receiveTargetID, isBillID, roomNumber,start, vo.getPageSize());
		vo.setList(list);
		int count=stayRegisterDao.countFuzzyselectTwo(receiveTargetID, isBillID, roomNumber);
		vo.setTotalCount(count);
		return vo;
	}

	@Override
	public List<StayRegisterPo> selectFormTeamId(int receiveTargetID,
			int isBillID) {
		return this.stayRegisterDao.selectFormTeamId(receiveTargetID, isBillID);
	}

	@Override
	public List<StayRegisterPo> selectTeamDeposit(int receiveTargetID) {
		return this.stayRegisterDao.selectTeamDeposit(receiveTargetID);
	}

	@Override
	public List<StayRegisterPo> selectTeamConsumption(int receiveTargetID) {
		return this.stayRegisterDao.selectTeamConsumption(receiveTargetID);
	}

	@Override
	public List<StayRegisterPo> ajaxSelectTeamRoom(int receiveTargetID,
			String roomNumber) {
		return this.stayRegisterDao.ajaxSelectTeamRoom(receiveTargetID, roomNumber);
	}

	@Override
	public List<StayRegisterPo> ajaxSelectTeamFormTime(int receiveTargetID,
			Timestamp min, Timestamp max) {
		return this.stayRegisterDao.ajaxSelectTeamFormTime(receiveTargetID, min, max);
	}

	@Override
	public List<StayRegisterPo> ajaxSelectTeamDeposit(int receiveTargetID,
			Timestamp min, Timestamp max) {
		return this.stayRegisterDao.ajaxSelectTeamDeposit(receiveTargetID, min, max);
	}

	@Override
	public List<StayRegisterPo> ajaxSelectTeamConsumption(int receiveTargetID,
			Timestamp min, Timestamp max) {
		return this.stayRegisterDao.ajaxSelectTeamConsumption(receiveTargetID, min, max);
	}

	@Override
	public List<StayRegisterPo> selectDepositJinJianBan(int id) {
		return this.stayRegisterDao.selectDepositJinJianBan(id);
	}

	@Override
	public List<StayRegisterPo> selectConsumptionJinJianBan(int id) {
		return this.stayRegisterDao.selectConsumptionJinJianBan(id);
	}

	@Override
	public StayRegisterPo selectInformationXiangQingBan(int id) {
		return this.stayRegisterDao.selectInformationXiangQingBan(id);
	}

	@Override
	public int changOverTeam(int id, int receiveTargetID) {
		return this.stayRegisterDao.changOverTeam(id, receiveTargetID);
	}

	@Override
	public List<StayRegisterPo> selectFormTeamIdTwo(int isBillID) {
		return this.stayRegisterDao.selectFormTeamIdTwo(isBillID);
	}

	@Override
	public PageInfo<StayRegisterPo> PageInfoFuzzyselectThree(int isBillID,
			String roomNumber, PageInfo<StayRegisterPo> vo) {
		int start=0;
		if (vo.getPageIndex()>1) {
			start=(vo.getPageIndex()-1)*vo.getPageSize();
		}
		List<StayRegisterPo> list=stayRegisterDao.pageFuzzyselectThree(isBillID, roomNumber,start, vo.getPageSize());
		vo.setList(list);
		int count=stayRegisterDao.countFuzzyselectThree(isBillID, roomNumber);
		vo.setTotalCount(count);
		return vo;
	}
	
	
	
	
	
	
	
	
	
/*-------------------------------------FinancialStatistics--------------------------------------------------------*/

	@Override
	public PageInfo<StayRegisterPo> PageInfoFuzzyselectFour(PageInfo<StayRegisterPo> vo) {
		int start=0;
		if (vo.getPageIndex()>1) {
			start=(vo.getPageIndex()-1)*vo.getPageSize();
		}
		List<StayRegisterPo> list=stayRegisterDao.pageFuzzyselectFour(start, vo.getPageSize());
		vo.setList(list);
		int count=stayRegisterDao.countFuzzyselectFour();
		vo.setTotalCount(count);
		return vo;
	}

	@Override
	public PageInfo<StayRegisterPo> PageInfoFuzzyselectFive(Timestamp min,
			Timestamp max, PageInfo<StayRegisterPo> vo) {
		int start=0;
		if (vo.getPageIndex()>1) {
			start=(vo.getPageIndex()-1)*vo.getPageSize();
		}
		List<StayRegisterPo> list=stayRegisterDao.pageFuzzyselectFive(min, max,start, vo.getPageSize());
		vo.setList(list);
		int count=stayRegisterDao.countFuzzyselectFive(min, max);
		vo.setTotalCount(count);
		return vo;
	}

	@Override
	public List<StayRegisterPo> selectPayJingJianBanNot() {
		return this.stayRegisterDao.selectPayJingJianBanNot();
	}

	@Override
	public List<StayRegisterPo> selectPayStayNumberNot() {
		return this.stayRegisterDao.selectPayStayNumberNot();
	}

	@Override
	public List<StayRegisterPo> selectPayXiaoFeiNot() {
		return this.stayRegisterDao.selectPayXiaoFeiNot();
	}

	@Override
	public List<StayRegisterPo> selectPayJingJianBan(Timestamp min,
			Timestamp max) {
		return this.stayRegisterDao.selectPayJingJianBan(min, max);
	}

	@Override
	public List<StayRegisterPo> selectPayStayNumber(Timestamp min, Timestamp max) {
		return this.stayRegisterDao.selectPayStayNumber(min, max);
	}

	@Override
	public List<StayRegisterPo> selectPayXiaoFei(Timestamp min, Timestamp max) {
		return this.stayRegisterDao.selectPayXiaoFei(min, max);
	}

	@Override
	public List<StayRegisterPo> selectAllInformation(int id) {
		return this.stayRegisterDao.selectAllInformation(id);
	}

	@Override
	public List<StayRegisterPo> selectXiaoFeiMingXi(int id) {
		return this.stayRegisterDao.selectXiaoFeiMingXi(id);
	}

	@Override
	public int updateStayRegisterPredetermineID(Integer predetermineID,
			Integer id) {
		return this.stayRegisterDao.updateStayRegisterPredetermineID(predetermineID, id);
	}

	@Override
	public StayRegisterPo selectSumconst(int id) {
		return this.stayRegisterDao.selectSumconst(id);
	}

	
	
	
	
		
	
	
	
	
	@Override
	public Integer count(String start, String end) {
		return stayRegisterDao.count(start, end).size();
	}

	@Override
	public List<StayRegisterVO> list(String start, String end, Integer index, Integer size) {
		return stayRegisterDao.list(start, end, index, size);
	}

	@Override
	public Integer fjc(String start, String end) {
		Integer size=stayRegisterDao.fjc(start, end).size();
		return size;
	}

	@Override
	public Integer zsrs(String start, String end) {
		Integer rs=stayRegisterDao.zsrs(start, end).size();
		return rs;
	}

	@Override
	public double xfje(String start, String end) {
		double xfje=0.0;
		for (StayRegisterVO list : stayRegisterDao.xfje(start, end)) {
			xfje=list.getConsumptionMoney()+xfje;
		}
		return xfje;
	}

	@Override
	public double jzje(String start, String end) {
		double jzje=0.0;
		for (StayRegisterVO list : stayRegisterDao.jzje(start, end)) {
			jzje=(double)list.getSumConst()+jzje;
		}
		return jzje;
	}

	@Override
	public List<StayRegisterVO> selectOne(Integer id) {
		return stayRegisterDao.selectOne(id);
	}

	@Override
	public List<StayRegisterDetailsVo> selectTwo(Integer stsid) {
		return stayRegisterDao.selectTwo(stsid);
	}

}
