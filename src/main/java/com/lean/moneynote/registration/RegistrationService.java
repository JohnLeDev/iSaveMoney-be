package com.lean.moneynote.registration;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
public interface RegistrationService {
		public String register(RegistrationDto dto );
		public String confirm(String token );
}
