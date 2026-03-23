class ImpresoraLaboratorio {
    String[] archivos = new String[5];
    int cantidad = 0;

    // Agregar archivo
    public void agregarArchivo(String nombreArchivo) {
        archivos[cantidad] = nombreArchivo;
        cantidad++;
        System.out.println("Archivo agregado: " + nombreArchivo);
    }

    // Imprimir en orden FIFO
    public void imprimir() {
        System.out.println("\nOrden de impresión:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + archivos[i]);
        }
    }
}

class MainImpresora {
    public static void main(String[] args) {
        ImpresoraLaboratorio impresora = new ImpresoraLaboratorio();

        impresora.agregarArchivo("trabajo1.doc");
        impresora.agregarArchivo("trabajo2.doc");
        impresora.agregarArchivo("trabajo3.doc");
        impresora.agregarArchivo("trabajo4.doc");
        impresora.agregarArchivo("trabajo5.doc");

        impresora.imprimir();
    }
}