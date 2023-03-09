package Package_01;

import java.util.Scanner;

public class Pruebas_Egg_03 {
    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una frase en mayúsculas para pasar a minúsculas: ");
        frase = read.nextLine();
        System.out.println("Tu frase era: " + frase);

        System.out.println("Ahora tu frase es: " + frase.toLowerCase());

        read.close();
    }
}
