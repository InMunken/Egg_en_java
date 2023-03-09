package Package_01;

import java.util.Scanner;

public class Pruebas_Egg_02 {

    public static void main (String args[]){

        Scanner leer = new Scanner(System.in);
            String nombre;

            System.out.println("ingresa tu nombre:");
            nombre = leer.next();

            System.out.println("Tu nombre es: " + nombre);
        

        leer.close();

    }

}


