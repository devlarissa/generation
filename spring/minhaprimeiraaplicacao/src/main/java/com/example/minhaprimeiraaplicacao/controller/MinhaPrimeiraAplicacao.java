package com.example.minhaprimeiraaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aplicacao1")
public class MinhaPrimeiraAplicacao {

	@GetMapping
	public String helloShow() {
		return "Hello Familia 38 <br/> Bem vindos ao spring";
	}
}
