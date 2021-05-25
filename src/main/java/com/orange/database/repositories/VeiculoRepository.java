package com.orange.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.database.entities.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{

//	@Query("select c from Veiculo c where c.usuario like ?1")
//	Optional<Veiculo> findVeiculoByUsuarioId(Integer usuario);
	
	List<Veiculo> findVeiculoByUsuarioId(Integer id);
}
