package com.example.Response;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class SucessResponse {
	  public static ResponseEntity<Object> handleUserNotFoundException;

	    public static ResponseEntity<Object> generateResponse(String message, HttpStatus timestamp, Object responseObj) {
	        Map<String, Object> map = new HashMap<String, Object>();
	        map.put("message", message);
	        map.put("data", responseObj);
	        map.put("timestamp",new Date());

	        return new ResponseEntity<Object>(map,timestamp);
	    }

}
