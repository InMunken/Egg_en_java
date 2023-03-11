package Package_01;

public class final_pseint {

    public static void main(String args[]) {

    //Definimos las 3 dimensiones de la matriz calculadora   	
	int[][][] calculadora = new int[3][3][3];
    //Definición de variables
	String cadena1 = "123456789", cadena2 = "987654321";
	int diagonal3D1, diagonal3D2;


	
	//Inicializamos la matriz
	calculadora = inicializarMatriz(calculadora);
    //Llenamos las matrices como se marca en el enunciado
	calculadora = llenarMatriz_Z0(calculadora, cadena1);
	calculadora = llenarMatriz_Z1(calculadora, cadena2);
	calculadora = llenarMatriz_Z2(calculadora);
	
	//Mostramos los resultados de la matriz
	imprimirMatriz(calculadora);
	
	//Asignamos los valores de las diagonales 3D
	diagonal3D1 = calculadora[0] [2] [0] * calculadora[1] [1] [1] * calculadora[2] [0] [2];
	diagonal3D2 = calculadora[0] [0] [0] * calculadora [1] [1] [1] * calculadora[2] [2] [2];
	
	
	//Escribimos los resultados de las diagonales
	System.out.println("La multiplicación de los elementos de la diagonal 3D 1 es " + diagonal3D1);
	System.out.println("La multiplicación de los elementos de la diagonal 3D 2 es " + diagonal3D2); 
        

    
	
    }

    public static int[][][] inicializarMatriz(int[][][] calculadora) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    calculadora[k][i][j] = 0;
                }
            }
        }

        return calculadora;
    }

    public static int[][][] llenarMatriz_Z0(int[][][] calculadora, String cadena) {

        int contador=0;
        char[] _cadena = cadena.toCharArray();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    calculadora[k][i][j] = _cadena[contador];
                    contador++;
                }
            }
        }

        return calculadora;
    }

    public static int[][][] llenarMatriz_Z1(int[][][] calculadora, String cadena2) {

        char[] _cadena2 = cadena2.toCharArray();
        int contador=0;
        

        for (int i=0; i<2; i++){

            for (int j=0; j<2; j++){
			calculadora[1][i][j] = _cadena2[contador];
			contador++;
            }
        }
        return calculadora;
    }

    public static int[][][] llenarMatriz_Z2(int[][][] calculadora) {

	for (int i=0; i<2; i++){
        for(int j=0; j<2; j++){
		calculadora[2][i][j] = calculadora[0][i][j] * calculadora[1][i][j];
	}
    }
    return calculadora;
}

    public static void imprimirMatriz(int[][][] calculadora) {

    for (int k = 0; k<3; k++){
        System.out.println("Capa número" + (k+1));
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(calculadora[k][i][j] + " _ ");
            }
        System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        }
    }

    

}


