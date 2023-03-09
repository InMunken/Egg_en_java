package Package_01;

import java.util.Scanner;

public class Pruebas_Egg_00 {

	public static void main(String[] args) {
		
		System.out.println("Hello world!!");

		Scanner read = new Scanner(System.in);
			String name;
			System.out.println("Escriba su nombre a continuacion:");
			name = read.next();
			System.out.println("Hello user: " + name + " welcome!!");

			read.close();
	}
}

