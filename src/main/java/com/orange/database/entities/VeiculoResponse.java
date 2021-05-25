package com.orange.database.entities;

public class VeiculoResponse {
	
	private Veiculo veiculo;
	private String message;
	
	public VeiculoResponse(Veiculo veiculo, String message) {
		this.veiculo = veiculo;
		this.message = message;
	}
	
	public VeiculoResponse() {
	
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
