package com.orange.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.database.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
