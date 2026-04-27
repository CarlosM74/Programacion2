import java.util.*;

public class Desafio1_Main {
    public static void main(String[] args) {
        // Caso 1: Palíndromo válido
        Queue<Integer> cola1 = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println("Cola: " + cola1);
        System.out.println("¿Es palíndromo? " + Desafio1_EspejoDelaCola.esPalindromo(cola1));
        System.out.println();

        // Caso 2: No es palíndromo
        Queue<Integer> cola2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Cola: " + cola2);
        System.out.println("¿Es palíndromo? " + Desafio1_EspejoDelaCola.esPalindromo(cola2));
    }
}