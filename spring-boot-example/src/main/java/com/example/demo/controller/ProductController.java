package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.response.ResponseHandler;
import com.example.demo.response.SucessResponse;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	 private ProductService productService;
	  @GetMapping("/products")
	    public ResponseEntity<Object> Get(){
	        try {
	            List<Product> result = (List<Product>) productService.getProducts();
	            if(result==null){
	                throw new RecordNotFoundException("Record_Not_Found");
	            }
	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
	        }catch(Exception e){

	            throw new RecordNotFoundException("Record_Not_Found");
	        }
} 
	  
	 
	/*@PostMapping("/products")
	  public ResponseEntity<Object> Post( @RequestBody Product product){
	     // try{
	       Product result = productService.saveProduct(product);
	       if(result==null) {
	    	        throw new RecordNotFoundException("Record_Not_Found");
	       }
	  
	       else {
	    	   productService.saveProduct(product);
	       
	     // }catch (Exception e){
	       return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK);
	      //    return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS,null);
	     // }
	  }
	 }
	  @PutMapping("/products")
	    public ResponseEntity<Object> Update(@RequestBody Product product){
	        
	           Product result = productService.updateProduct(product);
	           if(result==null){
	                throw new RecordNotFoundException("Record_Not_Found");  
	                }
	            return ResponseHandler.generateResponse("updated",HttpStatus.OK);
	        }
	            //return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS,null);
	        //}
	    //}*/

	
	  
	   @DeleteMapping("/product/{acm_sys_id}")
	    public ResponseEntity<Object> Delete(@PathVariable int acm_sys_id){
	        try{
	            String result = productService.deleteProduct(acm_sys_id);
	            if(result==null){
	                throw new RecordNotFoundException("Record_Not_Found");
	            }
	            return ResponseHandler.generateResponse("Deleted!", HttpStatus.OK);
	        }catch (Exception e){
	            return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	            
	        }
	    }
	  
	  @GetMapping("/products/{acm_sys_id}")
	  public ResponseEntity<Object> Get(@PathVariable int acm_sys_id) {
		  try{
		      Product result = productService.getProductByAcm_sys_id(acm_sys_id);
		      if(result==null){
		          throw new RecordNotFoundException("Record_Not_Found");
		      }
		      return  SucessResponse.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
		  }catch(Exception e){
			  throw new RecordNotFoundException ("Record_Not_Found");
	            
		  }
}
	   
 @PostMapping("/products")
	  public ResponseEntity<Object> Post( @RequestBody Product product){
	     try{
	   //Product result = productService.saveProduct(product);
	       if(productService.getProductByAcm_sys_id(product.getAcm_sys_id())==null) {
	    	  
	    	  throw new RecordNotFoundException("Record_Not_Found");
	       }    
	       else{
	    	  // product = productService.updateProduct(product);
	    	   productService.updateProduct(product);
	    	   return ResponseHandler.generateResponse("updated",HttpStatus.OK);
	      } 
	     }catch(Exception ex) {
	    	   
	    	   productService.saveProduct(product);
		       return ResponseHandler.generateResponse("Successfully added data!",HttpStatus.OK);
	        }
	      
}
}
	 

