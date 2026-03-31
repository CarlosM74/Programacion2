package tda;

public class ConjuntoImpl implements ConjuntoTDA {

    private int[] datos;
    private int cant;

    @Override
    public void InicializarConjunto() {
        datos = new int[1000];
        cant = 0;
    }

    @Override
    public void Agregar(int x) {
        if (!Pertenece(x)) {
            datos[cant] = x;
            cant++;
        }
    }

    @Override
    public void Sacar(int x) {
        for (int i = 0; i < cant; i++) {
            if (datos[i] == x) {
                datos[i] = datos[cant - 1];
                cant--;
                return;
            }
        }
    }

    @Override
    public boolean Pertenece(int x) {
        for (int i = 0; i < cant; i++) {
            if (datos[i] == x) return true;
        }
        return false;
    }

    @Override
    public boolean ConjuntoVacio() {
        return cant == 0;
    }

    @Override
    public int Elegir() {
        return datos[0];
    }
}
