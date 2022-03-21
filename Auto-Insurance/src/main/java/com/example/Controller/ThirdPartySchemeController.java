package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.RecordNotFoundException;
import com.example.Model.ThirdPartyScheme;
import com.example.Response.ResponseHandler;
import com.example.Response.SucessResponse;
import com.example.Service.ThirdPartySchemeService;
@RestController
public class ThirdPartySchemeController {
	

	@Autowired
	 private ThirdPartySchemeService ThirdPartyService;
	  @GetMapping("/thirdparty")
	    public ResponseEntity<Object> Get(){
	        try {
	            List<ThirdPartyScheme> result = (List<ThirdPartyScheme>) ThirdPartyService.getThirdPartyScheme();
//	            if(result==null){
//	                throw new RecordNotFoundException("Record_Not_Found");
//	            }
	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
	        }catch(Exception e){

	        	return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	        }
} 
	  
	  @GetMapping("/thirdparty/{schemeId}")
	    public ResponseEntity<Object> Get(@PathVariable int schemeId) {
		 
	    	try{
	    	ThirdPartyScheme result =  this.ThirdPartyService.getThirdPartySchemeBySchemeId(schemeId);
	    		
	    		if(result==null){
	    			throw new RecordNotFoundException("Record_Not_Found");
	    		}
	    		return SucessResponse.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
	    	
	    	}catch(Exception e){
	    		
	    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);	
	    	}
	 }



}
