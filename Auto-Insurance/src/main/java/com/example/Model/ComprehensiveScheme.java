package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Comprehensive_policy")
public class ComprehensiveScheme {
	
	@Id
	private int planId;

	@Column(name="BIKEID")
    private Long bikeId;
	
	@Column(name="YouBasicPremium")
	private int basicPremium;
	
	@Column(name="NCB_Discount")
	private int ncbDiscount;
	
	@Column(name="PartyLiabilittyPremium")
	private int liabilityPremium;
	
	@Column(name="Good_ServiceTax")
	private int goodServiceTax;
	
	@Column(name="PremiumYouPay")
	private int premiumYouPay;
	
	public ComprehensiveScheme() {
		
	}

	public ComprehensiveScheme(int planId, Long bikeId, int basicPremium, int ncbDiscount, int liabilityPremium,
			int goodServiceTax, int premiumYouPay) {
		super();
		this.planId = planId;
		this.bikeId = bikeId;
		this.basicPremium = basicPremium;
		this.ncbDiscount = ncbDiscount;
		this.liabilityPremium = liabilityPremium;
		this.goodServiceTax = goodServiceTax;
		this.premiumYouPay = premiumYouPay;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public Long getBikeId() {
		return bikeId;
	}

	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}

	public int getBasicPremium() {
		return basicPremium;
	}

	public void setBasicPremium(int basicPremium) {
		this.basicPremium = basicPremium;
	}

	public int getNcbDiscount() {
		return ncbDiscount;
	}

	public void setNcbDiscount(int ncbDiscount) {
		this.ncbDiscount = ncbDiscount;
	}

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

	

}
