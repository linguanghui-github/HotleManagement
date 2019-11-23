package cn.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hotel.entity.Room;

public interface RoomSetDao {
	
	//查询总条数
	public Integer getRoomCount(@Param("roomNumber") String roomNumber);

	//查询房间数据 支持模糊查询 并进行分页
	public List<Room> getRoomInfoSet(@Param("roomNumber") String roomNumber, @Param("pageIndex") Integer pageIndex, @Param("pageSize") Integer pageSize);

	//添加房间信息
	public Integer addRoom(Room room);

	// 查询单个房间
	public Room getRoom(@Param("id") Integer id);

	//更新房间信息
	public Integer updateRoom(Room room);

	//删除房间
	public Integer deleteRoom(Integer[] listid);

	//查询全部
	public List<Room> selectAll();

	// 安排房间时 需要改变当前房间的房态
	public int updateByIdToRoomState(Room roomSetPo);

	//查询房间信息
	public  List<Room> selectInformation(String roomNumber);

	//客服等级来查询房间信息
	public  List<Room> levelSelectInformation(Integer guestRoomLevelID);

}
