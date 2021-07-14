package com.br.web.Entity;

import lombok.Data;

public @Data class User {

	
	private String name;
	
	private String email;

	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
}
