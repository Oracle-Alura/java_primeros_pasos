package java_primeros_pasos;

public class EjemploValoresVariables {
	
	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println(numero2);
		
		numero2 = numero1;
		System.out.println(numero2);
		
		numero1 = 88;
		System.out.println(numero2); //Imprime 5 porque las variables guardan valores y no a lo que apunta. Por lo cual, si altero numero1, numero2 va a serguir teniendo el mismo valor.
	}

}
