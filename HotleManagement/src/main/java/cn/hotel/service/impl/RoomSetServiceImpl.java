package cn.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hotel.dao.RoomSetDao;
import cn.hotel.utils.PageInfo;
import cn.hotel.entity.Room;
import cn.hotel.service.RoomSetService;
@Service("roomSetService")
public class RoomSetServiceImpl implements RoomSetService {
	@Autowired
	private RoomSetDao roomSetDao;
	

	public void setRoomSetDao(RoomSetDao roomSetDao) {
		this.roomSetDao = roomSetDao;
	}



	public PageInfo<Room> getRoomInfoSet(String roomNumber,Integer pageIndex , Integer pageSize) {
		PageInfo<Room> pi=new  PageInfo<Room>();
		pi.setPageIndex(pageIndex);
		pi.setPageSize(pageSize);
		if (roomNumber==null) {
			roomNumber="";
		}
		Integer num=roomSetDao.getRoomCount(roomNumber);
		if (num != 0 && num !=null) {
			pi.setTotalCount(num);
			List<Room> list=roomSetDao.getRoomInfoSet(roomNumber, (pi.getPageIndex()-1)*pi.getPageSize(), pi.getPageSize());
			pi.setList(list);
		}
		return pi;
	}



	public Integer addRoom(Room room) {
		// TODO Auto-generated method stub
		return roomSetDao.addRoom(room);
	}



	public Room getRoom(Integer id) {
		
		return roomSetDao.getRoom(id);
	}



	public Integer updateRoom(Room room) {
		// TODO Auto-generated method stub
		return roomSetDao.updateRoom(room);
	}



	public Integer deleteRoom(Integer[] listid) {
		// TODO Auto-generated method stub
		return roomSetDao.deleteRoom(listid);
	}



	public int updateByIdToRoomState(Room roomSetPo) {
		// TODO Auto-generated method stub
		return roomSetDao.updateByIdToRoomState(roomSetPo);
	}



	public List<Room> selectInformation(String roomNumber) {
		// TODO Auto-generated method stub
		return roomSetDao.selectInformation(roomNumber);
	}



	public List<Room> levelSelectInformation(Integer guestRoomLevelID) {
		// TODO Auto-generated method stub
		return roomSetDao.levelSelectInformation(guestRoomLevelID);
	}



	public List<Room> selectAll() {
		// TODO Auto-generated method stub
		return roomSetDao.selectAll();
	}




}
