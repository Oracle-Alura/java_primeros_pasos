package java_primeros_pasos;

public class TestCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;  // Compila!
        System.out.println(valor);
        
        valor = (char) (valor + 1);         // Poniento (char) compila!
        System.out.println(valor);
        
        String palabra = "Alura cursos online de tecnología ";
        System.out.println(palabra);
        
        palabra = palabra + 2020; //Java convierte automáticamente el número a String
        System.out.println(palabra);                
	}

}
