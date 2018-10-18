package com.fatec.sce.model;

public class Usuario {
	private String ra;
	private String nome;

	public String getRa() {
		
		return ra;
	}

	public void setRa(String ra) {
		if(ra==""|ra==null) {
			throw new RuntimeException("RA invalido");
		}
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome ==""|nome ==null) {
			throw new RuntimeException("Nome invalido");
		}
		this.nome = nome;
	}


}