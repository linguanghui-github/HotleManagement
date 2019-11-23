package cn.hotel.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 消费明细
 * @author
 *
 */
public class ConsumptionDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3246206851698848188L;

	 private Integer id;//消费明细ID
	 private Integer stayRegisterID;//住宿登记ID 
	 private Integer commodityID;//商品ID
	 private String consumptionNumber;//消费数量
	 private float consumptionMoney;//消费金额
	 private Date consumptionTime;//消费时间
	public ConsumptionDetails(Integer id, Integer stayRegisterID,
			Integer commodityID, String consumptionNumber,
			float consumptionMoney, Date consumptionTime) {
		super();
		this.id = id;
		this.stayRegisterID = stayRegisterID;
		this.commodityID = commodityID;
		this.consumptionNumber = consumptionNumber;
		this.consumptionMoney = consumptionMoney;
		this.consumptionTime = consumptionTime;
	}
	public ConsumptionDetails() {
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
	public Integer getCommodityID() {
		return commodityID;
	}
	public void setCommodityID(Integer commodityID) {
		this.commodityID = commodityID;
	}
	public String getConsumptionNumber() {
		return consumptionNumber;
	}
	public void setConsumptionNumber(String consumptionNumber) {
		this.consumptionNumber = consumptionNumber;
	}
	public float getConsumptionMoney() {
		return consumptionMoney;
	}
	public void setConsumptionMoney(float consumptionMoney) {
		this.consumptionMoney = consumptionMoney;
	}
	public Date getConsumptionTime() {
		return consumptionTime;
	}
	public void setConsumptionTime(Date consumptionTime) {
		this.consumptionTime = consumptionTime;
	}
	 
	 
}
