package cn.hotel.entity;

import java.io.Serializable;

/**
 * 商品
 * @author
 *
 */
public class Commoditys implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6829047625811977214L;
	private  Integer  id;//商品ID                        
	private  Integer   commodityTypeID;//NULL商品类别ID 
	private  Integer   uOMID;//计量单位ID           
	private  String   commodityName;// NULL商品名称 
	private  float   salePrice;//�?售价�?    
	
	private AttributeDetails a;
	
	private AttributeDetails b;
	
	
	
	public AttributeDetails getA() {
		return a;
	}

	public void setA(AttributeDetails a) {
		this.a = a;
	}

	public AttributeDetails getB() {
		return b;
	}

	public void setB(AttributeDetails b) {
		this.b = b;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Commoditys() {
		super();
	}
	public Commoditys(Integer id, Integer commodityTypeID, Integer uOMID,
			String commodityName, float salePrice) {
		super();
		this.id = id;
		this.commodityTypeID = commodityTypeID;
		this.uOMID = uOMID;
		this.commodityName = commodityName;
		this.salePrice = salePrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCommodityTypeID() {
		return commodityTypeID;
	}
	public void setCommodityTypeID(Integer commodityTypeID) {
		this.commodityTypeID = commodityTypeID;
	}
	public Integer getuOMID() {
		return uOMID;
	}
	public void setuOMID(Integer uOMID) {
		this.uOMID = uOMID;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public float getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	
}
