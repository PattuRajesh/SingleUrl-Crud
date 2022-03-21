package com.example.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;
@Data
public class PolicyCheckingDTO {
	
	
	@Id
    private Long bikeId;
	
	@Column(name="FirstName")
	private String firstName;
	
	
	@Column(name="PanCardNo")
	private Long panCardNo;
	
	
	@Column(name="MobileNo")
	private Long mobileNo;

	@Column(name="MODEL")
	private String model;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="SchemeId")
	private int schemeId;
	
   @Column(name="PremiumYouPay")
	private int premiumYouPay;
	
	
	
}
