package cn.hotel.service;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hotel.utils.PageInfo;
import cn.hotel.entity.StayRegister;
import cn.hotel.entity.StayRegisterDetailsVo;
import cn.hotel.entity.StayRegisterPo;
import cn.hotel.entity.StayRegisterVO;

public interface StayRegisterService {
		//数据统计
			public List<StayRegister> selectShuJuTongJi(Timestamp min, Timestamp max);
			
			public int insertAll(StayRegisterPo stayRegisterPo);
			
			//精确查询
			public	StayRegisterPo selectById(Integer id);
			
			//新增住宿明细
		    public int insertStayregisterdetails(int stayRegisterID, int passengerID);
		    
		    //新增押金明细
		  	public int insertDeposit(StayRegisterPo stayRegisterPo);
		  	
		    //查询押金明细
		  	public List<StayRegisterPo> selectDepositById(int id);
		  	
		    //新增消费明细
		  	public int insertConsumptiondetails(StayRegisterPo stayRegisterPo);
		  	
		  //消费明细分页
		  	public PageInfo<StayRegisterPo> PageInfoConsumption(int consumptionStayRegisterID, PageInfo<StayRegisterPo> vo);
		  	
		   //消费明细的删除
		  	public int deleteConsumption(Integer id);
		  	
		   //修改总费用
		  	public int updateSumConst(@Param("id") int id, @Param("id") Double sumConst);
		  	
		  	//查询用于计算房间加商品消费
		  	public List<StayRegisterPo> selectMoney(int id);
		  	
		    //换房 查看原信息
		  	public List<StayRegisterPo> selectChangRoom(int id);
		  	
		  	public List<StayRegisterPo> selectAll();
		  	
		  	
		  //修改提示
		  	public int updateRemind(int id, int remind);
		  	
		    //换房 修改原信息
		  	public int updateChangRoom(StayRegisterPo stayRegisterPo);
		  	
		    //结账 修改原信息
		  	public int pay(int id, String remarks, Timestamp payTime, int payWay);
		  	
		    //根据 团队id来查询 总费用，
		  	public List<StayRegisterPo> selectFormTeamId(int receiveTargetID, int isBillID);
		  	
		  	public List<StayRegisterPo> selectFormTeamIdTwo(int isBillID);
		  	
		    //根据 团队id 来查询 押金
		  	public List<StayRegisterPo> selectTeamDeposit(int receiveTargetID);
		  	
		  	//根据团队id 来查询 旅客消费
		  	public List<StayRegisterPo> selectTeamConsumption(int receiveTargetID);
		  	
		   // Ajax 根据 团队id 的 房间号来查询
		 	public List<StayRegisterPo> ajaxSelectTeamRoom(int receiveTargetID, String roomNumber);
		 	
		 	
		  // Ajax 根据团队 id 和时间段来查询
		 	public List<StayRegisterPo> ajaxSelectTeamFormTime(int receiveTargetID,
                                                               Timestamp min, Timestamp max);
		 	
		 	//根据 团队id 时间段来查询 押金
		 	public List<StayRegisterPo> ajaxSelectTeamDeposit(int receiveTargetID,
                                                              Timestamp min, Timestamp max);

		 	//根据团队id 时间段来查询 旅客消费
		 	public List<StayRegisterPo> ajaxSelectTeamConsumption(int receiveTargetID,
                                                                  Timestamp min, Timestamp max);
		 	
		 	
		 	
		 	//根据 住宿登记id 来查询 押金 精简版 用于 转入团队
			public List<StayRegisterPo> selectDepositJinJianBan(int id);
			
			
			//根据 住宿登记id 来查询 消费 精简版 用于 转入团队
			public List<StayRegisterPo> selectConsumptionJinJianBan(int id);
			
			//根据 住宿登记id 来查询 详情信息  详情版 用于 转入团队
			public StayRegisterPo selectInformationXiangQingBan(int id);
		 	
			
			//根据 住宿登记id 来 转入团队
			public int changOverTeam(int id, int receiveTargetID);
			
			//根据 住宿登记id 来查询 总费用
			public StayRegisterPo selectSumconst(int id);
			
			
		 	
		 	
		 	
			//修改 预定id
		    public int updateStayRegisterPredetermineID(Integer predetermineID, Integer id);
		 	
		 	
		  	
		  	
		  	
		  	
			
			//分页需要
			public PageInfo<StayRegisterPo> PageInfoFuzzyselectOne(int receiveTargeTypeID,
                                                                   int isBillID, String roomNumber, PageInfo<StayRegisterPo> vo);
			
			//分页Two
			public PageInfo<StayRegisterPo> PageInfoFuzzyselectTwo(int receiveTargetID,
                                                                   int isBillID, String roomNumber, PageInfo<StayRegisterPo> vo);
			
			//分页Three
			public PageInfo<StayRegisterPo> PageInfoFuzzyselectThree(
                    int isBillID, String roomNumber, PageInfo<StayRegisterPo> vo);
			
			
			
			
			
			
		/*-------------------------------------FinancialStatistics--------------------------------------------------------*/
			//分页需要
			public PageInfo<StayRegisterPo> PageInfoFuzzyselectFour(PageInfo<StayRegisterPo> vo);
			
			//分页需要
			public PageInfo<StayRegisterPo> PageInfoFuzzyselectFive(Timestamp min, Timestamp max, PageInfo<StayRegisterPo> vo);
			
			
			//根据 已结账 来查询 总费用 精简版条件 无条件
		    public List<StayRegisterPo> selectPayJingJianBanNot();
		    
		    //根据 已结账 来查询 住店人数。无条件
		    public List<StayRegisterPo> selectPayStayNumberNot();
		    
		    //根据 已结账 来查询 旅客总消费。无条件
		    public List<StayRegisterPo> selectPayXiaoFeiNot();
		    
		    //根据 已结账 来查询 总费用 精简版条件 结账区段
		    public List<StayRegisterPo> selectPayJingJianBan(Timestamp min, Timestamp max);
		    
		    //根据 已结账 来查询 住店人数。条件 结账区段
		    public List<StayRegisterPo> selectPayStayNumber(Timestamp min, Timestamp max);
		    
		    //根据 已结账 来查询 旅客总消费。条件 结账区段
		    public List<StayRegisterPo> selectPayXiaoFei(Timestamp min, Timestamp max);
		    
		    
		    //根据 id 查询 很多很多的信息
		    public List<StayRegisterPo> selectAllInformation(int id);
		    
		    public List<StayRegisterPo> selectXiaoFeiMingXi(int id);
		    
		    
		    
		    
		    
		    
		    
		    
		    Integer count(String start, String end);
			List<StayRegisterVO> list(String start, String end, Integer index, Integer size);
			Integer fjc(@Param("start") String start, @Param("end") String end);
			Integer zsrs(@Param("start") String start, @Param("end") String end);
			double xfje(@Param("start") String start, @Param("end") String end);
			double jzje(@Param("start") String start, @Param("end") String end);
			List<StayRegisterVO> selectOne(Integer id);
			List<StayRegisterDetailsVo> selectTwo(@Param("stsid") Integer stsid);
}
