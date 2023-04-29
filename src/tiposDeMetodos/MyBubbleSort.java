package tiposDeMetodos;

public class MyBubbleSort {

    public static void main(String[] args) {

        int[] array = {5, 3, 8, 2, 6, 5, 6, 7, 8, 9, 10};
        int aux = 0;
        int i = 0;
        double inicio = System.currentTimeMillis();
        double fim;


        System.out.print("Array Desordenado = { ");
        for (i = 0; i < array.length; i++) {
            if (i == 10) {
                System.out.print(array[i] + " }");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();

        //Algoritimo de ordenação Bubble Sort
        for (i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));


        System.out.print("Array Ordenado = { ");
        for (i = 0; i < array.length; i++) {
            if (i == 10) {
                System.out.print(array[i] + " }");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

    }
}