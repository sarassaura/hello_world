package com.generation.helloworld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public ArrayList<String> bsm() {
		ArrayList<String> array = new ArrayList<String>();
		array.add("Orientação ao Futuro");
		array.add("Responsabilidade Pessoal");
		array.add("Mentalidade de Crescimento");
		array.add("Persistência");
		array.add("Trabalho em Equipe");
		array.add("Atenção aos Detalhes");
		array.add("Proatividade");
		array.add("Comunicação");
		
		return array;
	}
	
	@GetMapping("/objectives")
	public ArrayList<String> objectives() {
		ArrayList<String> array = new ArrayList<String>();
		array.add("Aprender sobre AWS");
		array.add("Aprender sobre Angular");
		array.add("Treinar para Entrevistas");
		array.add("Fazer meu Pitch");
		array.add("Atualizar meu Linkedin");
		array.add("Terminar Meus Projetos");
		
		return array;
	}
}
