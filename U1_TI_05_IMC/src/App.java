import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

        Persona persona = new Persona();

        System.out.print("Ingrese su nombre: ");
        persona.setNombre(sc.nextLine());

        System.out.print("Ingrese su altura en metros: ");
        persona.setAltura(sc.nextDouble());

        System.out.print("Ingrese su peso en kilogramos: ");
        persona.setPeso(sc.nextDouble());

        double imc = persona.calcularIMC();
        String clasificacion = persona.clasificarIMC();

        System.out.println("Hola " + persona.getNombre());
        System.out.printf("Tu IMC es: %.2f%n", imc);
        System.out.println("Tu peso es: " + persona.getPeso() + " kg");
        System.out.println("Tu altura es: " + persona.getAltura() + " m");
        System.out.println("Clasificación: " + clasificacion);  

        
        sc.close();

    }
}
