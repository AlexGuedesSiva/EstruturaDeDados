package metodosDeOrdenaçao;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int array[], int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = array[(esq + dir) / 2];
        int aux;

        while (esq <= dir) {
            while (array[esq] < pivo) {
                esq = esq + 1;
            }
            while (array[dir] > pivo) {
                dir = dir - 1;
            }
            if (esq <= dir) {
                aux = array[esq];
                array[esq] = array[dir];
                array[dir] = aux;
                esq = esq + 1;
                dir = dir - 1;
            }
        }
        if (dir > esquerda)
            quickSort(array, esquerda, dir);
        if (esq < direita)
            quickSort(array, esq, direita);
    }


    public static void main(String args[]) {

        int vetor[] = {5, 3, 8, 2, 6};
        System.out.print("Array Desordenado = " + Arrays.toString(vetor));

        System.out.println();
        System.out.print("Array Ordenado = ");
            quickSort(vetor, 0, vetor.length - 1);


        System.out.print(Arrays.toString(vetor));
    }
}