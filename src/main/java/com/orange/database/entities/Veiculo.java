package com.orange.database.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String marca;
	
	@Column(nullable = false)
	private String modelo;
	
	@Column(nullable = false)
	private Integer ano;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable=false)
	private Usuario usuario;
	
	public Veiculo() {
	
	}

	public Veiculo(String marca, String modelo, Integer ano, Usuario usuario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

//	public Usuario getUsuario() {
//		return usuario;
//	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
