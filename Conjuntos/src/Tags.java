public class Tags {
    public static void main(String[] args) {
        String[] tags = new String[10];
        int cantidad = 0;

        String nuevoTag = "Java";
        boolean existe = false;
        for (int i = 0; i < cantidad; i++) {
            if (tags[i].equals(nuevoTag)) {
                existe = true;
            }
        }
        if (!existe) {
            tags[cantidad] = nuevoTag;
            cantidad++;
        }

        // Intentar agregar el mismo tag otra vez
        existe = false;
        for (int i = 0; i < cantidad; i++) {
            if (tags[i].equals(nuevoTag)) {
                existe = true;
            }
        }
        if (!existe) {
            tags[cantidad] = nuevoTag;
            cantidad++;
        }

        // Agregar otro tag diferente
        nuevoTag = "OOP";
        existe = false;
        for (int i = 0; i < cantidad; i++) {
            if (tags[i].equals(nuevoTag)) {
                existe = true;
            }
        }
        if (!existe) {
            tags[cantidad] = nuevoTag;
            cantidad++;
        }

        // Mostrar los tags únicos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Tag: " + tags[i]);
        }
    }
}