package com.lean.moneynote.registration;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegistrationDto {
	private String username; 
	private String password;
	private Date dob;
	private String phonenumber;
}
