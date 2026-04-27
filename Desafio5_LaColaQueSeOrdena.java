import java.util.*;
public class Desafio5_LaColaQueSeOrdena {

    static class Elemento implements Comparable<Elemento> {
        int valor;
        int prioridad;
        int orden;

        Elemento(int valor, int prioridad, int orden) {
            this.valor = valor;
            this.prioridad = prioridad;
            this.orden = orden;
        }

        @Override
        public int compareTo(Elemento otro) {
            if (this.prioridad != otro.prioridad) {
                return Integer.compare(otro.prioridad, this.prioridad);
            }
            return Integer.compare(this.orden, otro.orden);
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Elemento> cola = new PriorityQueue<>();
        int contador = 0;

        cola.add(new Elemento(10, 2, contador++));
        cola.add(new Elemento(20, 1, contador++));
        cola.add(new Elemento(30, 3, contador++));
        cola.add(new Elemento(40, 0, contador++));
        cola.add(new Elemento(50, -1, contador++)); 

        System.out.println("Orden de salida:");
        while (!cola.isEmpty()) {
            Elemento e = cola.poll();
            System.out.println("Valor: " + e.valor + ", Prioridad: " + e.prioridad);
        }
    }
}
