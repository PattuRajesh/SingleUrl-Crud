package com.example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.PolicyChecking;
import com.example.Service.PolicyCheckingService;
import com.example.dto.PolicyCheckingDTO;
import com.example.mapper.PolicyCheckingMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RequiredArgsConstructor
@RestController
public class PolicyCheckingController {

	@Autowired
	private final PolicyCheckingService policyService;
	
	
	@Autowired
	private PolicyCheckingMapper policyMapper;

	

	public PolicyCheckingController(PolicyCheckingService policyService) {
		super();
		this.policyService = policyService;
	}

    @GetMapping
    public ResponseEntity<List<PolicyChecking>> findAll() {
        return ResponseEntity.ok(policyMapper.toPolicyCheckingDTOs(policyService.findAll()));
    }

    @PostMapping
    public ResponseEntity<PolicyCheckingDTO> create(@RequestBody PolicyCheckingDTO policyDTO) {
        policyService.save(policyMapper.toPolicyChecking(policyDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(policyDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PolicyCheckingDTO> findById(@PathVariable Long bikeId) {
        Optional<PolicyChecking> policy= policyService.findByBikeId(bikeId);

        return ResponseEntity.ok(policyMapper.toPolicyCheckingDTO(policy.get()));
    }


    @DeleteMapping("/{bikeId}")
    public ResponseEntity<PolicyCheckingDTO> delete(@PathVariable Long bikeId) {
        policyService.deleteByBikeId(bikeId);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

	 
	 
//	 @GetMapping("/check")
//	    public ResponseEntity<Object> Get(){
//	        try {
//	            List<PolicyChecking> result = (List<PolicyChecking>) PolicyService.getPolicyChecking();
//	            if(result==null){
//	                throw new RecordNotFoundException("Record_Not_Found");
//	            }
//	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
//	        }catch(Exception e){
//
//	        	return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
//	        }
//} 
//	 
//	 
//	 
//	  @GetMapping("/check/{bikeId}")
//	    public ResponseEntity<Object> Get(@PathVariable Long bikeId) {
//		 try{
//	    		PolicyChecking result =  this.PolicyService.getPolicyCheckingByBikeId(bikeId);
//	    		
//	    		if(result==null){
//	    			throw new RecordNotFoundException("Record_Not_Found");
//	    		}
//	    		return SucessResponse.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
//	    	
//	    	}catch(Exception e){
//	    		
//	    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);	
//	    	}
//	 }

		

}
