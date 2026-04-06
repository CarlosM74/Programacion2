public class FiestaFinDeCursada {
    public static void main(String[] args) {
        String[] invitados = new String[10];
        int cantidad = 0;

        // Agregar "Ana"
        String nuevoInv = "Ana";
        boolean esta = false;
        for (int i = 0; i < cantidad; i++) {
            if (invitados[i].equals(nuevoInv)) {
                esta = true;
            }
        }
        if (!esta) {
            invitados[cantidad] = nuevoInv;
            cantidad++;
        }

        // Agregar "Ana" otra vez
        esta = false;
        for (int i = 0; i < cantidad; i++) {
            if (invitados[i].equals(nuevoInv)) {
                esta = true;
            }
        }
        if (!esta) {
            invitados[cantidad] = nuevoInv;
            cantidad++;
        }

        // Mostrar resultado
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Invitado: " + invitados[i]);
        }
    }
}
