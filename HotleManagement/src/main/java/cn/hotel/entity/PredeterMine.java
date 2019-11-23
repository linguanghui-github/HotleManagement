package cn.hotel.entity;

import java.io.Serializable;
/**
 * 预订房间
 * @author
 */
public class PredeterMine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 966315865267295705L;

	 private Integer id;//预订ID
	 private Integer roomID;//房间ID
	 private Integer predetermineTargetID;//预定对象ID
	 private Integer passengerID;//旅客ID
	 private Integer payWayID;//支付方式 ID
	 private Integer predetermineStateID;//预定状态ID
	 private Integer arriveTime;//抵达时间
	 private float deposit;//押金
	 private String  predetermineDay;//预订天数
	 private Integer remind;//到时提醒
	 
	 //---------------------扩展字段---------------------//
	 private String predetermineStateName;//预订状态 
	 private String roomGuestRoomLevelName;//房间等级
	 private String receiveTargeTypeName;
	 
	 
	 
	 private Room room;	//房间
	 private ReceiveTarget receiveTarget;
	 private Passenger passenger;
	 
	 
	 
	 
	 
	public PredeterMine(Integer id, Integer roomID,
			Integer predetermineTargetID, Integer passengerID,
			Integer payWayID, Integer predetermineStateID, Integer arriveTime,
			float deposit, String predetermineDay, Integer remind) {
		this.id = id;
		this.roomID = roomID;
		this.predetermineTargetID = predetermineTargetID;
		this.passengerID = passengerID;
		this.payWayID = payWayID;
		this.predetermineStateID = predetermineStateID;
		this.arriveTime = arriveTime;
		this.deposit = deposit;
		this.predetermineDay = predetermineDay;
		this.remind = remind;
	}
	public PredeterMine() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoomID() {
		return roomID;
	}
	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}
	public Integer getPredetermineTargetID() {
		return predetermineTargetID;
	}
	public void setPredetermineTargetID(Integer predetermineTargetID) {
		this.predetermineTargetID = predetermineTargetID;
	}
	public Integer getPassengerID() {
		return passengerID;
	}
	public void setPassengerID(Integer passengerID) {
		this.passengerID = passengerID;
	}
	public Integer getPayWayID() {
		return payWayID;
	}
	public void setPayWayID(Integer payWayID) {
		this.payWayID = payWayID;
	}
	public Integer getPredetermineStateID() {
		return predetermineStateID;
	}
	public void setPredetermineStateID(Integer predetermineStateID) {
		this.predetermineStateID = predetermineStateID;
	}
	public Integer getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Integer arriveTime) {
		this.arriveTime = arriveTime;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public String getPredetermineDay() {
		return predetermineDay;
	}
	public void setPredetermineDay(String predetermineDay) {
		this.predetermineDay = predetermineDay;
	}
	public Integer getRemind() {
		return remind;
	}
	public void setRemind(Integer remind) {
		this.remind = remind;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public ReceiveTarget getReceiveTarget() {
		return receiveTarget;
	}
	public void setReceiveTarget(ReceiveTarget receiveTarget) {
		this.receiveTarget = receiveTarget;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public void setPredetermineStateName(String predetermineStateName) {
		this.predetermineStateName = predetermineStateName;
	}
	public void setRoomGuestRoomLevelName(String roomGuestRoomLevelName) {
		this.roomGuestRoomLevelName = roomGuestRoomLevelName;
	}
	public void setReceiveTargeTypeName(String receiveTargeTypeName) {
		this.receiveTargeTypeName = receiveTargeTypeName;
	}
	public String getPredetermineStateName() {
		return predetermineStateName;
	}
	public String getRoomGuestRoomLevelName() {
		return roomGuestRoomLevelName;
	}
	public String getReceiveTargeTypeName() {
		return receiveTargeTypeName;
	}
	
	 
	
}
