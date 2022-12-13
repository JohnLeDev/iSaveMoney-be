package com.lean.moneynote.model;

import java.util.Set;

import com.lean.moneynote.common.model.BaseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name="role_isavemoney")
@Entity
public class RoleiSaveMoney extends BaseModel {
	
	private String role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@OneToMany(mappedBy = "role_isavemoney")
	Set<RoleUseriSaveMoney> roleUser;
	
	
}
