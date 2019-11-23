package cn.hotel.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 旅客
 * @author 
 *
 */
public class Passenger implements Serializable {
	   /**
	 * 
	 */
	   private static final long serialVersionUID = 6929016450952420115L;
	   private Integer id;//旅客ID
	   private Integer papersID;//证件ID
	   private Integer educationDegreeID;//文化程度ID
	   private Integer genderID;//性别ID
	   private Integer passengerLevelID;//旅客级别ID
	   private Integer nationID;//民族ID
	   private Integer thingReasonID;//事由
	   private String name;//姓名        
	   private String papersNumber;//证件号码
	   private String birthDate;//出生日期
	   private String licenceIssuingAuthorty;//发证机关
	   private String unitsOrAddress;//单位或住址
	   private String papersValidity;//证件有效期
	   private String profession;//职业
	   private String whereAreFrom;//从何处来
	   private String whereToGo;//到哪里去
	   private String contactPhoneNumber;//联系电话
	   private String remarks;//备注 
	   
	   
	public Passenger() {
		super();
	}


	public Passenger(Integer id, Integer papersID, Integer educationDegreeID,
			Integer genderID, Integer passengerLevelID, Integer nationID,
			Integer thingReasonID, String name, String papersNumber,
			String birthDate, String licenceIssuingAuthorty,
			String unitsOrAddress, String papersValidity, String profession,
			String whereAreFrom, String whereToGo, String contactPhoneNumber,
			String remarks) {
		super();
		this.id = id;
		this.papersID = papersID;
		this.educationDegreeID = educationDegreeID;
		this.genderID = genderID;
		this.passengerLevelID = passengerLevelID;
		this.nationID = nationID;
		this.thingReasonID = thingReasonID;
		this.name = name;
		this.papersNumber = papersNumber;
		this.birthDate = birthDate;
		this.licenceIssuingAuthorty = licenceIssuingAuthorty;
		this.unitsOrAddress = unitsOrAddress;
		this.papersValidity = papersValidity;
		this.profession = profession;
		this.whereAreFrom = whereAreFrom;
		this.whereToGo = whereToGo;
		this.contactPhoneNumber = contactPhoneNumber;
		this.remarks = remarks;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPapersID() {
		return papersID;
	}


	public void setPapersID(Integer papersID) {
		this.papersID = papersID;
	}


	public Integer getEducationDegreeID() {
		return educationDegreeID;
	}


	public void setEducationDegreeID(Integer educationDegreeID) {
		this.educationDegreeID = educationDegreeID;
	}


	public Integer getGenderID() {
		return genderID;
	}


	public void setGenderID(Integer genderID) {
		this.genderID = genderID;
	}


	public Integer getPassengerLevelID() {
		return passengerLevelID;
	}


	public void setPassengerLevelID(Integer passengerLevelID) {
		this.passengerLevelID = passengerLevelID;
	}


	public Integer getNationID() {
		return nationID;
	}


	public void setNationID(Integer nationID) {
		this.nationID = nationID;
	}


	public Integer getThingReasonID() {
		return thingReasonID;
	}


	public void setThingReasonID(Integer thingReasonID) {
		this.thingReasonID = thingReasonID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPapersNumber() {
		return papersNumber;
	}


	public void setPapersNumber(String papersNumber) {
		this.papersNumber = papersNumber;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getLicenceIssuingAuthorty() {
		return licenceIssuingAuthorty;
	}


	public void setLicenceIssuingAuthorty(String licenceIssuingAuthorty) {
		this.licenceIssuingAuthorty = licenceIssuingAuthorty;
	}


	public String getUnitsOrAddress() {
		return unitsOrAddress;
	}


	public void setUnitsOrAddress(String unitsOrAddress) {
		this.unitsOrAddress = unitsOrAddress;
	}


	public String getPapersValidity() {
		return papersValidity;
	}


	public void setPapersValidity(String papersValidity) {
		this.papersValidity = papersValidity;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public String getWhereAreFrom() {
		return whereAreFrom;
	}


	public void setWhereAreFrom(String whereAreFrom) {
		this.whereAreFrom = whereAreFrom;
	}


	public String getWhereToGo() {
		return whereToGo;
	}


	public void setWhereToGo(String whereToGo) {
		this.whereToGo = whereToGo;
	}


	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}


	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	   
}
