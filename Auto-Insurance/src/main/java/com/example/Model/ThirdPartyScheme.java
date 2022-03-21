package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ThirdPartyScheme")
public class ThirdPartyScheme {
	
	
	@Id
	private int schemeId;
	
//	@Column(name="BIKEID")
//    private Long bikeId;
	
	@Column(name="PartyLiabilittyPremium")
	private int liabilityPremium;
	
	@Column(name="Good_ServiceTax")
    private int goodServiceTax;
	
	
	@Column(name="PremiumYouPay")
	private int premiumYouPay;

	public ThirdPartyScheme()
	{
		
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

//	public Long getBikeId() {
//		return bikeId;
//	}
//
//	public void setBikeId(Long bikeId) {
//		this.bikeId = bikeId;
//	}

	public int getLiabilityPremium() {
		return liabilityPremium;
	}

	public void setLiabilityPremium(int liabilityPremium) {
		this.liabilityPremium = liabilityPremium;
	}

	public int getGoodServiceTax() {
		return goodServiceTax;
	}

	public void setGoodServiceTax(int goodServiceTax) {
		this.goodServiceTax = goodServiceTax;
	}

	public int getPremiumYouPay() {
		return premiumYouPay;
	}

	public void setPremiumYouPay(int premiumYouPay) {
		this.premiumYouPay = premiumYouPay;
	}

	public ThirdPartyScheme(int schemeId, int liabilityPremium, int goodServiceTax, int premiumYouPay) {
		super();
		this.schemeId = schemeId;
		this.liabilityPremium = liabilityPremium;
		this.goodServiceTax = goodServiceTax;
		this.premiumYouPay = premiumYouPay;
	}
	
	
	

}
