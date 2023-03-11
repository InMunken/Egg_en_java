package Package_01;

import java.util.HashMap;
import java.util.Map;


public class Roman_to_int {
    
    public static void main(String[] args) {
        String numeroRomano = "IX";
        int valorEntero = convertir(numeroRomano);
        System.out.println(numeroRomano + " en formato decimal es: " + valorEntero);
    }

    public static int convertir(String numeroRomano) {
        Map<Character, Integer> valoresRomanos = new HashMap<>();
        valoresRomanos.put('I', 1);
        valoresRomanos.put('V', 5);
        valoresRomanos.put('X', 10);
        valoresRomanos.put('L', 50);
        valoresRomanos.put('C', 100);
        valoresRomanos.put('D', 500);
        valoresRomanos.put('M', 1000);

        int valorAnterior = 0;
        int valorActual = 0;
        int valorTotal = 0;
        char caracterActual;

        for (int i = 0; i < numeroRomano.length(); i++) {

            //revisamos una letra a la vez, la tomamos del String argumento con ".chatAt(x)".
            caracterActual = numeroRomano.charAt(i);

            //asignamos a valor actual, el valor que le corresponde la key que extrajimos antes.
            valorActual = valoresRomanos.get(caracterActual);


            //Aplicamos la lógica de los números romanos:  El primer valor anterior siempre empieza siendo 0, entonces siempre arrganca entrando al else.    |||    Donde simplemente se guarda el valor que le corresponde a la key guardada en caracterActual.    |||    Si el número actual es mayor al número anterior "IX" --> (X --> I) (10 --> 1) entonces guadramos dentro de valor total, el valor actual menos el doble del valor anterior. Pero ya habíamos guardado el valor anterior antes, asique anulamos la mitad del valor, por lo que nos queda restar el valor real, básicamente compensamos por el que ya habíamos guaradado antes.
        
            if (valorActual > valorAnterior) {
                valorTotal += valorActual - (2 * valorAnterior);
            } else {
                valorTotal += valorActual;
            }

            valorAnterior = valorActual;
        }

        return valorTotal;
    }



    
}
