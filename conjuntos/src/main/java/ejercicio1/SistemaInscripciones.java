package ejercicio1;

import tda.ConjuntoImpl;
import tda.ConjuntoTDA;

public class SistemaInscripciones {

    private ConjuntoTDA legajos;

    public SistemaInscripciones() {
        legajos = new ConjuntoImpl();
        legajos.InicializarConjunto();
    }

    public void inscribir(int legajo, String carrera) {
        if (legajos.Pertenece(legajo)) {
            System.out.println("Legajo " + legajo + " ya existe");
        } else {
            legajos.Agregar(legajo);
            System.out.println("Legajo " + legajo + " agregado en " + carrera);
        }
    }

    public static void main(String[] args) {
        System.out.println("Sistema de Inscripciones\n");

        SistemaInscripciones s = new SistemaInscripciones();

        s.inscribir(100234, "Informatica");
        s.inscribir(100234, "Sistemas");
        s.inscribir(100567, "Informatica");
        s.inscribir(100567, "Sistemas");
        s.inscribir(100890, "Sistemas");
    }
}
