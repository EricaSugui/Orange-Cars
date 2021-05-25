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
		Usuario usuario1 =  new Usuario("Erica Suguimoto", "ericasugui@gmail.com","03572135990", "25/09/1977");
		usuarioRepository.save(usuario1);
		Usuario usuario2 =  new Usuario("Marcelo Daikawa", "marcelo@gmail.com","00000000000", "14/02/1972");
		usuarioRepository.save(usuario2);
		Usuario usuario3 =  new Usuario("Ju Daikawa", "ju@gmail.com","11111111111", "23/01/1997");
		usuarioRepository.save(usuario3);
		
		Veiculo veiculo1 = new Veiculo("Honda", "Fit", 2008, usuario1);
		veiculoRepository.save(veiculo1);
		Veiculo veiculo2 = new Veiculo("Honda", "HR-V", 2016, usuario1);
		veiculoRepository.save(veiculo2);
		Veiculo veiculo3 = new Veiculo("Toyota", "SR-V Hilux", 2018, usuario2);
		veiculoRepository.save(veiculo3);
		Veiculo veiculo4 = new Veiculo("Ford", "Focus", 2017, usuario3);
		veiculoRepository.save(veiculo4);
		Veiculo veiculo5 = new Veiculo("Jaguar", "Luxo Lindão", 2021, usuario1);
		veiculoRepository.save(veiculo5);
		Veiculo veiculo6 = new Veiculo("Lincoln", "Luxo Bonitão", 2021, usuario2);
		veiculoRepository.save(veiculo6);
		
//		Veiculo veiculo1 = new Veiculo("Honda", "Fit", 2008, usuario1.getId());
//		veiculoRepository.save(veiculo1);
//		Veiculo veiculo2 = new Veiculo("Honda", "HR-V", 2016, usuario1.getId());
//		veiculoRepository.save(veiculo2);
//		Veiculo veiculo3 = new Veiculo("Toyota", "SR-V Hilux", 2018, usuario2.getId());
//		veiculoRepository.save(veiculo3);
//		Veiculo veiculo4 = new Veiculo("Ford", "Focus", 2017, usuario3.getId());
//		veiculoRepository.save(veiculo4);
//		Veiculo veiculo5 = new Veiculo("Jaguar", "Luxo Lindão", 2021, usuario1.getId());
//		veiculoRepository.save(veiculo5);
//		Veiculo veiculo6 = new Veiculo("Lincoln", "Luxo Bonitão", 2021, usuario2.getId());
//		veiculoRepository.save(veiculo6);
	}
}
