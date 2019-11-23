package cn.hotel.entity;

import java.io.Serializable;
/**
 * 房间
 * @author
 *
 */
public class Room implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7991058086688440997L;

	  private  Integer id;//房间id
	  private  Integer guestRoomLevelID;//客房等级ID
	  private  Integer roomStateID ;//房态IDs
	  private  String  roomNumber;//房间号      
	  private  String  roomAmount;//床位数
	  private  float standardPriceDay;//标准房价/天
	  private float  standardPrice;//标准房价/小时s
	  private String  maxDuration;//时长限制（小时）
	  private String firstDuration;//首段时长（小时）
	  private float firstPrice;//首段价格
	  private String guestRoomLevelName;//房间类型
	  private String roomName;//房间状态
	
	public Room(Integer id, Integer guestRoomLevelID, Integer roomStateID,
			String roomNumber, String roomAmount, float standardPriceDay,
			float standardPrice, String maxDuration, String firstDuration,
			float firstPrice, String guestRoomLevelName, String roomName) {
		super();
		this.id = id;
		this.guestRoomLevelID = guestRoomLevelID;
		this.roomStateID = roomStateID;
		this.roomNumber = roomNumber;
		this.roomAmount = roomAmount;
		this.standardPriceDay = standardPriceDay;
		this.standardPrice = standardPrice;
		this.maxDuration = maxDuration;
		this.firstDuration = firstDuration;
		this.firstPrice = firstPrice;
		this.guestRoomLevelName = guestRoomLevelName;
		this.roomName = roomName;
	}
	public Room() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGuestRoomLevelID() {
		return guestRoomLevelID;
	}
	public void setGuestRoomLevelID(Integer guestRoomLevelID) {
		this.guestRoomLevelID = guestRoomLevelID;
	}
	public Integer getRoomStateID() {
		return roomStateID;
	}
	public void setRoomStateID(Integer roomStateID) {
		this.roomStateID = roomStateID;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomAmount() {
		return roomAmount;
	}
	public void setRoomAmount(String roomAmount) {
		this.roomAmount = roomAmount;
	}
	public float getStandardPriceDay() {
		return standardPriceDay;
	}
	public void setStandardPriceDay(float standardPriceDay) {
		this.standardPriceDay = standardPriceDay;
	}
	public float getStandardPrice() {
		return standardPrice;
	}
	public void setStandardPrice(float standardPrice) {
		this.standardPrice = standardPrice;
	}
	public String getMaxDuration() {
		return maxDuration;
	}
	public void setMaxDuration(String maxDuration) {
		this.maxDuration = maxDuration;
	}
	public String getFirstDuration() {
		return firstDuration;
	}
	public void setFirstDuration(String firstDuration) {
		this.firstDuration = firstDuration;
	}
	public float getFirstPrice() {
		return firstPrice;
	}
	public void setFirstPrice(float firstPrice) {
		this.firstPrice = firstPrice;
	}
	public String getGuestRoomLevelName() {
		return guestRoomLevelName;
	}
	public void setGuestRoomLevelName(String guestRoomLevelName) {
		this.guestRoomLevelName = guestRoomLevelName;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	  
	  
}                    
