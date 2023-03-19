package com.example.avaliacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Exame {
	
	
	
		@Id
		private int codigo;
		
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
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
		
		
		
		
			

}
