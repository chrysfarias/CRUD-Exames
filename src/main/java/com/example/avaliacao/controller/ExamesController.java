package com.example.avaliacao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.avaliacao.dto.RequisocaoNovoExame;
import com.example.avaliacao.model.Exame;
import com.example.avaliacao.repository.ExameRepository;

@Controller
@RequestMapping("/exame")
public class ExamesController {
	
	@Autowired
	private ExameRepository exameRepository;
	
	
	@GetMapping("/home")
	public String pagina(Model model) {
		List <Exame> exames = exameRepository.findAll();
		model.addAttribute("exames",exames);
		return "examesprincipal";
		
	}
	
	
	@GetMapping("/formulario")
	public String pagina2() {		
		return "exameformulario";
	}

	@PostMapping("/novo")
	public String novo(RequisocaoNovoExame requisicaoNovoExame) {	
		
		Exame exame  = requisicaoNovoExame.toExame();
		exameRepository.save(exame);
		
		return "teste";
	}
	
	@GetMapping("/{id}")
	
	public String teste() {
	//public String alterarExame(@PathVariable("id") int id) {
		return "teste2";
	}
	
	
	
	
	
}
