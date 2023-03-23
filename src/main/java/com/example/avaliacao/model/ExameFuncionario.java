package com.example.avaliacao.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="exames_funcionarios")
public class ExameFuncionario {

	@Id
	@DateTimeFormat(style="yyyy-MM-dd")
	private LocalDate dataRealizacaoExames;

	

}
