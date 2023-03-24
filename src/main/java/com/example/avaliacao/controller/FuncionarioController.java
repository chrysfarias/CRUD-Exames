package com.example.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.avaliacao.model.Funcionario;
import com.example.avaliacao.repository.FuncionarioRepository;


@Controller
@RequestMapping("/funcionario")

public class FuncionarioController {
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	@GetMapping("/home")
	public String funcao(Model model) {
		List <Funcionario> funcionarios = funcionarioRepository.findAll();
		model.addAttribute("funcionarios", funcionarios);
		return "funcionariosprincipal";
		
	}
	
	
}
