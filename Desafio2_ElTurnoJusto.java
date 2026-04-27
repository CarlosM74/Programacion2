import java.util.*;
public class Desafio2_ElTurnoJusto {

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
    }

    public static int contarP1(PriorityQueue<Elemento> colaPrioridad) {
        int contador = 0;
        PriorityQueue<Elemento> auxiliar = new PriorityQueue<>(colaPrioridad);

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
