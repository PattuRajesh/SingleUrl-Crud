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
import com.example.Model.VehicleInfo;
import com.example.Response.ResponseHandler;
import com.example.Response.SucessResponse;
import com.example.Service.VehicleInfoService;

@RestController
public class VehicleInfoController {
	
	
	@Autowired
	 private VehicleInfoService vehicleService;
	  @GetMapping("/vehicles")
	    public ResponseEntity<Object> Get(){
	        try {
	            List<VehicleInfo> result = (List<VehicleInfo>) vehicleService.getVehicleInfos();
//	            if(result==null){
//	                throw new RecordNotFoundException("Record_Not_Found");
//	            }
	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
	        }catch(Exception e){

	        	return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	        }
} 
	  
	  @DeleteMapping("/vehicles/{regId}")
	    public ResponseEntity<Object> Delete(@PathVariable Long regId){
	        try{
	            String result = vehicleService.deleteVehicleInfo(regId);
	            if(result==null){
	                throw new RecordNotFoundException("Record_Not_Found");
	            }
	            return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK);
	        }catch (Exception e){
	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	            
	        }
	    }
	  
	  @GetMapping("/vehicles/{regId}")
	  public ResponseEntity<Object> Get(@PathVariable Long regId) {
		  try{
		     VehicleInfo result = vehicleService.getVehicleInfoById(regId);
		      if(result==null){
		          throw new RecordNotFoundException("Record_Not_Found");
		      }
		      return  SucessResponse.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
		  }catch(Exception e){
			  throw new RecordNotFoundException ("Record_Not_Found");
	            
		  }
}
	  
	  @PostMapping("/vehicles")
	  public ResponseEntity<Object> Post(@Valid  @RequestBody VehicleInfo vehicle){
	     try{
	   
	       if(vehicleService.getVehicleInfoById(vehicle.getRegId())==null) {
	    	  
	    	  throw new RecordNotFoundException("Record_Not_Found");
	       }    
	       else{
	    	
	    	 vehicleService.updateVehicleInfo(vehicle);
	    	   return ResponseHandler.generateResponse("updated",HttpStatus.OK);
	      } 
	     }catch(Exception ex) {
	    	 vehicleService.saveVehicleInfo(vehicle);
		       return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK);
	        }
	      
}
 
	  
	  

}
