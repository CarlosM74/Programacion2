public class Main {
    public static void main(String[] args) {
        PadronElectoral padron = new PadronElectoral();

        padron.agregar(123);
        padron.agregar(456);
        padron.agregar(123);

        padron.mostrar();
    }
}