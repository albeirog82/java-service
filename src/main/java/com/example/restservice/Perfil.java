package com.example.restservice;

import java.time.LocalDate;

public class Perfil {
	
	private String nombreCompania;
	private LocalDate fechaCreacion;

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	} 
	
	

}
