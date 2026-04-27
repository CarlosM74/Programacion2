import java.util.*;
public class Desafio4_LaFronteradelConjunto {

    public static Set<Integer> diferenciaSimetrica(Set<Integer> A, Set<Integer> B) {
        Set<Integer> resultado = new HashSet<>();

        for (Integer elem : A) {
            if (!B.contains(elem)) {
                resultado.add(elem);
            }
        }

        for (Integer elem : B) {
            if (!A.contains(elem)) {
                resultado.add(elem);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> B = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        Set<Integer> diferencia = diferenciaSimetrica(A, B);
        System.out.println("Diferencia simétrica: " + diferencia); 
    }
}
