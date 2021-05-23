package com.orange.database.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	@NotNull(message = "Campo obrigatório, não pode ser nulo.")
	@NotBlank(message = "Campo obrigatório, não pode ser em branco.")
	private String nome;
	
	@Column(nullable = false)
	@NotNull(message = "Campo obrigatório, não pode ser nulo.")
	@NotBlank(message = "Campo obrigatório, não pode ser em branco.")
	private String cpf;
	
	@Column(name = "nascimento", nullable = false)
	@NotNull(message = "Campo obrigatório, não pode ser nulo.")
	@NotBlank(message = "Campo obrigatório, não pode ser em branco.")
	private String dataNascimento;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(
			String nome,
			String cpf,
			String dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento (String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
