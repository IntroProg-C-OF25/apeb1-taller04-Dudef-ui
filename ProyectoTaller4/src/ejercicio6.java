import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS
        Scanner teclado = new Scanner(System.in);
        double valorprestamo, tasainteres, pagomensual;
        System.out.println("Dame el valor del prestamo ");
        valorprestamo = teclado.nextDouble();
        System.out.println("Dame la tasa de interes ");
        tasainteres = teclado.nextDouble();
        //Procesamiento de datos 
        pagomensual = (valorprestamo * (1 + tasainteres))/12;
        System.out.println("pagomensual = " + pagomensual);
        
    }
}
