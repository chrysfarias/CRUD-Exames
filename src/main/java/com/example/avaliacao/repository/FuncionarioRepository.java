package com.example.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.avaliacao.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {

}
