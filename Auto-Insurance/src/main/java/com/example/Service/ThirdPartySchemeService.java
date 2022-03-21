package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Model.ThirdPartyScheme;
import com.example.Repository.ThirdPartySchemeRepository;

@Service
public class ThirdPartySchemeService {
	
	@Autowired
	private ThirdPartySchemeRepository ThirdRepository;
	
	public List<ThirdPartyScheme>getThirdPartyScheme(){
		return (List<ThirdPartyScheme>) ThirdRepository.findAll();
		
	}
	public ThirdPartyScheme getThirdPartySchemeBySchemeId(int schemeId){
		return ThirdRepository.findBySchemeId(schemeId);
	}

}
