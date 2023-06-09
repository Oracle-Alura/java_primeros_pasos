package java_primeros_pasos;

public class EjemploCaracteres {
	public static void main(String[] args) { // Shortcut: main + ctrl+space
		
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65; // El 65 representa la letra A en código ASCII
		System.out.println(caracter);
		
		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter + 1); //No compila. caracter es tipo char y 1 es tipo entero, por eso no puede convertir de int a char.
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online"; //String es un objeto, no un tipo de variable.
		System.out.println(palabra);
		
		palabra = palabra + "2023"; //Crea un nuevo objeto
		System.out.println(palabra);
		
	}

}
