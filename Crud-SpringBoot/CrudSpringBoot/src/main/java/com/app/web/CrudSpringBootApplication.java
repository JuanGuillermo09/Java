package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	
	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiantes estudiante1 = new Estudiantes( "Juan", "Cardenas", "juangui.1032@gmail.com");
		repositorio.save(estudiante1);
		
		Estudiantes estudiante2 = new Estudiantes( "Pedro", "Molina", "juan20@gmail.com");
		repositorio.save(estudiante2);
		
		*/
	}

}
