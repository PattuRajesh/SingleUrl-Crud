package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.RecordNotFoundException;
import com.example.Model.ComprehensiveScheme;
import com.example.Response.ResponseHandler;
import com.example.Response.SucessResponse;
import com.example.Service.ComprehensiveSchemeService;

@RestController
public class  ComprehensiveSchemeController {
	
	@Autowired
	 private ComprehensiveSchemeService comprehensiveService;
	
	  @GetMapping("/comprehensive")
	    public ResponseEntity<Object> Get(){
	        try {
	            List<ComprehensiveScheme> result = (List<ComprehensiveScheme>) comprehensiveService.getComprehensiveScheme();
	            if(result==null){
	                throw new RecordNotFoundException("Record_Not_Found");
	            }
	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
	        }catch(Exception e){

	        	return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	        }
} 
	  @GetMapping("/comprehensive/{planId}")
	    public ResponseEntity<Object> Get(@PathVariable int planId) {
		 
	    	try{
	    		ComprehensiveScheme result =  this.comprehensiveService.getComprehensiveSchemeByPlanId(planId);
	    		
	    		if(result==null){
	    			throw new RecordNotFoundException("Record_Not_Found");
	    		}
	    		return SucessResponse.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
	    	
	    	}catch(Exception e){
	    		
	    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);	
	    	}
	 }

	
}
