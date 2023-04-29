# **`Estruturas De Dados EM JAVA`**   


   **Método Bubble-sort**
   O Método de ordenação bolha ou Bubble-Sort é simples e um dos mais dinfudidos,
   geralmente utilizado para ordenação de uma base de dados pequena. Sua interação se limita em percorrer diversas 
   vezes o array do início ao fim, sem interrupção, trocando a posição de dois elementos sempre que estiverem 
   desordenados. Caso queiramos organizar os dados em ordem crescente, podemos ordenar do menor(inicio do array) para o
   maior (fim do array). No final da primeira interação, ao percorrer todo o array, podemos assumir que o último 
   elemento já está na sua posição final.

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