package com.orange.database.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	@NotNull(message = "Campo obrigatório, não pode ser nulo.")
	@NotBlank(message = "Campo obrigatório, não pode ser em branco.")
	private String nome;
	
	@Email(message = "email inválido")
	@Column(nullable = false, unique = true)
	@NotBlank(message = "Campo obrigatório, não pode ser em branco.")
	private String email;
	
//	@CPF(message = "CPF inválido")
	@Column(nullable = false, unique = true)
	@NotBlank(message = "Campo obrigatório, não pode ser em branco.")
	private String cpf;
	
	@Column(name = "nascimento", nullable = false)
	@NotNull(message = "Campo obrigatório, não pode ser nulo.")
	@NotBlank(message = "Campo obrigatório, não pode ser em branco.")
	private String dataNascimento;
	
	@OneToMany(mappedBy = "usuario", targetEntity= Veiculo.class, fetch=FetchType.LAZY, cascade = CascadeType.ALL)
//	@OneToMany(mappedBy = "usuario", fetch=FetchType.LAZY)
	private List<Veiculo> veiculos = new ArrayList<>();
//	private List<Veiculo> veiculos;
	
	public Usuario() {
	}

	public Usuario(
			String nome,
			String email,
			String cpf,
			String dataNascimento) {
		super();
		this.nome = nome;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
}
