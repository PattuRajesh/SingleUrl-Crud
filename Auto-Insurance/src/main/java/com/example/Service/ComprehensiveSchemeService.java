package com.example.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Model.ComprehensiveScheme;

import com.example.Repository.ComprehensiveSchemeRepository;

@Service
public class ComprehensiveSchemeService {
	
	@Autowired
	private ComprehensiveSchemeRepository comprehensiveRepository;
	
	public List<ComprehensiveScheme>getComprehensiveScheme(){
		return (List<ComprehensiveScheme>) comprehensiveRepository.findAll();
		
	}
	public ComprehensiveScheme getComprehensiveSchemeByPlanId(int planId){
		return comprehensiveRepository.findByPlanId(planId);
	}
}
