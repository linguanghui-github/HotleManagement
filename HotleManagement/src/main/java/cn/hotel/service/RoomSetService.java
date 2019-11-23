package cn.hotel.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hotel.utils.PageInfo;
import cn.hotel.entity.Room;

public interface RoomSetService {
	
	 PageInfo<Room> getRoomInfoSet(String roomNumber, Integer pageIndex, Integer pageSize);
	 
	 Integer addRoom(Room room);
	 
	 Room getRoom(@Param("id") Integer id);
	 
	 Integer updateRoom(Room room);
	 
	 Integer deleteRoom(Integer[] listid);
	 
	  //查询全部
	    public List<Room> selectAll();
	 
	 // 非本派所用  安排房间时 需要改变当前房间的房态
	    public int updateByIdToRoomState(Room roomSetPo);
	    
	    //非本派所用  查询房间信息
	    public  List<Room> selectInformation(String roomNumber);
	    
	    //非本派所用  客服等级来查询房间信息
	    public  List<Room> levelSelectInformation(Integer guestRoomLevelID);
}
