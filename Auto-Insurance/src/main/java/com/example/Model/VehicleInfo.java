package com.example.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
@Table(name = "Vehicle_Details")
public class VehicleInfo implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	private Long regId;
	
//	@Column(name="BIKEID")
//    private Long bikeId;
	

	@NotNull
	@Size(min=1,max=10,message="Model should be have 10 characters")
	@Column(name="MODEL")
	private String model;
	

	@NotNull
	@Size(min=1,max=8,message="Color should be have 10 characters")
	@Column(name="COLOR")
	private String color;
	
	@Column(name="Year_Of_Regstraion")
	private Date yearOfReg;
	
	@Column(name="Seating_capacity")
	private int seatingCapacity;
	private int engineNo;
	
	@Pattern(regexp = "^[YN]$", message = "UsePrivate Choose any one Option Must be either Y or N")
	private String usePrivate;
	
	@Column(name="Chassis_Number")
	private Long chassisNumber;
    public VehicleInfo() {
    	
    }
	public VehicleInfo(Long regId, String model, String color, Date yearOfReg, int seatingCapacity, int engineNo,
			String usePrivate, Long chassisNumber) {
		super();
		this.regId = regId;
		this.model = model;
		this.color = color;
		this.yearOfReg = yearOfReg;
		this.seatingCapacity = seatingCapacity;
		this.engineNo = engineNo;
		this.usePrivate = usePrivate;
		this.chassisNumber = chassisNumber;
	}
	public Long getRegId() {
		return regId;
	}
	public void setRegId(Long regId) {
		this.regId = regId;
	}
//	public Long getBikeId() {
//		return bikeId;
//	}
//	public void setBikeId(Long bikeId) {
//		this.bikeId = bikeId;
//	}
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
	public Date getYearOfReg() {
		return yearOfReg;
	}
	public void setYearOfReg(Date yearOfReg) {
		this.yearOfReg = yearOfReg;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public String getUsePrivate() {
		return usePrivate;
	}
	public void setUsePrivate(String usePrivate) {
		this.usePrivate = usePrivate;
	}
	public Long getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(Long chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	   
}
