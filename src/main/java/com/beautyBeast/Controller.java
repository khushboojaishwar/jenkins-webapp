package com.beautyBeast;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/data")
	public String getDate() {
		return "this is data coming from app";
	}

}
