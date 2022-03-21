package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import lombok.Data;

@Data
public class PolicyChecking {
	
	@Id
    private Long bikeId;
	
	@Column(name="FirstName")
	private String firstName;
	
	
	@Column(name="PanCardNo")
	private Long panCardNo;
	
	
	@Column(name="MobileNo")
	private Long mobileNo;
	
	@Column(name="Email_Id")
	private String emailId;
	
	@Column(name="LincenseIdNo")
	private Long lincenseIdNo;
	
	@Column(name="MODEL")
	private String model;
	
	@Column(name="COLOR")
	private String color;
	
	
	@Column(name="PremiumYouPay")
	private int premiumYouPay;


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


	public Long getPanCardNo() {
		return panCardNo;
	}


	public void setPanCardNo(Long panCardNo) {
		this.panCardNo = panCardNo;
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


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPremiumYouPay() {
		return premiumYouPay;
	}


	public void setPremiumYouPay(int premiumYouPay) {
		this.premiumYouPay = premiumYouPay;
	}


	
	
	
	
}