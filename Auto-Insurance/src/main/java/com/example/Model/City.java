package com.example.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "city_details")

public class City implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
    private int id;
	
	@Column(name="stateId")
	private int stateId;
	
	@Column(name="CityName")
	private String cityName;
	
	 @Column(name="Address")
	 private String Address;
	
	 @Column(name="PinCode")
	 private Long pincode;
	
	  public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getStateId() {
			return stateId;
		}

		public void setStateId(int stateId) {
			this.stateId = stateId;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public Long getPincode() {
			return pincode;
		}

		public void setPincode(Long pincode) {
			this.pincode = pincode;
		}

	
}
