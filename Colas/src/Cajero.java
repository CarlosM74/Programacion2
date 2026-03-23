public class Cajero {
    int[] cola = new int[100];
    int inicio = 0;
    int fin = 0;

    // Agregar cliente a la cola
    public void agregarCliente(int numeroCliente) {
        cola[fin] = numeroCliente;
        fin++;
        System.out.println("Cliente " + numeroCliente + " llega a la fila");
    }

    // Atender cliente (FIFO - el primero que llegó)
    public void atenderCliente() {
        if (inicio < fin) {
            System.out.println("Atendiendo cliente: " + cola[inicio]);
            inicio++;
        } else {
            System.out.println("No hay clientes");
        }
    }

    public void mostrarCola() {
        System.out.println("Cola: ");
        for (int i = inicio; i < fin; i++) {
            System.out.print(cola[i] + " ");
        }
        System.out.println();
    }
}

class MainCajero {
    public static void main(String[] args) {
        Cajero cajero = new Cajero();

        cajero.agregarCliente(1);
        cajero.agregarCliente(2);
        cajero.agregarCliente(3);

        cajero.mostrarCola();

        cajero.atenderCliente();
        cajero.atenderCliente();

        cajero.mostrarCola();
    }
}
