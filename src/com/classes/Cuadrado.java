package com.classes;

public class Cuadrado extends FigurasGeometricas implements Figurable{
	private double lado;
	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return (getLado()*getLado());
	}//calcularArea
	
	public double calcularPerimetro() {
		return ((getLado()*4));
	}//calcularPerimetro
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + getNombre() + ", lado=" + lado + "]";
	}//toString
}//class Cuadrado
