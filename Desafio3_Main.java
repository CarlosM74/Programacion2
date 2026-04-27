import java.util.*;

public class Desafio3_Main {
    public static void main(String[] args) {
        // Crear pila
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        pila.push(20);

        System.out.println("Pila original: " + pila);

        // Verificar pertenencia
        System.out.println("¿Contiene 10? " + Desafio3_LaPlaqNoMiente.perteneceEnPila(pila, 10));
        System.out.println("¿Contiene 100? " + Desafio3_LaPlaqNoMiente.perteneceEnPila(pila, 100));
        System.out.println("¿Contiene 5? " + Desafio3_LaPlaqNoMiente.perteneceEnPila(pila, 5));

        // Verificar que la pila se restauró
        System.out.println("Pila después de búsquedas: " + pila);
    }
}
