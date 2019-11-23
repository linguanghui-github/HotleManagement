package cn.hotel.entity;

import java.io.Serializable;
/**
 * 住宿登记明细
 * @author
 *
 */
public class StayRegisterDetailsVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7283788095400926614L;
	
	private Integer id;// 住宿登记明细id
	private Integer stayRegisterID;//住宿登记id
	private Integer passengerID;//旅客id
	
	private StayRegisters stayRegister;
	
	
	

	public StayRegisters getStayRegister() {
		return stayRegister;
	}
	public void setStayRegister(StayRegisters stayRegister) {
		this.stayRegister = stayRegister;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public StayRegisterDetailsVo(Integer id, Integer stayRegisterID,
			Integer passengerID) {
		super();
		this.id = id;
		this.stayRegisterID = stayRegisterID;
		this.passengerID = passengerID;
	}
	public StayRegisterDetailsVo() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStayRegisterID() {
		return stayRegisterID;
	}
	public void setStayRegisterID(Integer stayRegisterID) {
		this.stayRegisterID = stayRegisterID;
	}
	public Integer getPassengerID() {
		return passengerID;
	}
	public void setPassengerID(Integer passengerID) {
		this.passengerID = passengerID;
	}
	
}
