package com.orange.database.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orange.database.entities.Veiculo;
import com.orange.database.repositories.VeiculoRepository;
import com.orange.database.services.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Override
	public List<Veiculo> getVeiculo() {

		return veiculoRepository.findAll();
	}

	@Override
	public Veiculo save(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}

	@Override
	public List<Veiculo> findVeiculoByUsuarioId(Integer id) {

		return veiculoRepository.findVeiculoByUsuarioId(id);
	}

}
