package com.example.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.RecordNotFoundException;
import com.example.Model.CustomerInfo;
import com.example.Response.ResponseHandler;
import com.example.Response.SucessResponse;
import com.example.Service.CustomerInfoService;

@RestController
public class CustomerInfoController {
	
	@Autowired
	 private CustomerInfoService customerService;
	
	  @GetMapping("/customers")
	    public ResponseEntity<Object> Get(){
	        try {
	            List<CustomerInfo> result = (List<CustomerInfo>) customerService.getCustomerInfos();
//	            if(result==null){
//	                throw new RecordNotFoundException("Record_Not_Found");
//	            }
	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
	        }catch(Exception e){

	        	return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	        }
} 

	  
//	  @PutMapping("/customers")
//	    public ResponseEntity<Object> Update(@RequestBody CustomerInfo customer){
//	        
//	         CustomerInfo result = customerService.updateCustomerInfo(customer);
//	           if(result==null){
//	                throw new RecordNotFoundException("Record_Not_Found");  
//	                }
//	            return ResponseHandler.generateResponse("updated",HttpStatus.OK);
//	        }
//	            //return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
//	        //}
//	    //}*/

	   @DeleteMapping("/customers/{bikeId}")
	    public ResponseEntity<Object> Delete(@PathVariable Long bikeId){
	        try{
	            String result = customerService.deleteCustomerInfo(bikeId);
	            if(result==null){
	                throw new RecordNotFoundException("Record_Not_Found");
	            }
	            return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK);
	        }catch (Exception e){
	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	            
	        }
	    }
	   @GetMapping("/customers/{bikeId}")
		  public ResponseEntity<Object> Get(@PathVariable Long bikeId) {
			  try{
			     CustomerInfo result = customerService.getCustomerInfoById(bikeId);
			      if(result==null){
			          throw new RecordNotFoundException("Record_Not_Found");
			      }
			      return  SucessResponse.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
			  }catch(Exception e){
				  throw new RecordNotFoundException ("Record_Not_Found");
		            
			  }
	}
  
//	 @PostMapping("/customers")
//		  public ResponseEntity<Object> Post(@Valid  @RequestBody CustomerInfo customer){
//		     // try{
//		     CustomerInfo result = customerService.saveCustomerInfo(customer);
//		       if(result==null) {
//		    	        throw new RecordNotFoundException("Record_Not_Found");
//		       }
//		  
//		       else {
//		    	  customerService.saveCustomerInfo(customer);
//		       
//		     // }catch (Exception e){
//		       return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK);
//		      //    return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
//		     // }
//		  }
//		 }
//	 
	   @PostMapping("/customers")
		  public ResponseEntity<Object> Post(@Valid  @RequestBody CustomerInfo customer){
		     try{
		   
		       if(customerService.getCustomerInfoById(customer.getBikeId())==null) {
		    	  
		    	  throw new RecordNotFoundException("Record_Not_Found");
		       }    
		       else{
		    	
		    	  customerService.updateCustomerInfo(customer);
		    	   return ResponseHandler.generateResponse("updated",HttpStatus.OK);
		      } 
		     }catch(Exception ex) {
		    	 customerService.saveCustomerInfo(customer);
			       return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK);
		        }
		      
	}
	 
	  
	  
}
