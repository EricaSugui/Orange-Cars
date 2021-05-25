package com.orange.database.entities.dto;

import com.orange.database.entities.Usuario;

public class UsuarioDTOResponse {

	private UsuarioDTO usuario;
	private String message;
	
	public UsuarioDTOResponse(UsuarioDTO usuario, String message) {
		this.usuario = usuario;
		this.message = message;
	}
	 public UsuarioDTOResponse() {
	}
	 
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
