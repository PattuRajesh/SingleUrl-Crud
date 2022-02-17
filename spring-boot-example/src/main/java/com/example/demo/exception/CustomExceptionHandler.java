package com.example.demo.exception;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.example.demo.response.ErrorResponse;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(RecordNotFoundException.class)
	public final ResponseEntity<Object> handleRecordNotFoundException(Exception ex,WebRequest request)throws Exception{
		
	   ErrorResponse error=new ErrorResponse(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
	
	
	
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<Object> handleMethodArgumentTypeMismatchException(Exception ex,WebRequest request)throws Exception{
		 
      ErrorResponse error=new ErrorResponse(new Date(),ex.getMessage(),request.getDescription(false));
	  return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		
	}
    
	
	}
