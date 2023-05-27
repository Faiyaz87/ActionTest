package com.std.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.MyExpHandler;

@RestController
public class TestController {
	
	@GetMapping("/getExp")
	public String generateExp() throws Exception{
		int x = 0/0;
		throw new MyExpHandler("just need to test exp");
		//return "perfect";
	}
	
	@GetMapping("/hi")
	public String welcome() throws Exception{
		return "success";
	}

}
