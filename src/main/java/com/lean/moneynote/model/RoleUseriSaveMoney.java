package com.lean.moneynote.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_role_isavemoney")
public class RoleUseriSaveMoney {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	RoleiSaveMoney roleiSaveMoney;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	UseriSaveMoney useriSaveMoney;
	
}
