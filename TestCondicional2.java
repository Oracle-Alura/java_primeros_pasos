package java_primeros_pasos;

public class TestCondicional2 {

    public static void main(String[] args) {
        System.out.println("probando condicionales ");

        int edad = 16;
        int cantidadPersonas = 3;
        boolean acompañado = cantidadPersonas >= 2;

        if (edad >=18 && acompañado) {
            System.out.println("Bienvenido"); 
        } else {
            System.out.println("Lamentablemente no puedes ingresar");
        }
    }

}