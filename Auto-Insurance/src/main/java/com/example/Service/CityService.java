package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.City;
import com.example.Repository.CityRepository;

@Service
public  class CityService {
   
	@Autowired
	private CityRepository cityRepository;
	
	public List<City>getCity(){
		return (List<City>) cityRepository.findAll();
		
	}
	
	public City getCityInfoById(int stateId){
		return cityRepository.findById(stateId).orElse(null);
	}
}