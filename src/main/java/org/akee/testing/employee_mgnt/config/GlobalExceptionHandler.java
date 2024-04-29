package org.akee.testing.employee_mgnt.config;

import java.util.Date;

import org.akee.testing.employee_mgnt.dto.ErrorDetails;
import org.akee.testing.employee_mgnt.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> getResourceNotFoundException(ResourceNotFoundException exp, WebRequest request){
		ErrorDetails errDetails = new ErrorDetails(new Date(), exp.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errDetails, HttpStatus.NOT_FOUND);
		
	}

}
