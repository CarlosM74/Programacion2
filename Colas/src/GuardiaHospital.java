public class GuardiaHospital {
    Paciente[] cola = new Paciente[100];
    int cantidad = 0;

    // Agregar paciente
    public void agregarPaciente(int numero, int prioridad) {
        cola[cantidad] = new Paciente(numero, prioridad);
        cantidad++;
        System.out.println("Paciente " + numero + " (Prioridad " + prioridad + ") llega");
    }

    // Ordenar por prioridad (Mayor prioridad = Mayor valor)
    public void ordenarPorPrioridad() {
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - 1 - i; j++) {
                if (cola[j].prioridad < cola[j + 1].prioridad) {
                    // Intercambiar
                    Paciente temp = cola[j];
                    cola[j] = cola[j + 1];
                    cola[j + 1] = temp;
                }
            }
        }
    }

    // Atender paciente
    public void atenderPaciente() {
        ordenarPorPrioridad();
        System.out.println("Atendiendo paciente: " + cola[0].numero +
                " (Prioridad: " + cola[0].prioridad + ")");

        // Quitar paciente atendido
        for (int i = 0; i < cantidad - 1; i++) {
            cola[i] = cola[i + 1];
        }
        cantidad--;
    }

    public void mostrar() {
        ordenarPorPrioridad();
        System.out.println("Cola actual:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Paciente " + cola[i].numero +
                    " - Prioridad: " + cola[i].prioridad);
        }
    }
}
