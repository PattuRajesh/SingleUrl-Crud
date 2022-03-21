package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Model.State;
import com.example.Response.ResponseHandler;
import com.example.Response.SucessResponse;
import com.example.Service.StateService;
@RestController
public class StateController {
	@Autowired
	 private StateService stateService;
	
	  @GetMapping("/state")
	    public ResponseEntity<Object> Get(){
	        try {
	            List<State> result = (List<State>) stateService.getState();
//	            if(result==null){
//	                throw new RecordNotFoundException("Record_Not_Found");
//	            }
	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
	        }catch(Exception e){

	        	return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	        }
} 
	  
	 
}
