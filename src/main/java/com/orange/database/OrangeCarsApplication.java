package com.orange.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.orange.database.entities.Usuario;
import com.orange.database.entities.Veiculo;
import com.orange.database.repositories.UsuarioRepository;
import com.orange.database.repositories.VeiculoRepository;

@SpringBootApplication
public class OrangeCarsApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrangeCarsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Usuario usuario1 =  new Usuario("Erica Suguimoto", "03572135990", "25/09/1977");
		usuarioRepository.save(usuario1);
		
		Veiculo veiculo1 = new Veiculo("Honda", "Fit", 2008, usuario1);
		veiculoRepository.save(veiculo1);
	}
}
