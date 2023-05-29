package metodosDeOrdenaçao;

public class InsertionSortForeach {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 6};
        int aux, j, i;


        System.out.print("Array Desordenado = { ");
        for (int arrayForeach : array) {
            if (arrayForeach == 6) {
                System.out.print(arrayForeach + " }");
            } else
                System.out.print(arrayForeach + ", ");
        }

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

        System.out.print("Array Ordenado    = { ");
        for (int arrayForeach : array) {
            if (arrayForeach == 8) {
                System.out.print(arrayForeach + " }");
            } else
                System.out.print(arrayForeach + ", ");

        }
    }
}
