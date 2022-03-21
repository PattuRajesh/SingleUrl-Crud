package com.example.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Cust_Details")
public class CustomerInfo implements Serializable {

  private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private Long bikeId;
	
	@NotBlank(message = "Please enter First Name")
	@Size(min=1,max=8, message = "First Name should be atleast 12 characters")
	@Column(name="FirstName")
	private String firstName;

	@NotBlank(message = "Please enter Middle Name")
	@Size(min=1,max=8, message = "Middle Name should be atleast 12 characters")
	@Column(name="MiddleName")
	private String middleName;
	
	
	@NotBlank(message = "Please enter Last Name")
	@Size(min=1,max=8, message = "Last Name should be atleast 12 characters")
	@Column(name="LastName")
	private String lastName;
	
	
	@Pattern(regexp = "^[YN]$", message = "Gender Option Must be either Y or N")
    @Column(name="Gender")
	private String gender;
	
	@Column(name="DateofBirth")
	private Date dateOfBirth;
	
	

	@NotBlank(message = "Please enter Father Name")
	@Size(min=1,max=8, message = "Father Name should be atleast 12 characters")
	@Column(name="FatherName")
	private String fatherName;
	
	

	@NotBlank(message = "Please enter Mother Name")
	@Size(min=1,max=8, message = "Mother Name should be atleast 12 characters")
	@Column(name="MotherName")
	private String motherName;
	
	

	@NotBlank(message = "Please enter Nationality")
	@Size(min=1,max=8, message = "Nationality should be atleast 10 characters")
	@Column(name="Nationality")
	private String nationality;
	
	
	
	@Pattern(regexp = "^[YN]$", message = "MartialStatus Option Must be either Y or N")
	@Column(name="MartailStatus")
	private String martialStatus;
	
	@Column(name="Spouse")
	private String spouse;
	
	
	@Column(name="PanCardNo")
	private Long panCardNo;
	
	@Column(name="StateNames")
	private int stateId;
	
	

	@Column(name="CityNames")
	private int cityId;
	
	
		  
	@Column(name="Address")
	private int addressId;


	@Column(name="PinCode")
	private int pinCodeId;
	
	@Column(name="MobileNo")
	private Long mobileNo;
	
	@Column(name="Email_Id")
	private String emailId;
	
	@Column(name="LincenseIdNo")
	private Long lincenseIdNo;
	
	@Column(name="LincenseDueDate")
	private Date lincenseDueDate;
	
	@Column(name="LincenseValidDate")
	private Date lincenseValidDate;
	
	@Column(name="Occupation")
	private String occupation;
	
	
	@Column(name="CompanyName")
	private String companyName;
	
    public CustomerInfo() {
		
	}

	public CustomerInfo(Long bikeId,String firstName, String middleName, String lastName,
			 String gender,Date dateOfBirth, String fatherName, String motherName,String nationality, String martialStatus,
			String spouse, Long panCardNo, int stateId, int cityId, int addressId, int pinCodeId, Long mobileNo,
			String emailId, Long lincenseIdNo, Date lincenseDueDate, Date lincenseValidDate, String occupation,
			String companyName) {
		super();
		this.bikeId = bikeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.nationality = nationality;
		this.martialStatus = martialStatus;
		this.spouse = spouse;
		this.panCardNo = panCardNo;
		this.stateId = stateId;
		this.cityId = cityId;
		this.addressId = addressId;
		this.pinCodeId = pinCodeId;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.lincenseIdNo = lincenseIdNo;
		this.lincenseDueDate = lincenseDueDate;
		this.lincenseValidDate = lincenseValidDate;
		this.occupation = occupation;
		this.companyName = companyName;
	}

	public Long getBikeId() {
		return bikeId;
	}

	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public Long getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(Long panCardNo) {
		this.panCardNo = panCardNo;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getPinCodeId() {
		return pinCodeId;
	}

	public void setPinCodeId(int pinCodeId) {
		this.pinCodeId = pinCodeId;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getLincenseIdNo() {
		return lincenseIdNo;
	}

	public void setLincenseIdNo(Long lincenseIdNo) {
		this.lincenseIdNo = lincenseIdNo;
	}

	public Date getLincenseDueDate() {
		return lincenseDueDate;
	}

	public void setLincenseDueDate(Date lincenseDueDate) {
		this.lincenseDueDate = lincenseDueDate;
	}

	public Date getLincenseValidDate() {
		return lincenseValidDate;
	}

	public void setLincenseValidDate(Date lincenseValidDate) {
		this.lincenseValidDate = lincenseValidDate;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}