package cn.hotel.entity;

import java.io.Serializable;
/**
 * 属性明细
 * @author
 *
 */
public class AttributeDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1024561644070728306L;

	  private Integer id;//属性明细ID
	  private Integer attributeID;//属性ID（外键）
	  private String attributeDetailsName;//属性明细名称
/*	  private Integer far_id;
	  private String attributeName;
	  */
	  
	  
	public AttributeDetails() {
		super();
	}
	public AttributeDetails(Integer id, Integer attributeID,
			String attributeDetailsName) {
		super();
		this.id = id;
		this.attributeID = attributeID;
		this.attributeDetailsName = attributeDetailsName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAttributeID() {
		return attributeID;
	}
	public void setAttributeID(Integer attributeID) {
		this.attributeID = attributeID;
	}
	public String getAttributeDetailsName() {
		return attributeDetailsName;
	}
	public void setAttributeDetailsName(String attributeDetailsName) {
		this.attributeDetailsName = attributeDetailsName;
	}
/*	public Integer getFar_id() {
		return far_id;
	}
	public void setFar_id(Integer far_id) {
		this.far_id = far_id;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	  */
	
}
