package java_primeros_pasos;

public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hello world");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		if (cantidadPersonas > 1) {
			esPareja = true;				
		} else {
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar) { //Para comparar ==, para asignar valor =
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no está permitido a entrar");
		}
	}	

}
