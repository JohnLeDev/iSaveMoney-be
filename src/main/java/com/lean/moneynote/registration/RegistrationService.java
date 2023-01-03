package com.lean.moneynote.registration;

public interface RegistrationService {
		public String register(RegistrationDto dto );
		public String confirm(String token );
}
