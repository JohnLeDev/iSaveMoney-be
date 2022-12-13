package com.lean.moneynote.model;

import java.util.Date;

import com.lean.moneynote.common.model.BaseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_isavemoney")
public class UseriSaveMoney extends BaseModel {

	private String username;
	private String password;
	private Date dob;
	private Integer phoneNumber;
	
	private Boolean isActive;
	
	private Boolean isStatus;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsStatus() {
		return isStatus;
	}

	public void setIsStatus(Boolean isStatus) {
		this.isStatus = isStatus;
	}

}
