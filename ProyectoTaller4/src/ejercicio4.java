import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS DE ENTRADA
        double costoMinutos, cantidadMinutos, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame costo por minuto ");
        costoMinutos = teclado.nextDouble();
        System.out.println("Dame la cantidad de minutos");
        cantidadMinutos = teclado.nextDouble();
        //proceso de datos
        valorPlanilla = costoMinutos * cantidadMinutos;
        System.out.println("valorPlanilla = " + valorPlanilla );
        
    }
}
