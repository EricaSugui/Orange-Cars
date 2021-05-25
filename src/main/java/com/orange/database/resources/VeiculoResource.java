package com.orange.database.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orange.database.entities.Veiculo;
import com.orange.database.entities.VeiculoResponse;
import com.orange.database.repositories.VeiculoRepository;
import com.orange.database.services.VeiculoService;

@RestController
@RequestMapping("/veiculo")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> getVeiculo() {
		
		List<Veiculo> lista = veiculoService.getVeiculo();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<VeiculoResponse> getVeiculoById(@PathVariable int id) {
		var veiculo = veiculoRepository.findById(id);
		VeiculoResponse response = new VeiculoResponse();
		if(veiculo.isPresent()) {
			response.setVeiculo(veiculo.get());
			response.setMessage("Veículo encontrado com sucesso!");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		response.setMessage("Veículo id: "+id+" não encontrado.");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/usuario")
	public ResponseEntity<List<Veiculo>> findVeiculoByUsuarioId(@RequestParam Integer id){
		System.out.println("Usuario id: " + id);
		List<Veiculo> veiculos = veiculoService.findVeiculoByUsuarioId(id);
		return ResponseEntity.ok().body(veiculos);
	}
	
	@PostMapping(value = "/salva")
	public ResponseEntity<Veiculo> saveVeiculo(@RequestBody Veiculo veiculo) throws URISyntaxException {
		
		Veiculo novoVeiculo = veiculoService.save(veiculo);
		return ResponseEntity.created(new URI("/veiculo/salva" + novoVeiculo.getId()))
				.body(novoVeiculo);
	}

}
