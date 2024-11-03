import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS 
        Scanner teclado = new Scanner(System.in);
        double netflix, youtube, premium, dropbox, spotify, valortotal;
        int edad;
        System.out.println("Dime el valor mensual de Netflix ");
        netflix = teclado.nextDouble();
        
        System.out.println("Dime el valor mensual de Youtube ");
        youtube = teclado.nextDouble();
        
        System.out.println("Dime el valor mensual de Premium ");
        premium  = teclado.nextDouble();
        
        System.out.println("Dime el valor mensual de Dropbox ");
        dropbox = teclado.nextDouble();
        
        System.out.println("Dime el valor mensual de Spotify ");
        spotify = teclado.nextDouble();
        
        System.out.println("Dime tu edad");
        edad = teclado.nextInt();
        //procesamiento de datos
        valortotal = netflix + youtube + premium + dropbox + spotify;
        if (edad<30){
        valortotal = valortotal * 0.80;
    }
        System.out.println("valortotal= " + valortotal);
    }
}

