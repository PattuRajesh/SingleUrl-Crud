package com.example.Response;

import java.util.Date;
import java.util.List;

public class ErrorResponse {
	private Date timestamp;
    private String message;
    private List<String> details;
	public ErrorResponse(Date timestamp, String message, List<String> details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	public List<String> getDetails() {
		return details;
	}
   
   

}
