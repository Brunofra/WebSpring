package com.br.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelController {

	@GetMapping("/model")
	public String model (Model model) {
		
		return "user";
	}
}
