package cn.hotel.entity;

import java.util.List;

import javax.lang.model.element.Element;

public class StayRegisterVO extends StayRegisters{
	
/*------------------------------------�ÿ�-----------------------------------*/
	
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*----------------------------------�ÿͽ���--------------------------------------*/
	
	
	
	/*---------------------------------����-----------------------------------------------*/
	
	
	private String roomNumber;


	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	
	/*---------------------------------�������-----------------------------------------------*/
	
	
	
	/*--------------------------------------����-------------------------------------------------*/
	
	
	private String attributeDetailsName;


	public String getAttributeDetailsName() {
		return attributeDetailsName;
	}

	public void setAttributeDetailsName(String attributeDetailsName) {
		this.attributeDetailsName = attributeDetailsName;
	}
	
	private String e_attributeDetailsName;
	
	
	
	/*--------------------------------------���ͽ���-------------------------------------------------*/
	
	
	/*--------------------------------------���-------------------------------------------------*/
	
	public String getE_attributeDetailsName() {
		return e_attributeDetailsName;
	}

	public void setE_attributeDetailsName(String e_attributeDetailsName) {
		this.e_attributeDetailsName = e_attributeDetailsName;
	}

	private double consumptionMoney;


	public double getConsumptionMoney() {
		return consumptionMoney;
	}

	public void setConsumptionMoney(double consumptionMoney) {
		this.consumptionMoney = consumptionMoney;
	}
	
	
	
	/*-------------------------------------������-------------------------------------------------*/
	
	/*--------------------------------------StayRegisterDetails��id------------------------------------------------------*/
	private Integer stsid;


	public Integer getStsid() {
		return stsid;
	}

	public void setStsid(Integer stsid) {
		this.stsid = stsid;
	}
	
	
	/*--------------------------------------StayRegisterDetails------------------------------------------------------*/
	
	private String teamCode;
	
	private String principal;
	
	private String contactPhoneNUmber;
	
	private String genderID;
	
	private String papersID;
	
	private String papersNumber;
	
	private String contactPhoneNumbers;
	
	
	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getContactPhoneNUmber() {
		return contactPhoneNUmber;
	}

	public void setContactPhoneNUmber(String contactPhoneNUmber) {
		this.contactPhoneNUmber = contactPhoneNUmber;
	}

	public String getGenderID() {
		return genderID;
	}

	public void setGenderID(Integer genderID) {
		if (genderID==31) {
			this.genderID="男";
		}else if (genderID==32) {
			this.genderID="女";
		}
	}

	public String getPapersID() {
		return papersID;
	}

	public void setPapersID(Integer papersID) {
		if (papersID==37) {
			this.papersID="二代身份证";
		}else if (papersID==38) {
			this.papersID="护照";
		}else{
			this.papersID="其他";
		}
	}

	public String getPapersNumber() {
		return papersNumber;
	}

	public void setPapersNumber(String papersNumber) {
		this.papersNumber = papersNumber;
	}

	public String getContactPhoneNumbers() {
		return contactPhoneNumbers;
	}

	public void setContactPhoneNumbers(String contactPhoneNumbers) {
		this.contactPhoneNumbers = contactPhoneNumbers;
	}

	public String ats_attributeDetailsName;

	public String getAts_attributeDetailsName() {
		return ats_attributeDetailsName;
	}

	public void setAts_attributeDetailsName(String ats_attributeDetailsName) {
		this.ats_attributeDetailsName = ats_attributeDetailsName;
	}
	
	private String passengerLevelID;


	public String getPassengerLevelID() {
		return passengerLevelID;
	}

	public void setPassengerLevelID(Integer passengerLevelID) {
		if (passengerLevelID==52) {
			this.passengerLevelID="首次";
		}else if (passengerLevelID==53) {
			this.passengerLevelID="熟客";
		}else if (passengerLevelID==54) {
			this.passengerLevelID="VIP";
		}
	}
	
	private String b_attributeDetailsName;


	public String getB_attributeDetailsName() {
		return b_attributeDetailsName;
	}

	public void setB_attributeDetailsName(String b_attributeDetailsName) {
		this.b_attributeDetailsName = b_attributeDetailsName;
	}
	
	private String a_attributeDetailsName;


	public String getA_attributeDetailsName() {
		return a_attributeDetailsName;
	}

	public void setA_attributeDetailsName(String a_attributeDetailsName) {
		this.a_attributeDetailsName = a_attributeDetailsName;
	}
	
	private String c_attributeDetailsName;


	public String getC_attributeDetailsName() {
		return c_attributeDetailsName;
	}

	public void setC_attributeDetailsName(String c_attributeDetailsName) {
		this.c_attributeDetailsName = c_attributeDetailsName;
	}

	private double standardPriceDay;


	public double getStandardPriceDay() {
		return standardPriceDay;
	}

	public void setStandardPriceDay(double standardPriceDay) {
		this.standardPriceDay = standardPriceDay;
	}
	
	private double standardPrice;


	public double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(double standardPrice) {
		this.standardPrice = standardPrice;
	}
	
	private double firstPrice;


	public double getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(double firstPrice) {
		this.firstPrice = firstPrice;
	}
	
	private double predetermineDay;


	public double getPredetermineDay() {
		return predetermineDay;
	}

	public void setPredetermineDay(double predetermineDay) {
		this.predetermineDay = predetermineDay;
	}
	
	private double deposit;


	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	
	
}
