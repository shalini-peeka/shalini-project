package com.ewatchproject.exception;
	
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(AppUserException.class)
	public ResponseEntity<String> handleAppUserException(AppUserException ex){
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);

	}
	@ExceptionHandler(InvalidSubscriptionException.class)
	public ResponseEntity<String> handleSubscriptionException(InvalidSubscriptionException e){
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
	}

}


