import java.util.*;

public class Desafio2_Main {
    static class Elemento implements Comparable<Elemento> {
        int valor;
        int prioridad;

        Elemento(int valor, int prioridad) {
            this.valor = valor;
            this.prioridad = prioridad;
        }

        @Override
        public int compareTo(Elemento otro) {
            return Integer.compare(otro.prioridad, this.prioridad);
        }

        @Override
        public String toString() {
            return "(" + valor + ",P=" + prioridad + ")";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Elemento> cola = new PriorityQueue<>();
        cola.add(new Elemento(10, 1));
        cola.add(new Elemento(20, 2));
        cola.add(new Elemento(30, 1));
        cola.add(new Elemento(40, 3));

        System.out.println("Contando elementos con P=1:");
        int contador = 0;
        PriorityQueue<Elemento> copia = new PriorityQueue<>(cola);
        while (!copia.isEmpty()) {
            Elemento elem = copia.poll();
            if (elem.prioridad == 1) {
                contador++;
            }
        }
        System.out.println("Total elementos con P=1: " + contador);

        System.out.println("Orden de extracción (sin saltar, siempre máxima prioridad):");
        copia = new PriorityQueue<>(cola);
        while (!copia.isEmpty()) {
            System.out.println(copia.poll());
        }
    }
}