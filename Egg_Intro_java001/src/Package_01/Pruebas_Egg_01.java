package Package_01;

import java.util.Scanner;


public class Pruebas_Egg_01 {

 public static void main (String args[]){

    Scanner cualquiernombre = new Scanner(System.in);
       
        int Num_1;
        int Num_2;

        System.out.println("Ingrese numero 1");
        Num_1 = cualquiernombre.nextInt();
        System.out.println("Ingrese numero 2");
        Num_2 = cualquiernombre.nextInt();


        System.out.println("El resultado es: " + (Num_1 + Num_2));
        
        cualquiernombre.close();
   


}

}

