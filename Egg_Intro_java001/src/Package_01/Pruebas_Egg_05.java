package Package_01;

import java.util.Scanner;

public class Pruebas_Egg_05 {

    public static void main(String args[]) {
        double Num_Ingresado;
        double Num_1, Num_2, Num_3;

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un número y se determinarán su doble, triple y la raíz cuadrada de ese número");
        Num_Ingresado =  read.nextDouble();

        Num_1 =  Num_Ingresado * 2;
        Num_2 =  Num_Ingresado * 3;
        Num_3 =  Math.sqrt(Num_Ingresado);

        System.out.println("El doble de tu número ingresado es: " + Num_1 + " el triple de un número ingresado es: " + Num_2+ " la raíz cuadrada de tu número ingresado es: " + Num_3);

        

        read.close();

        
    }
    
}
