package com.classes;

public abstract class FigurasGeometricas {
	public String nombre;

	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}//Constructor

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + "]";
	}
	
}//FigurasGeometricas
