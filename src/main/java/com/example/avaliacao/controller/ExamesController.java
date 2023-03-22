package com.example.avaliacao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String novo(@Validated RequisocaoNovoExame requisicaoNovoExame, BindingResult result) {	
		if(result.hasErrors()) {
			return "/exameformulario";
		}
		Exame exame  = requisicaoNovoExame.toExame();
		exameRepository.save(exame);
		
		return "teste";
	}
	
	
	@GetMapping ("/{id}")
    public String alterarPessoa(@PathVariable("id") int codigo, Model model){
		Optional<Exame> exameOpt = exameRepository.findById(codigo);
		if(exameOpt.isEmpty()) {
			throw new IllegalArgumentException("Exame Invalido.");		
		}	
		model.addAttribute("exame",exameOpt.get());
		return "formteste";
		
    }
	
	@PostMapping("/salvar")
	public String salvarExame(@ModelAttribute("exame") Exame exame) {
		exameRepository.save(exame);
		return "teste";
	}
	 
	

	
	@GetMapping("/excluir/{id}")
	public String excluirExame(@PathVariable("id") int codigo) {
		Optional<Exame> exameOpt = exameRepository.findById(codigo);
		if(exameOpt.isEmpty()) {
			throw new IllegalArgumentException("Exame Invalido.");
		}
		exameRepository.delete(exameOpt.get());  //?
		return "teste2";
		
		
	}
}
