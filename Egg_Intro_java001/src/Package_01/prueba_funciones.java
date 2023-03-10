package Package_01;

public class prueba_funciones {
    
    public static void main (String args[]){

        int uno=1, dos=2, resultado=0;

        resultado = sumar(uno, dos);

        System.out.println(resultado);
    }

    public static int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

}
