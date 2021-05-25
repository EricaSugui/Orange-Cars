package com.orange.database.entities.mapper;

import org.springframework.stereotype.Service;

import com.orange.database.entities.Usuario;
import com.orange.database.entities.dto.UsuarioDTO;

@Service
public class UsuarioMapper {
	
	public Usuario mapUsuarioDTOToUsuario(UsuarioDTO usuarioDto) {
		
		Usuario usuario = new Usuario(usuarioDto.getNome(), usuarioDto.getEmail(), usuarioDto.getCpf(), usuarioDto.getDataNascimento());
		return usuario;
	}

}
