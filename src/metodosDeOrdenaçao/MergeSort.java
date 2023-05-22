package metodosDeOrdenaçao;

public class MergeSort {

    public static void merge(int array[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Criação de arrays temporarios
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copia os dados para os arrays temporario
        for (int i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for(int j=0; j<n2; ++j)
            R[j] = array[m + 1 + j];

        // Mescla ou intercala os dados para arrays temporarios
        //índices iniciais do primeiro e segundo subconjuto
        int i = 0, j = 0;

        //índice inicial do array mesclado
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        //Copia os elementos restantes de L [] se houver
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copia os elementos restantes de R [] se houver
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Ordena o array{l...r] usando o merge ()
    public static void sort(int array[], int l, int r) {
        if (l < r) {
            int m = (l+r)/2; // encontra o meio
            // Sorteia a primeira e a segunda metade
            sort(array, l, m);
            sort(array, m+1, r);
            merge(array, l, m, r); // mescla as metades selecionadas
        }
    }

    public static void imprimirArray(int array[]) {
        for (int i=0; i< array.length; ++i) {
            if (i == array.length -1){
                System.out.print(array[i] + " }");
            } else {
                System.out.print(array[i] + ",");
            }
        }

    }

    public static void main(String args[]) {
        int array[] = {5, 3, 8, 2, 6};

        System.out.print("Array Desordenado = { ");
        imprimirArray(array);

        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length - 1);

        System.out.println();
        System.out.print("Array Ordenado = { ");
        imprimirArray(array);

    }
}
