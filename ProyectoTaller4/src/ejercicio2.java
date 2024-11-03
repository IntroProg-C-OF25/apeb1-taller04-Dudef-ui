import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        double gasto_1er_hijo, gasto_2do_hijo, gasto_3er_hijo, gastototal;
        Scanner teclado = new Scanner(System.in);
        //Registro de datos 
        System.out.println("Dame los gastos totales del primer hijo ");
        gasto_1er_hijo = teclado.nextDouble();
        System.out.println("Dame los gastos totales del segundo hijo ");
        gasto_2do_hijo = teclado.nextDouble();
        System.out.println("Dame los gastos totales del tercer hijo ");
        gasto_3er_hijo = teclado.nextDouble();
        gastototal = gasto_1er_hijo + gasto_2do_hijo + gasto_3er_hijo; 
        System.out.println("gastototal = " + gastototal);
    }
}
