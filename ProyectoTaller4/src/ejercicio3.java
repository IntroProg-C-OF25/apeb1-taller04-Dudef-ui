import java.util.Scanner; 
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro del numero
        
        int numero;
        System.out.println("Ingrese un número entre 2 y 6: ");
        numero = scanner.nextInt(); 

        // activacion del condicional con un rango
        
        if (numero >= 2 && numero <= 6) {
           
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 12; i++) {
                System.out.printf("%d x %d = %d%n", numero, i, numero * i);// f da a entender que es un formato.
            } //%d toma el valor de los numeros del usuario (es una variable) y %n es el salto de linea similar al ln
            
        } else {
            
            System.out.println("El número ingresado no está entre 2 y 6. Intente nuevamente.");
        }
    }
}
