package com.orange.database.services;

import java.util.List;

import com.orange.database.entities.Veiculo;

public interface VeiculoService {
	
	public List<Veiculo> getVeiculo();
	
	public Veiculo save(Veiculo veiculo);
	
	public List<Veiculo> findVeiculoByUsuarioId(Integer id);

}
