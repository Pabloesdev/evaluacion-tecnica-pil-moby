package main.java.com.pil.moby.evaluacion_tecnica.primer_cuestionario;

public class EvaluacionTecnicaPil1 {

    public static void main(String[] args) {

      
        imprimirBienvenidaEvaluacionTecnica();

        /****
         * TEMAS:
         *   - Tipos de datos.
         *   - Flujos de control.
         *   - Operadores.
         *   - Clases System.
         ****/

        /****
         * CONSIGNAS:
         * 1. Declará al menos tres variables con tipos de datos primitivos.
         * 2. A las variables declaradas anteriormente asignales un valor
         *    y realizá al menos dos cálculos matemáticos utilizando -operadores aritméticos-.
         * 3. Planteá tres condiciones lógicas que cumplan con lo siguiente:
         *      a. Condición verdadera --> Imprimí por pantalla el resultado de los cálculos anteriores.
         *         Condición falsa --> Imprimí por pantalla un mensaje de error.
         *      b. Condición verdadera --> Siempre que se cumpla, incrementá un valor hasta que éste llegue al doble de su valor inicial.
         *                                 Antes de realizar esta condición, imprimí el valor inicial de la variable que vas a modificar.
         *                                 Finalmente, imprimí por pantalla el valor final.
         *      c. Iteración --> Realizá N cantidad de impresiones, siendo N un tercio del valor de la variable del punto 'b'.
         ****/

        imprimirConsigna(1);

        // Desarrollo de la consigna 1.

        int a;
        float b;
        double c;


        imprimirConsigna(2);

        // Desarrollo de la consigna 2.

        a = 129870;
        b = 129.87f;
        c = 12.9875;

        // Operdor Suma (+):

        System.out.println("SUMA a + b + c = " + (a + b + c) + '\n');

        // Operador Resta (-):

        System.out.println("RESTA a - b - c = " + (a - b - c) + '\n');

        /*
         Operador Multiplicación (*):


        System.out.println("MULTIPLICACIÓN (a + b) * c = " + (a + b) * c);

        // Operdor división (/):

        System.out.println("DIVISIÓN (a - b) / c = " + ((a - b) / c ) + '\n');

         */


        imprimirConsigna(3);

        // Desarrollo de la consigna 3.

        System.out.println("CONSIGNA A: \n");

        double suma = a + b +c;
        double resta = a - b -c;

        if (a + b + c == suma && a - b - c == resta){
            System.out.println("La SUMA a + b + c = " + suma);
            System.out.println("La RESTA a - b - c = " + resta + '\n');

        } else {
            System.err.print("Ha ocurrido un error \n");
        }

        System.out.println("CONSIGNA B: \n");


        int e = 12;
        int ef = e * 2;

        System.out.println("El valor inicial es: " + e + '\n');

        while (e <= ef){
            System.out.println(" i es = " + e);
            e = e + 1;

        } System.out.println("\n El valor final es = " + (e - 1));

        System.out.println("\n CONSIGNA C: \n");


        for(int i = 0; i <= e/3; i++ ){

            System.out.println("i = " + i);
        }

    }

    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("*******************************************");
        System.out.println("Bienvenidos a la primer Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}
