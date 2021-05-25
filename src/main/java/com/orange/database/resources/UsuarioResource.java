package com.orange.database.resources;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.database.entities.Usuario;
import com.orange.database.entities.UsuarioResponse;
import com.orange.database.entities.dto.UsuarioDTO;
import com.orange.database.entities.mapper.UsuarioMapper;
import com.orange.database.repositories.UsuarioRepository;
import com.orange.database.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioMapper mapper;

//	@GetMapping
//	public ResponseEntity<List<Usuario>> getUsuario() {
//		
//		List<Usuario> lista = usuarioService.getUsuario();
//		return ResponseEntity.ok().body(lista);
//	}
	
	@GetMapping
	public ResponseEntity<Iterable<Usuario>> getUsuario() {
		
		var data = usuarioRepository.findAll();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
	@PostMapping(value = "/salva")
	public ResponseEntity<Usuario> saveUsuario(@RequestBody UsuarioDTO usuarioDto) throws URISyntaxException {
		
		Usuario novoUsuario = usuarioService.save(mapper.mapUsuarioDTOToUsuario(usuarioDto));
		return ResponseEntity.created(new URI("/usuario/salva" + novoUsuario.getId()))
				.body(novoUsuario);
	}
	
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<UsuarioResponse> updateUsuario(@RequestBody Usuario usuario, @PathVariable int id){
		boolean data = usuarioRepository.existsById(id);
		UsuarioResponse response = new UsuarioResponse();
		if(data) {
			usuario.setId(id);
			usuarioRepository.save(usuario);
			response.setUsuario(usuario);
			response.setMessage("Usuário alterado com sucesso!");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response.setMessage("Usuário id: "+id+" não encontrado.");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<UsuarioResponse> getUsuarioById(@PathVariable int id) {
		var usuario = usuarioRepository.findById(id);
		UsuarioResponse response = new UsuarioResponse();
		if(usuario.isPresent()) {
			response.setUsuario(usuario.get());
			response.setMessage("Usuário encontrado com sucesso!");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		response.setMessage("Usuário id: "+id+" não encontrado.");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
