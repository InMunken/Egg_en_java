package Package_01;

import java.util.Scanner;

public class Matrices_x_practica {
    
    public static void main(String args[]) {
        int suma=0;

        Scanner read = new Scanner(System.in);
        int[][] matriz_de_prueba = new int[3][3];

        
        for (int i=0; i<matriz_de_prueba.length; i++){
            for (int j=0; j<matriz_de_prueba.length; j++){

                System.out.println("ingrese el valor entero que estará en la fila: "+i+" y en la columna: "+j+": ");

                matriz_de_prueba[i][j] = read.nextInt();

            }
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){

               suma += matriz_de_prueba[i][j];

            }
            
        }

        System.out.println("El resultado de sumar todos los valores de la matriz es de : "+ suma);

        


        read.close();

        
    }
}
