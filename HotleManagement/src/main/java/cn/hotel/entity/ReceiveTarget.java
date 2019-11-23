package cn.hotel.entity;

import java.io.Serializable;
/**
 * 接待对象
 * @author
 *
 */
public class ReceiveTarget implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -1454751469701553147L;
	private Integer id;//接待对象ID
	 private Integer targetTypeID;// 对象类别ID
	 private String principal;//负责人
	 private String teamName;//团队名称
	 private String teamCode;//团队编号
	 private String registerTime;//登记时间
	 private String contactPhoneNUmber;//联系电话
	public ReceiveTarget(Integer id, Integer targetTypeID, String principal,
			String teamName, String teamCode, String registerTime,
			String contactPhoneNUmber) {
		super();
		this.id = id;
		this.targetTypeID = targetTypeID;
		this.principal = principal;
		this.teamName = teamName;
		this.teamCode = teamCode;
		this.registerTime = registerTime;
		this.contactPhoneNUmber = contactPhoneNUmber;
	}
	public ReceiveTarget() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTargetTypeID() {
		return targetTypeID;
	}
	public void setTargetTypeID(Integer targetTypeID) {
		this.targetTypeID = targetTypeID;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCode() {
		return teamCode;
	}
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getContactPhoneNUmber() {
		return contactPhoneNUmber;
	}
	public void setContactPhoneNUmber(String contactPhoneNUmber) {
		this.contactPhoneNUmber = contactPhoneNUmber;
	}
	 

}
