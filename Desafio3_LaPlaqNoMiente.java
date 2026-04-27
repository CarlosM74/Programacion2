import java.util.*;
public class Desafio3_LaPlaqNoMiente {

    public static boolean perteneceEnPila(Stack<Integer> pila, int valor) {
        Stack<Integer> pilaAuxiliar = new Stack<>();
        Set<Integer> conjunto = new HashSet<>();
        boolean encontrado = false;

        while (!pila.isEmpty()) {
            Integer elem = pila.pop();
            pilaAuxiliar.push(elem);
            conjunto.add(elem);
        }

        encontrado = conjunto.contains(valor);

        while (!pilaAuxiliar.isEmpty()) {
            pila.push(pilaAuxiliar.pop());
        }

        return encontrado;
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);

        System.out.println("¿Contiene 10? " + perteneceEnPila(pila, 10)); 
        System.out.println("¿Contiene 100? " + perteneceEnPila(pila, 100));
    }
}
