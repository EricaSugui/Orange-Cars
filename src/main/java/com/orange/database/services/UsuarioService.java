package com.orange.database.services;

import java.util.List;

import com.orange.database.entities.Usuario;

public interface UsuarioService {

	public List<Usuario> getUsuario();
	
	public Usuario save(Usuario usuario);
}
