package com.lean.moneynote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/register")
public class RegisterController {
	
	@GetMapping()
	public boolean registerUser() {
		return true;
	}
	
}
