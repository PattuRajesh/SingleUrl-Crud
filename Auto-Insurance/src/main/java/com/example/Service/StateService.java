package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Model.State;
import com.example.Repository.StateRepository;

@Service
public  class StateService {
   
	@Autowired
	private StateRepository stateRepository;
	
	public List<State>getState(){
		return (List<State>) stateRepository.findAll();
		
	}
	
	
	public State getStateInfoById(int Id){
		return stateRepository.findById(Id).orElse(null);
	}
}
	