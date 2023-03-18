package com.example.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.avaliacao.model.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame,Integer> {
	

}
