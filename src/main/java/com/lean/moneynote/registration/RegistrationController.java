package com.lean.moneynote.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;

	@GetMapping("")
	public String register(@RequestBody RegistrationDto dto ) {
		registrationService.register(dto);
		return "register";
	}
	
	@PostMapping("")
	public String confirm(@RequestParam("token") String token ) {
		return "confirm";
	}
}
