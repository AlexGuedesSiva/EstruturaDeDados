package metodosDeOrdenaçao;

public class BubbleSortForeach {

    public static void main(String[] args) {

        int[] array = {5,3,8,2,6};
        int aux = 0;
        int i = 0;

        System.out.print("Array Desordenado = { ");
        for (int arrayForeach : array)		{
            if(arrayForeach == 6) {
                System.out.print(arrayForeach + " }");
            }else {
                System.out.print(arrayForeach + ", ");
            }
        }
        System.out.println(" ");

        for(i = 0; i < array.length; i++){
            for(int j = 0; j < 4; j++) {
                if(array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Array Ordenado = { ");
        for(int arrayForeach : array) {
            if (arrayForeach == 8) {
                System.out.print(arrayForeach + " }");
            }else {
                System.out.print(arrayForeach + ", ");
            }
        }

    }

}
