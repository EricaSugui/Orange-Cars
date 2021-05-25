package com.orange.database.entities;

public class UsuarioResponse {

	private Usuario usuario;
    private String message;

    public UsuarioResponse(Usuario usuario, String message) {
        this.usuario = usuario;
        this.message = message;
    }

    public UsuarioResponse() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
