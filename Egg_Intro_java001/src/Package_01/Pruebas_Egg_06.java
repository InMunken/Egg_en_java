package Package_01;

import java.util.Scanner;

public class Pruebas_Egg_06 {

    public static void main(String args[]) {
        int Num_1, Num_2, Num_Resultado = 0, menu;

        Scanner leer =  new Scanner(System.in);

       
        

        do {

        System.out.println("Bienvenido a la calculadora, ingrese dos números para operar"); 
        Num_1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero a operar:");
        Num_2 = leer.nextInt();
     

        System.out.println("Que operación quieres realizar?: 1(Suma) 2(Resta) 3(multiplicación) 4(división) 5(potencia) 6(salir)");

        menu = leer.nextInt();

        switch (menu){
            case 1:

                Num_Resultado = Num_1 + Num_2;

                break;

            case 2:
                Num_Resultado = Num_1 - Num_2;

                break;

            case 3:
             Num_Resultado = Num_1 * Num_2;

                break;

            case 4:

            Num_Resultado = Num_1 / Num_2;
                break;
            case 5:

            Num_Resultado = Num_1 ^ Num_2;

                break;

            case 6:

            System.out.println("Ha elegiso salir de la calculadora.");
    
                break;
            default:

            System.out.println("No es ninguna de las opciones, vuelva a intentar.");


        }

        } while(menu!=6);

        if (menu!=6){
            System.out.println("El resultado es: " + Num_Resultado);
        }
        
         leer.close();
    }

    
}
