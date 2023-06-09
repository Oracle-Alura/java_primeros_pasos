package java_primeros_pasos;

public class EjemploConversiones {
	
	public static void main(String[] args) {		
		double variable1 = 230.89;
		int variableEntero = (int) variable1; //Cast
		
		System.out.println(variableEntero);
		
		long prueba = 122222222222222L; //Se especifica con L para asignar a una variable long
		
		int resultado = (int) variable1 + variableEntero; //Forzamos el resultado en int
		System.out.println(resultado);
		
	}
	
}
