package metodosDeOrdenaçao;

import java.util.Arrays;

public class InsertionSortArrays {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 6};
        int aux, j, i;


        System.out.print("Array Desordenado = " + Arrays.toString(array));

        System.out.println(" ");

        // Algoritmo de ordenação Insertion-sort
        for (i = 1; i < 5; i++) {
            aux = array[i];
            j = i - 1;
            while ((j >= 0) && (array[j] > aux)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }

        System.out.print("Array Ordenado = " + Arrays.toString(array));
    }
}
