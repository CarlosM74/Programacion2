public class Paciente {
    int numero;
    int prioridad;

    public Paciente(int numero, int prioridad) {
        this.numero = numero;
        this.prioridad = prioridad;
    }
}

class MainHospital {
    public static void main(String[] args) {
        GuardiaHospital hospital = new GuardiaHospital();

        hospital.agregarPaciente(1, 100);  // Prioridad 100 (muy grave)
        hospital.agregarPaciente(2, 5);    // Prioridad 5 (leve)
        hospital.agregarPaciente(3, 50);   // Prioridad 50 (medio)

        hospital.mostrar();

        System.out.println("\nAtendiendo...");
        hospital.atenderPaciente();

        hospital.mostrar();
    }
}
