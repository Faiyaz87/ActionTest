package com.std;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {Exception.class})
	public ResponseEntity<ExpResp> handleAll(){
		ExpResp resp = new ExpResp("Somthing went correct.", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(resp,HttpStatus.BAD_REQUEST);
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = {MyExpHandler.class})
	public ResponseEntity<ExpResp> handleCustom(){
		ExpResp resp = new ExpResp("Custom exp handler working", HttpStatus.EXPECTATION_FAILED);
		return new ResponseEntity<>(resp,HttpStatus.EXPECTATION_FAILED);
	}

}
