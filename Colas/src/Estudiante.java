public class Estudiante {
    int numero;
    int prioridad;  // 10 = Promocionado, 1 = Regular

    public Estudiante(int numero, int prioridad) {
        this.numero = numero;
        this.prioridad = prioridad;
    }
}

class ExamenFinal {
    Estudiante[] cola = new Estudiante[100];
    int cantidad = 0;

    public void agregarEstudiante(int numero, int prioridad) {
        cola[cantidad] = new Estudiante(numero, prioridad);
        cantidad++;
    }

    // Ordenar: Promocionados primero (mayor prioridad)
    public void ordenar() {
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - 1 - i; j++) {
                if (cola[j].prioridad < cola[j + 1].prioridad) {
                    Estudiante temp = cola[j];
                    cola[j] = cola[j + 1];
                    cola[j + 1] = temp;
                }
            }
        }
    }

    public void mostrarOrden() {
        ordenar();
        System.out.println("Orden de examen:");
        for (int i = 0; i < cantidad; i++) {
            String tipo = cola[i].prioridad == 10 ? "Promocionado" : "Regular";
            System.out.println((i + 1) + ". Estudiante " + cola[i].numero +
                    " (" + tipo + ")");
        }
    }
}

class MainExamen {
    public static void main(String[] args) {
        ExamenFinal examen = new ExamenFinal();

        examen.agregarEstudiante(1, 1);    // Regular
        examen.agregarEstudiante(2, 10);   // Promocionado
        examen.agregarEstudiante(3, 1);    // Regular
        examen.agregarEstudiante(4, 10);   // Promocionado

        examen.mostrarOrden();
    }
}