package com.std;

public class MyExpHandler extends Exception{
	
	public MyExpHandler() {
		super();
	}
	
	public MyExpHandler(String msg) {
		super(msg);
	}
	
	public MyExpHandler(String msg, Throwable cause) {
		super(msg,cause);
	}
	

}
