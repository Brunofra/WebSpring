package com.br.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.web.Entity.User;

@RestController
public class UserController {

	
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public List<User> getusers() {
		
		List<User> lista = new ArrayList<>();
		
		User user = new User("bruno", "bruno@teste.com.br");
		User user2 = new User("maria","maria@teste.com.br");
		lista.add(user);
		lista.add(user2);
		
		return lista;
	}
	
	@RequestMapping(value = "user/{nome}", method = RequestMethod.GET)
	public List<User> getusersname(@PathVariable String nome) {
		
		List<User> lista = new ArrayList<>();
		
		User user = new User(nome, "bruno@teste.com.br");
		User user2 = new User(nome,"maria@teste.com.br");
		lista.add(user);
		lista.add(user2);
		
		return lista;
	}
	
	@RequestMapping(value= "user", method = RequestMethod.POST)
	
	public User postUser(@RequestBody User user) {
		return user;
	}
}
