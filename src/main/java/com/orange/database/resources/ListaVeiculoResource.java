package com.orange.database.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orange.database.entities.ListaVeiculoResponse;
import com.orange.database.entities.Veiculo;
import com.orange.database.repositories.VeiculoRepository;
import com.orange.database.services.VeiculoService;

@RestController
@RequestMapping("/veiculos-por-usuario")
public class ListaVeiculoResource {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping
	public ResponseEntity<Iterable<Veiculo>> getVeiculo() {
		
		var data = veiculoRepository.findAll();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@GetMapping("/usuario")
	public ResponseEntity<List<Veiculo>> findVeiculoByUsuarioId(@RequestParam Integer id){
		System.out.println("Usuario id: " + id);
		List<Veiculo> veiculos = veiculoService.findVeiculoByUsuarioId(id);
		return ResponseEntity.ok().body(veiculos);
	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<ListaVeiculoResponse>getUsuarioById(@PathVariable Integer id) {
//		ListaVeiculoResponse response = new ListaVeiculoResponse();
//		var usuario = veiculoRepository.findVeiculoByUsuarioId(id);
//		if(usuario.isPresent()) {
//			response.getUsuario();
//			response.getVeiculo();
//			response.setMessage("Usuário encontrado com sucesso!");
//			return new ResponseEntity<>(response, HttpStatus.OK);
//		}
//		response.setMessage("Usuário id: "+id+" não encontrado.");
//		return new ResponseEntity<>(response, HttpStatus.OK);
//	}

}
