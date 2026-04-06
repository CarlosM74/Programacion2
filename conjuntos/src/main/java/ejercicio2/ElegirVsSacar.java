package ejercicio2;

import tda.ConjuntoImpl;
import tda.ConjuntoTDA;

public class ElegirVsSacar {

    static void parte1() {
        System.out.println("Parte 1: Elegir sin Sacar\n");

        ConjuntoTDA c = new ConjuntoImpl();
        c.InicializarConjunto();
        c.Agregar(10);
        c.Agregar(20);
        c.Agregar(30);

        int e1 = c.Elegir();
        int e2 = c.Elegir();
        int e3 = c.Elegir();

        System.out.println("Elegir 1: " + e1);
        System.out.println("Elegir 2: " + e2);
        System.out.println("Elegir 3: " + e3);
        System.out.println("Vacio: " + c.ConjuntoVacio());
        System.out.println("Siempre devuelve lo mismo\n");
    }

    static void parte2() {
        System.out.println("Parte 2: Elegir + Sacar\n");

        ConjuntoTDA c = new ConjuntoImpl();
        c.InicializarConjunto();
        c.Agregar(10);
        c.Agregar(20);
        c.Agregar(30);

        int i = 1;
        while (!c.ConjuntoVacio()) {
            int elem = c.Elegir();
            System.out.println("Paso " + i + ": Elegir = " + elem);
            c.Sacar(elem);
            System.out.println("       Sacar ejecutado");
            i++;
        }
        System.out.println("Listo\n");
    }

    static void parte3() {
        System.out.println("Parte 3: Sin Sacar es infinito\n");
        System.out.println("(mostramos 5 vueltas nomas)\n");

        ConjuntoTDA c = new ConjuntoImpl();
        c.InicializarConjunto();
        c.Agregar(10);
        c.Agregar(20);
        c.Agregar(30);

        for (int i = 1; i <= 5; i++) {
            int elem = c.Elegir();
            System.out.println("Vuelta " + i + ": " + elem);
        }
        System.out.println("...");
        System.out.println("Sin Sacar nunca termina\n");
    }

    public static void main(String[] args) {
        parte1();
        parte2();
        parte3();
    }
}
