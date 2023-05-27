package com.std;

import org.springframework.http.HttpStatus;

public class ExpResp {
	
	private final String msg;
	private final HttpStatus status;
	
	public ExpResp(String msg, HttpStatus status) {
		super();
		this.msg = msg;
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public HttpStatus getStatus() {
		return status;
	}
	
	

}
