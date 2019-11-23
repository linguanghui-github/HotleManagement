package cn.hotel.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 住宿登记
 * @author
 *
 */
public class StayRegister implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3852181043156375782L;

	private Integer id;//住宿登记ID
	private Integer predetermineID;//预定ID
	private Integer rentOutTypeID;//出租方式ID
	private Integer roomID;// 房间ID
	private Integer payWayID;//结账方式
	private Integer billUnitID;//结账单位ID
	private Integer passengerTypeID;//旅客类别ID
	private Integer receiveTargetID;//接待对象ID
	private Integer deputyID;//副ID
	private Integer isBillID;//结账否
	private Date registerTime;//登记时间
	private String stayNumber;//住店天数/小时
	private float sumConst;//总费用
	private String ChangingRoomNumber;//换房次数
	private float changRoomMoney;//换房间
	private String remarks;//备注
	private Date payTime;//结账时间
	private Date changRoomTime;//换房间时间
	private Integer remindInteger;//提醒结账
	public StayRegister(Integer id, Integer predetermineID,
			Integer rentOutTypeID, Integer roomID, Integer payWayID,
			Integer billUnitID, Integer passengerTypeID,
			Integer receiveTargetID, Integer deputyID, Integer isBillID,
			Date registerTime, String stayNumber, float sumConst,
			String changingRoomNumber, float changRoomMoney, String remarks,
			Date payTime, Date changRoomTime, Integer remindInteger) {
		super();
		this.id = id;
		this.predetermineID = predetermineID;
		this.rentOutTypeID = rentOutTypeID;
		this.roomID = roomID;
		this.payWayID = payWayID;
		this.billUnitID = billUnitID;
		this.passengerTypeID = passengerTypeID;
		this.receiveTargetID = receiveTargetID;
		this.deputyID = deputyID;
		this.isBillID = isBillID;
		this.registerTime = registerTime;
		this.stayNumber = stayNumber;
		this.sumConst = sumConst;
		this.ChangingRoomNumber = changingRoomNumber;
		this.changRoomMoney = changRoomMoney;
		this.remarks = remarks;
		this.payTime = payTime;
		this.changRoomTime = changRoomTime;
		this.remindInteger = remindInteger;
	}
	public StayRegister() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPredetermineID() {
		return predetermineID;
	}
	public void setPredetermineID(Integer predetermineID) {
		this.predetermineID = predetermineID;
	}
	public Integer getRentOutTypeID() {
		return rentOutTypeID;
	}
	public void setRentOutTypeID(Integer rentOutTypeID) {
		this.rentOutTypeID = rentOutTypeID;
	}
	public Integer getRoomID() {
		return roomID;
	}
	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}
	public Integer getPayWayID() {
		return payWayID;
	}
	public void setPayWayID(Integer payWayID) {
		this.payWayID = payWayID;
	}
	public Integer getBillUnitID() {
		return billUnitID;
	}
	public void setBillUnitID(Integer billUnitID) {
		this.billUnitID = billUnitID;
	}
	public Integer getPassengerTypeID() {
		return passengerTypeID;
	}
	public void setPassengerTypeID(Integer passengerTypeID) {
		this.passengerTypeID = passengerTypeID;
	}
	public Integer getReceiveTargetID() {
		return receiveTargetID;
	}
	public void setReceiveTargetID(Integer receiveTargetID) {
		this.receiveTargetID = receiveTargetID;
	}
	public Integer getDeputyID() {
		return deputyID;
	}
	public void setDeputyID(Integer deputyID) {
		this.deputyID = deputyID;
	}
	public Integer getIsBillID() {
		return isBillID;
	}
	public void setIsBillID(Integer isBillID) {
		this.isBillID = isBillID;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public String getStayNumber() {
		return stayNumber;
	}
	public void setStayNumber(String stayNumber) {
		this.stayNumber = stayNumber;
	}
	public float getSumConst() {
		return sumConst;
	}
	public void setSumConst(float sumConst) {
		this.sumConst = sumConst;
	}
	public String getChangingRoomNumber() {
		return ChangingRoomNumber;
	}
	public void setChangingRoomNumber(String changingRoomNumber) {
		ChangingRoomNumber = changingRoomNumber;
	}
	public float getChangRoomMoney() {
		return changRoomMoney;
	}
	public void setChangRoomMoney(float changRoomMoney) {
		this.changRoomMoney = changRoomMoney;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getChangRoomTime() {
		return changRoomTime;
	}
	public void setChangRoomTime(Date changRoomTime) {
		this.changRoomTime = changRoomTime;
	}
	public Integer getRemindInteger() {
		return remindInteger;
	}
	public void setRemindInteger(Integer remindInteger) {
		this.remindInteger = remindInteger;
	}
	
}
