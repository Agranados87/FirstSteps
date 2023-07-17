package practicas;

import java.util.*;

public class juego {

    public static void main(String[] args) {

        /*Crea un programa donde se genere un número y que mediante pistas, podamos descubrir de qué
        número se trata.*/

        int aleatorio = (int) (Math.random() * 100);

        try (Scanner entrada = new Scanner(System.in)) {
            int numero = 0;
            int intentos = 0;

            while (numero != aleatorio) {

                intentos++;

                System.out.println("Introduce un numero, por favor");

                numero = entrada.nextInt();

                if (aleatorio < numero) {

                    System.out.println("Más bajo.");

                } else if (aleatorio > numero) {

                    System.out.println("Más alto.");

                }

            }

            System.out.println("¡Correcto! Lo has conseguido en " + intentos + " intentos.");
        }

    }
}