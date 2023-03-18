package com.example.avaliacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Exame {
	
	
	
		@Id
		private Long id;
		
		private String nomeExame;
		private String descricao;
		//valor
		
		
		
		public String getNomeExame() {
			return nomeExame;
		}
		public void setNomeExame(String nomeExame) {
			this.nomeExame = nomeExame;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		
		
		
		
			

}
