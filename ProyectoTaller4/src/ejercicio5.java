import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        //Declaracion de datos
        double costocpu, costoteclado, costopantalla, costoraton, costototal;
        Scanner teclado = new Scanner(System.in);
        //Registro de datos
        System.out.println("Dame el costo del CPU ");
        costocpu = teclado.nextDouble();
        System.out.println("Dame el costo del teclado ");
        costoteclado = teclado.nextDouble();
        System.out.println("Dame el costo de la pantalla ");
        costopantalla = teclado.nextDouble();
        System.out.println("Dame el costo del raton ");
        costoraton = teclado.nextDouble();
        //Procesamiento de datos 
        costototal = costocpu + costoteclado + costopantalla + costoraton;
        System.out.println("costototal = " + costototal);
    }
}
