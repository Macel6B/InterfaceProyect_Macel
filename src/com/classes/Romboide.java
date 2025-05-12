package com.classes;

public class Romboide extends FigurasGeometricas implements Figurable {
	public int base;
	public int altura;
	
	//Constructor
	public Romboide(String nombre, int base, int altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}//Constructor
	
	public double calcularArea() {
		return (getBase()*getAltura());
	}//calcularArea
	
	public double calcularPerimetro() {
		return ((getBase()*2)+(getAltura()*2));
	}//calcularPerimetro
	
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	//toString
	@Override
	public String toString() {
		return "Rombide [nombre=" + getNombre() + ", base=" + base + ", altura=" + altura + "]";
	}//toString
	
}//classRombide

