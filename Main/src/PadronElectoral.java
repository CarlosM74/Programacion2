public class PadronElectoral {
    int[] alumnos;
    int cantidad;
    int MAX = 100;

    public PadronElectoral() {
        alumnos = new int[MAX];
        cantidad = 0;
    }

    public boolean pertenece(int legajo) {
        int i = 0;
        while (i < cantidad && alumnos[i] != legajo) {
            i++;
        }
        return i < cantidad;
    }

    public void agregar(int legajo) {
        if (!pertenece(legajo) && cantidad < MAX) {
            alumnos[cantidad] = legajo;
            cantidad++;
        }
    }

    public void mostrar() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(alumnos[i]);
        }
    }
}