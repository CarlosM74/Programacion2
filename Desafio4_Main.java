import java.util.*;

public class Desafio4_Main {
    public static void main(String[] args) {
        // Crear conjuntos
        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> B = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("Conjunto A: " + A);
        System.out.println("Conjunto B: " + B);

        // Calcular diferencia simétrica
        Set<Integer> resultado = Desafio4_LaFronteradelConjunto.diferenciaSimetrica(A, B);
        System.out.println("Diferencia simétrica A B: " + resultado);
        System.out.println("Elementos en A o B pero no en ambos: " + resultado.size() + " elementos");
    }
}