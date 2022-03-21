package com.example.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.PolicyChecking;
import com.example.Repository.PolicyCheckingRespository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class PolicyCheckingService {
	
	@Autowired
	private PolicyCheckingRespository policyRepository;
	

	    public List<PolicyChecking> findAll() {
	        return policyRepository.findAll();
	    }

	    public Optional<PolicyChecking> findByBikeId(Long bikeId) {
	        return policyRepository.findByBikeId(bikeId);
	    }

	    public PolicyChecking save(PolicyChecking stock) {
	        return policyRepository.save(stock);
	    }

	    public void deleteByBikeId(Long id) {
	    	policyRepository.deleteById(id);
	    }

		
//	
//	@Autowired
//	private PolicyCheckingRespository policyRepository;
//	
//	public List<PolicyChecking>  getPolicyChecking(){
//		return (List<PolicyChecking>) policyRepository.findAll();
//		
//	}
//	public PolicyChecking getPolicyCheckingByBikeId(Long bikeId){
//		return policyRepository.findByBikeId(bikeId);
//	}
	
}

	
	   

