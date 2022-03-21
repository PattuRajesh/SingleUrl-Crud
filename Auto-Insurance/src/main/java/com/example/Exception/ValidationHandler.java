package com.example.Exception;

import java.util.Date;
import java.util.List;

public class ValidationHandler {
	private Date timestamp;
    private String message;
    private List<String> errorlist;
    
	public ValidationHandler(Date timestamp, String message, List<String> errorlist) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.errorlist = errorlist;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getErrorlist() {
		return errorlist;
	}
	public void setErrorlist(List<String> errorlist) {
		this.errorlist = errorlist;
	}
    
}