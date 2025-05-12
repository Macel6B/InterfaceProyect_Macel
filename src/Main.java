
import com.classes.*;

public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 5);
		Triangulo t2 = new Triangulo("Triángulo T", 14, 5, 555);
		Cuadrado c1 = new Cuadrado ("Cuadrado T", 7);
		Rectangulo rct1 = new Rectangulo ("Rectangulo 1", 14, 2);
		Rombo r1 = new Rombo ("Rombo 1", 8, 14, 21);
		Romboide rm1 = new Romboide ("Romboide 1", 84, 5);
		Trapecio tr1 = new Trapecio ("Trapecio 1", 5, 5, 555, 5, 5, 5, 5);
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t2);
		Main.imprimirCalculos(c1);
		Main.imprimirCalculos(rct1);
		Main.imprimirCalculos(r1);
		Main.imprimirCalculos(rm1);
		Main.imprimirCalculos(tr1);
		
	}//main
	
	//crear las clases de todas las figuras
	//crear interface FiguraGeometrica
	//implementar métodos para que pueda imprimir los cálculos de cada figura geométrica
	
	public static void imprimirCalculos( Figurable figura) {
		System.out.println();
		System.out.println("+------------------------------+");
		System.out.println("| El área de [" + figura.getNombre() + "]");
		System.out.println("| es " + figura.calcularArea());
		System.out.println("| El perímetro de [" + figura.getNombre() + "]");
		System.out.println("| es " + figura.calcularPerimetro());
		System.out.println("+------------------------------+");
		
	}//imprimirCalculos

}//class Main
