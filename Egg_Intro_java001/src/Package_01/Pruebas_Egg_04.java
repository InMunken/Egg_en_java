package Package_01;

import java.util.Scanner;

public class Pruebas_Egg_04 {

    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        float Fahrenheit;
        float celsius;
        System.out.println("ingrese la cantidad de grados centígrados actuales: ");
        celsius = read.nextInt();
        Fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius +"° grados celcius equivalen a: " + Fahrenheit + "° grados inventados." );



        read.close();
    }
    
}
