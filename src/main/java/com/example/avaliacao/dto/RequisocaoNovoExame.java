package com.example.avaliacao.dto;



import com.example.avaliacao.model.Exame;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public class RequisocaoNovoExame {

	@NotEmpty
	private String nomeExame;
	@NotNull
	private Integer codigoExame;
	private String descricao;
	
	
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public Integer getCodigoExame() {
		return codigoExame;
	}
	public void setCodigoExame(Integer codigoExame) {
		this.codigoExame = codigoExame;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	public Exame toExame(){
		Exame exame = new Exame();
		exame.setCodigo(codigoExame);
		exame.setNomeExame(nomeExame);
		exame.setDescricao(descricao);
		return exame;
	}
		
	
	
	
	
}



