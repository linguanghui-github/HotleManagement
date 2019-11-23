package cn.hotel.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 交押金
 * @author 
 *
 */
public class Depoit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5286691106152482792L;
     private Integer id;  //押金ID
	 private Integer stayRegisterID;//住宿登记ID
	 private Integer payWayID;//支付方式ID
	 private Date registerTime;//登记时间
	 private float deposit;//押金
	 
	public Depoit() {
		super();
	}
	public Depoit(Integer id, Integer stayRegisterID, Integer payWayID,
			Date registerTime, float deposit) {
		super();
		this.id = id;
		this.stayRegisterID = stayRegisterID;
		this.payWayID = payWayID;
		this.registerTime = registerTime;
		this.deposit = deposit;
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
	public Integer getPayWayID() {
		return payWayID;
	}
	public void setPayWayID(Integer payWayID) {
		this.payWayID = payWayID;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	 
}
