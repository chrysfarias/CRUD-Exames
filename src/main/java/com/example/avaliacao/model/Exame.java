package com.example.avaliacao.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="exames")
public class Exame {
		
		@Id
		private Integer codigo;		
		private String nomeExame;
		private String descricao;
	
		
		@ManyToMany
		@JoinTable(name="exames_funcionarios",
			joinColumns = @JoinColumn(name="exame_fk"),
			inverseJoinColumns = @JoinColumn(name="funcionario_fk")
		
		)
		
		Set <Funcionario> funcionario;
				
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
		public Integer getCodigo() {
			return codigo;
		}
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		
		
		
		
		
			

}
