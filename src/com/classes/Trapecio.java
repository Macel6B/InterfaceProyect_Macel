package com.classes;

public class Trapecio extends FigurasGeometricas implements Figurable{
	public int lado;
	public int lado2;
	public int lado3;
	public int lado4;
	public int base;
	public int baseMayor;
	public int altura;

	//Constructor
	public Trapecio(String nombre, int lado, int lado2, int lado3, int lado4, int base, int baseMayor, int altura) {
		super(nombre);
		this.lado = lado;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.base = base;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}//Constructor
	
	public double calcularArea() {
		return ((getAltura()*(getBaseMayor()+ getBase()))/2);
	}//calcularArea
	
	public double calcularPerimetro() {
		return ((getLado()+ getLado2() + getLado3() + getLado4()));
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

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public int getLado4() {
		return lado4;
	}

	public void setLado4(int lado4) {
		this.lado4 = lado4;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(int baseMayor) {
		this.baseMayor = baseMayor;
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
		return "Trapecio [nombre=" + getNombre() + ", lado=" + lado + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", base=" + base + ", baseMayor=" + baseMayor + ", altura=" + altura + "]";
	}//toString	
}//classTrapecio

