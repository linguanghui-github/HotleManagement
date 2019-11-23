package cn.hotel.entity;

import java.io.Serializable;
/**
 * 属性
 * @author
 *
 */
public class Attribute implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6098879315837227875L;

	private Integer id;	//属性ID
	private String attributeName;//属性名称
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	
}
