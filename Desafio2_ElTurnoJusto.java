import java.util.*;

/**
 * DESAFÍO 2: "El turno justo" (Cola con Prioridad dinámica)
 *
 * PROBLEMA: Contar elementos con P=1 sin "saltar" (extraer siempre el de mayor prioridad).
 * Se puede variar P=2 para restaurar luego todo.
 *
 * SOLUCIÓN:
 * - Usar una Cola de Prioridad que siempre extrae el elemento con mayor prioridad
 * - Contar elementos con P=1
 * - El código necesita ~15 líneas pero lógica de restauración requiere 2 auxiliares
 */
public class Desafio2_ElTurnoJusto {

    static class Elemento implements Comparable<Elemento> {
        int valor;
        int prioridad;

        Elemento(int valor, int prioridad) {
            this.valor = valor;
            this.prioridad = prioridad;
        }

        // Comparar por prioridad (mayor prioridad primero)
        @Override
        public int compareTo(Elemento otro) {
            return Integer.compare(otro.prioridad, this.prioridad);
        }
    }

    public static int contarP1(PriorityQueue<Elemento> colaPrioridad) {
        int contador = 0;
        PriorityQueue<Elemento> auxiliar = new PriorityQueue<>(colaPrioridad);

        // Paso 1: Extraer y contar elementos con P=1
        while (!auxiliar.isEmpty()) {
            Elemento elem = auxiliar.poll();
            if (elem.prioridad == 1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        PriorityQueue<Elemento> cola = new PriorityQueue<>();
        cola.add(new Elemento(10, 1));
        cola.add(new Elemento(20, 2));
        cola.add(new Elemento(30, 1));
        cola.add(new Elemento(40, 3));

        System.out.println("Elementos con P=1: " + contarP1(cola));
    }
}
