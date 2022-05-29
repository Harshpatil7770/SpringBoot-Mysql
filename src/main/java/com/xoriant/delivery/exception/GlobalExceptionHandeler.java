package com.xoriant.delivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandeler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(InputUserException.class)
	public ResponseEntity<String> inputUserException(InputUserException exception) {
		return new ResponseEntity<String>("Please Check Input Fields !", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ElementNotFoundException.class)
	public ResponseEntity<String> elementNotFoundException(ElementNotFoundException exception) {
		return new ResponseEntity<String>("Element Not Found !", HttpStatus.BAD_REQUEST);
	}
}
