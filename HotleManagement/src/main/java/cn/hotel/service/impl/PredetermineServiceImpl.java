package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hotel.dao.PredetermineDao;
import cn.hotel.utils.PageInfo;
import cn.hotel.entity.PredeterminePo;
import cn.hotel.service.PredetermineService;
@Service("predetermineService")
public class PredetermineServiceImpl implements PredetermineService {
	@Autowired
	private PredetermineDao predetermineDao;
	public void setPredetermineDao(PredetermineDao predetermineDao) {
		predetermineDao = predetermineDao;
	}

	public int insertAll(PredeterminePo predeterminePo) {

		return predetermineDao.insertAll(predeterminePo);
	}

	public PageInfo<PredeterminePo> pageFuzzyselect(String receiveTeamName,
			String passengerName, int predetermineStateID,
			PageInfo<PredeterminePo> vo) {
		int start=0;
		if (vo.getPageIndex()>1) {
			start=(vo.getPageIndex()-1)*vo.getPageSize();
		}
		List<PredeterminePo> list=predetermineDao.pageFuzzyselect(receiveTeamName,
				passengerName, predetermineStateID, start, vo.getPageSize());
		vo.setList(list);
		int count=predetermineDao.countFuzzyselect(receiveTeamName, passengerName, predetermineStateID);
		vo.setTotalCount(count);
		return vo;
	}

	public PredeterminePo findById(Integer id) {
		return this.predetermineDao.findById(id);
	}

	public List<PredeterminePo> findLvKeId(Integer id) {
		return this.predetermineDao.findLvKeId(id);
	}

	public List<PredeterminePo> findTeamId(Integer id) {
		return this.predetermineDao.findTeamId(id);
	}

	public int deleteById(Integer id) {
		return this.predetermineDao.deleteById(id);
	}

	public List<PredeterminePo> selectAll() {
		return this.predetermineDao.selectAll();
	}

	public int updateRemind(Integer id) {
		return this.predetermineDao.updateRemind(id);
	}

	public int updatePredetermineStateID(Integer id) {
		return this.predetermineDao.updatePredetermineStateID(id);
	}
}
