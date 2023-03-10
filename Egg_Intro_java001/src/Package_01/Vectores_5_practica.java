package Package_01;

import java.util.Scanner;

public class Vectores_5_practica {

    public static void main(String args[]) {
        int suma=0;
        int[] Numeros_en_array = new int[5];
        Scanner read = new Scanner(System.in);

        for (int i=0; i < Numeros_en_array.length; i++){
            System.out.println("ingrese un valor para asignart en la posición: " + i);
            Numeros_en_array[i] = read.nextInt();
        }

        System.out.println("Array lleno!!");

        for (int i=0; i < Numeros_en_array.length; i++){
            suma += Numeros_en_array[i];
        }

        System.out.println("El resultado de sumar todos los valores del vector es de: " + suma);



        read.close();
        
    }
    
}
