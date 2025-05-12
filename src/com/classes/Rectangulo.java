package com.classes;

public class Rectangulo extends FigurasGeometricas implements Figurable{
	private double base;
	private double altura;
	public Rectangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}//constructor
	
	public double calcularArea() {
		return (getBase()*getAltura());
	}//calcularArea
	
	public double calcularPerimetro() {
		return ((getBase()*2)+(getAltura()*2));
	}//calcularPerimetro
	
//	public String getNombre() {
//		return nombre;
//	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Rectangulo [nombre=" + getNombre() + ", base=" + base + ", altura=" + altura + "]";
	}//toString
}//class Rectangulo
