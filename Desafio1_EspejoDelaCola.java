import java.util.*;
public class Desafio1_EspejoDelaCola {

    public static boolean esPalindromo(Queue<Integer> cola) {
        Stack<Integer> pila = new Stack<>();
        Queue<Integer> colaCopia = new LinkedList<>(cola);

        while (!colaCopia.isEmpty()) {
            pila.push(colaCopia.poll());
        }
        colaCopia = new LinkedList<>(cola);
        while (!colaCopia.isEmpty()) {
            if (!colaCopia.poll().equals(pila.pop())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println("¿Es palíndromo? " + esPalindromo(cola)); // true

        Queue<Integer> cola2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("¿Es palíndromo? " + esPalindromo(cola2)); // false
    }
}
