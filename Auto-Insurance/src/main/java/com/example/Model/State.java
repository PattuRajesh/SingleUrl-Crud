package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_details")

public class State {
	
	@Id
	private int Id;
	private String StateName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	
}
