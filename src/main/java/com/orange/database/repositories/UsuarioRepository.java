package com.orange.database.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.orange.database.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	@Query("select c from Usuario c where c.cpf like ?1")
	Optional<Usuario> findUsuarioByCpf(String cpf);
	
	@Query("select c from Usuario c where c.email like ?1")
	Optional<Usuario> findUsuarioByEmail(String email);
}
