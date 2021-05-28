package com.santander.bootcamp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler{
	
	
//	  @ExceptionHandler protected ResponseEntity<ExceptionResponse>
//	  handleSecurity(StockException e){ return
//	  ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new
//	  ExceptionResponse(e.getMessage()));
//	 
//	 }
//	 
//	 @ExceptionHandler protected ResponseEntity<ExceptionResponse>
//	 NotFoundException(StockException e){ return
//	 ResponseEntity.status(HttpStatus.NOT_FOUND).body(new
//	 ExceptionResponse(e.getMessage()));
//	 
//	  }
	 
}
