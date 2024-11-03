package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;

public interface EstudianteServicio {
	
	public  List<Estudiante> ListarTodosLosEstudiantes();
		
	public Estudiante guardarEstudiante(Estudiante estudiante);

	public Estudiante obtenerEstudianteId(Long id);


	public Estudiante actualizarEstudiante(Estudiante estudiante);

	public void eliminarEstudiante(Long id);
}
