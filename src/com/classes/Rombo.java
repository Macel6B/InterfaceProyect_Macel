package com.classes;

public class Rombo extends FigurasGeometricas implements Figurable {
	public int lado;
	public int diagMay;
	public int diagMen;
	
	//Constructor
	
	public Rombo(String nombre, int lado, int diagMay, int diagMen) {
		super(nombre);
		this.lado = lado;
		this.diagMay = diagMay;
		this.diagMen = diagMen;
	}//Constructor
	
	public double calcularArea() {
		return (getDiagMay()*getDiagMen())/2;
	}//calcularArea
	
	public double calcularPerimetro() {
		return (getLado()*4);
	}//calcularPerimetro
	
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getDiagMay() {
		return diagMay;
	}

	public void setDiagMay(int diagMay) {
		this.diagMay = diagMay;
	}

	public int getDiagMen() {
		return diagMen;
	}

	public void setDiagMen(int diagMen) {
		this.diagMen = diagMen;
	}
	
	//toString
	@Override
	public String toString() {
		return "Rombo [nombre=" + getNombre() + ", lado=" + lado + ", diagMay=" + diagMay + ", diagMen=" + diagMen + "]";
	}//toString	

}//classRombo

