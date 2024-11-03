import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS
        Scanner teclado = new Scanner(System.in);
        double valorkph, numerodek, valortotal;
        int edad;
        System.out.println("Dime el valor de los kilovatios por hora ");
        valorkph = teclado.nextDouble();
        System.out.println("Dime el numero de kilovatios por mes ");
        numerodek = teclado.nextDouble();
        System.out.println("Dime la edad ");
        edad = teclado.nextInt();
        //PROCESAMIENTO DE DATOS
        valortotal = valorkph * numerodek;
        if(edad>65){
            valortotal = valortotal * 0.90;
        }
        System.out.println("valortotal = " + valortotal);
    }
    
}
