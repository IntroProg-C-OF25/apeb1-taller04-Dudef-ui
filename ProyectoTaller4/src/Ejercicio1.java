import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        double base, altura, Area ;
        Scanner teclado = new Scanner(System.in);
        //Ingreso de datos de entrada
        System.out.println("Dame la base: ");// carpinteria de salida 
        base = teclado.nextDouble();
        System.out.println("Dame la altura ");
        altura = teclado.nextDouble();
        //Procesamiento de datos de entrada
        Area = (base * altura)/2;
        System.out.println("Area = " + Area);
    }
}