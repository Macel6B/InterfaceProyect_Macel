import com.classes.Triangulo;

public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 5);
		Triangulo t2 = new Triangulo("Triángulo T", 14, 5, 555);
		System.out.println(t1);
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t2);
	}//main
	
	//crear las clases de todas las figuras
	//crear interface FiguraGeometrica
	//implementar métodos para que pueda imprimir los cálculos de cada figura geométrica
	
	public static void imprimirCalculos( //FiguraGeometrica(Intefaz) t) {
		System.out.println(t);
		System.out.println("+------------------------------+");
		System.out.println("| El área de [" + t.getNombre() + "]");
		System.out.println("| es " + t.calcularArea());
		System.out.println("| El perímetro de [" + t.getNombre() + "]");
		System.out.println("| es " + t.calcularPerimetro());
		System.out.println("+------------------------------+");
		
	}//imprimirCalculos

}//class Main
