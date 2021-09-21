package com.desafiom2y.questao2e3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "DesafioM2y")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=3,max=100)
	private String nome;
	
	@NotNull
	private int idade;
	
	@NotNull
	@Size(min=3,max=100)
	private String profissao;
	
	@NotNull
	@Size(min=3,max=100)
	private String nomeEvento;
	
	@Size(min=3,max=100)
	private String premio1;
	
	@Size(min=3,max=100)
	private String premio2;
	
	@Size(min=3,max=100)
	private String premio3;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getPremio1() {
		return premio1;
	}

	public void setPremio1(String premio1) {
		this.premio1 = premio1;
	}

	public String getPremio2() {
		return premio2;
	}

	public void setPremio2(String premio2) {
		this.premio2 = premio2;
	}

	public String getPremio3() {
		return premio3;
	}

	public void setPremio3(String premio3) {
		this.premio3 = premio3;
	}

	

}
