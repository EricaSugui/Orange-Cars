package com.orange.database.entities;

import java.util.List;

public class ListaVeiculoResponse {
	
	private Usuario usuario;
	private List<Veiculo> veiculo;
	private String message;
	
	public ListaVeiculoResponse(Usuario usuario, List<Veiculo> veiculo, String message) {
		this.usuario = usuario;
		this.veiculo = veiculo;
		this.message = message;
	}
	public ListaVeiculoResponse() {

	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Veiculo> getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
