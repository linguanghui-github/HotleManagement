package cn.hotel.entity;

import java.io.Serializable;

/**
 * 商品
 * @author
 *
 */
public class Commodity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6829047625811977214L;
	private  Integer  id;//商品ID                        
	private  Integer   commodityTypeID;//NULL商品类别ID 
	private  Integer   uOMID;//计量单位ID           
	private  String   commodityName;// NULL商品名称 
	private  String   salePrice;//销售价格    
	private String attributeDetailsName;//商品类型
	private String uOMName;//计量类型
	
	
	
	public Commodity() {
		super();
	}
	public Commodity(Integer id, Integer commodityTypeID, Integer uOMID,
			String commodityName, String salePrice) {
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
	public String getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	public String getAttributeDetailsName() {
		return attributeDetailsName;
	}
	public void setAttributeDetailsName(String attributeDetailsName) {
		this.attributeDetailsName = attributeDetailsName;
	}
	public String getuOMName() {
		return uOMName;
	}
	public void setuOMName(String uOMName) {
		this.uOMName = uOMName;
	}

	
}
