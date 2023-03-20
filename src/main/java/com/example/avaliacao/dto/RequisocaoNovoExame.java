package com.example.avaliacao.dto;

import com.example.avaliacao.model.Exame;

public class RequisocaoNovoExame {

	private String nomeExame;
	private int codigoExame;
	private String descricao;
	
	
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public int getCodigoExame() {
		return codigoExame;
	}
	public void setCodigoExame(int codigoExame) {
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



