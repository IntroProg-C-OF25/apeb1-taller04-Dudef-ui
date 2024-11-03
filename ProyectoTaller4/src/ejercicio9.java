import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
       //DECLARACION DE DATOS DE ENTRADA
       double ladocuadrado, alturatri, areac, areat, arear, areatotal;
       Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la medida de uno de los lados del cuadrado ");
        ladocuadrado = teclado.nextDouble();
        System.out.println("Dame la altura del triangulo ");
        alturatri = teclado.nextDouble();
        //Procesamiento de datos 
        areac = ladocuadrado * ladocuadrado;
        areat = (ladocuadrado * alturatri)/2;
        arear = ladocuadrado * alturatri;
        areatotal = areac + (3 * areat) + arear;
        System.out.println("areatotal = " + areatotal);
    
    }
}
