package main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario;


import main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo.Candidato;
import main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo.Tecnologia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EvaluacionTecnicaPil2 {

    /**
     * <b>TEMAS:</b><p>
     * - Arreglos y ordenamiento.<p>
     * - POO.<p>
     * - Buenas prácticas + Utilización del IDE.<p>
     * - Java 5, 6, 7 y 8 (<i>Streams, Optionals, Generics, Functional Interfaces</i>).<p>
     */
    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        imprimirMensajePunto(1);

        // Desarrollo de la consigna 1.


        inicializarCandidatos();
        /* Candidatos inicializados satisfactoriamente
        en el orden y con los datos señalados en la consigna;
         */

        resolverPunto1(); // Print del List de Candidatos, línea por línea;

        imprimirMensajePunto(2);

        // Desarrollo de la consigna 2.
        
        resolverPunto2();

        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3();

        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4();

        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5();

    }


    private static void resolverPunto1() {

        System.out.println(inicializarCandidatos());

    }

    private static void resolverPunto2() {


        inicializarCandidatos().stream()
                .sorted(Comparator.comparingLong(Candidato::getId))
                .map(c -> c.getNombre().concat(" ")
                        .concat(c.getApellido()).concat(" ID: ")
                        .concat(String.valueOf(c.getId())))
                .forEach(System.out::println);
    }

    private static void resolverPunto3() {
        inicializarCandidatos().stream()
                .sorted(Comparator.comparingDouble(Candidato::getPretensionSalarial).reversed())
                .map(c -> c.getNombre().concat(" ")
                        .concat(c.getApellido()).concat(" ---> Pretensión Salarial: USD ")
                        .concat(String.valueOf(c.getPretensionSalarial())))
                .forEach(System.out::println);
    }

    private static void resolverPunto4() {
        // TODO: Realizar implementación.
    }

    private static void resolverPunto5() {
        // TODO: Realizar implementación.
    }

    private static List<Candidato> inicializarCandidatos() {
        List<Candidato> candidatos = new ArrayList<>();

        Candidato candidato3 = new Candidato(3L, "John", "Doe", 5000.00, 2);
        candidato3.addTecnologias(new Tecnologia(1L, "Java"));
        candidato3.addTecnologias(new Tecnologia(2L, "Angular"));
        candidato3.addTecnologias(new Tecnologia(3L, "SQL"));
        candidatos.add(candidato3);

        Candidato candidato7 = new Candidato(7L, "Matías", "Otamendi", 3000.00, 9);
        candidato7.addTecnologias(new Tecnologia(8L, "NodeJS"));
        candidato7.addTecnologias(new Tecnologia(1L, "Java"));
        candidato7.addTecnologias(new Tecnologia(3L, "SQL"));
        candidatos.add(candidato7);

        Candidato candidato1 = new Candidato(1L, "Joaquín", "Tagliafico", 2000.00, 6 );
        candidato1.addTecnologias(new Tecnologia(7L, "MongoDB"));
        candidato1.addTecnologias(new Tecnologia(4L, "NoSQL"));
        candidatos.add(candidato1);

        Candidato candidato4 = new Candidato(4L, "Gastón", "Mc Allister", 5000.50, 1 );
        candidato4.addTecnologias(new Tecnologia(5L, "Vue.js"));
        candidato4.addTecnologias(new Tecnologia(3L, "SQL"));
        candidato4.addTecnologias(new Tecnologia(1L, "Java"));
        candidatos.add(candidato4);

        Candidato candidato5 = new Candidato(5L, "Pablo", "De Paul", 9000.50, 4);
        candidato5.addTecnologias(new Tecnologia(1L, "Java"));
        candidatos.add(candidato5);

        Candidato candidato2 = new Candidato(2L, "Lucas", "Di María", 6000.00, 7);
        candidato2.addTecnologias(new Tecnologia(1L, "Java"));
        candidato2.addTecnologias(new Tecnologia(2L, "Angular"));
        candidato2.addTecnologias(new Tecnologia(3L, "SQL"));
        candidatos.add(candidato2);

        Candidato candidato10 = new Candidato(10L, "Lionel", "Messi", 10000.00, 10);
        candidato10.addTecnologias(new Tecnologia(3L, "SQL"));
        candidato10.addTecnologias(new Tecnologia(5L, "Vue.js"));
        candidato10.addTecnologias(new Tecnologia(1L, "Java"));
        candidatos.add(candidato10);

        Candidato candidato9 = new Candidato(9L, "Julian", "Álvarez", 5000.00, 3);
        candidato9.addTecnologias(new Tecnologia(4L, "NoSQL"));
        candidato9.addTecnologias(new Tecnologia(7L, "MongoDB"));
        candidato9.addTecnologias(new Tecnologia(3L, "SQL"));
        candidato9.addTecnologias(new Tecnologia(1L, "Java"));
        candidatos.add(candidato9);

        Candidato candidato8 = new Candidato(8L, "Lula", "Martínez", 1000.50, 2 );
        candidato8.addTecnologias(new Tecnologia(6L, ".NET"));
        candidato8.addTecnologias(new Tecnologia(1L, "Java"));
        candidato8.addTecnologias(new Tecnologia(2L, "Angular"));
        candidatos.add(candidato8);

        Candidato candidato6 = new Candidato(6L, "Agustín", "Dybala", 1000.00, 2);
        candidato6.addTecnologias(new Tecnologia(1L, "Java"));
        candidato6.addTecnologias(new Tecnologia(6L, ".NET"));
        candidato6.addTecnologias(new Tecnologia(2L, "Angular"));
        candidatos.add(candidato6);

        return (candidatos);


    }

    /**
     * Saludo de bienvenida, ignore el método.
     */
    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    /**
     * Separa de manera bonita cada punto a resolver, ignore el método.
     */
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }
}
