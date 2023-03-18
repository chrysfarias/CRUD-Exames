package com.example.avaliacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.avaliacao.model.Exame;
import com.example.avaliacao.repository.ExameRepository;

@Controller
@RequestMapping("/exame")
public class ExamesController {
	
	//@Autowired
	//private ExameRepository exameRepository;
	
	
	@GetMapping("/home")
	public String pagina() {		
		return "examesprincipal";
	}
	

	@GetMapping("/novo")
	public String novo() {	
		
		//Exame exame1 = new Exame();
		//exame1.setCodigo(45892);
		//exame1.setDescricao("Primeiro Exame");
		//exame1.setNomeExame("Diabets");
		
		//exameRepository.save(exame1);
		
		return "exameformulario";
	}
	
	
}
