# Métodos de Ordenação  

##    Bubble-sort

   O Método de ordenação bolha ou Bubble-Sort é simples e um dos mais dinfudidos,
   geralmente utilizado para ordenação de uma base de dados pequena. Sua interação se limita em percorrer diversas 
   vezes o array do início ao fim, sem interrupção, trocando a posição de dois elementos sempre que estiverem 
   desordenados. Caso queiramos organizar os dados em ordem crescente, podemos ordenar do menor(inicio do array) para o
   maior (fim do array). No final da primeira interação, ao percorrer todo o array, podemos assumir que o último 
   elemento já está na sua posição final.

**Pseudocódigo do Algoritmo Bubble Sort:**
    

    for (i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] > array[j]) {
                aux = array[j]; aux = variável auxiliar que armazena o valor do array
                array[j] = array[i];
                array[i] = aux;
            }
        }
    }


   Uma das vantagens do Bubble-Sort é o fato de ser um método mais simples e de fácil implementação. A
   desvantagem, por outro lado, está no fato da eficiência diminuir conforme os números dos elementos
   aumentam. Considerando um array com n elementos, a complexidade do algoritmo de ordenação Bubble-Sort é feita em:

*    melhor caso: O(n);
*    médio caso: O(n );
*    pior caso: O(n ).

##  Método Insertion-Sort

   O método de ordenação por inserção ou Insertion-Sort, assim como o Bubble-Sort, também é considerado um
   método simples. Ele percorre os elementos de um array e, conforme avança, vai ordenando os elementos. Seu
   funcionamento consiste em percorrer os elementos da array da esquerda para a direita e para cada elemento.
   Começando com o segundo, é realizada uma comparação para ordenar o elemento atual com o item anterior
   do array, de acordo com o critério de ordenação. Esse algoritmo é bastante eficaz para problemas com
   pequenas entradas, sendo o mais eficiente entre os algoritmos da ordem de classificação.

   Muitos autores, como o Ziviani (2012), utilizam uma analogia para escrever o algoritmo: é o modo como
   algumas pessoas ordenam as cartas em um jogo de baralho. Imagine que você esteja jogando cartas e as cartas
   que estão na sua mão estão ordenadas. Você recebe uma nova carta e esta deve ser ordenada também, ou seja,
   é preciso colocá-la na posição correta. A carta pode ser maior ou menor que outras que você já possui, por
   isso, você começa a comparar sua nova carta com as cartas que estão na sua mão, até encontrar a posição
   correta. Encontrando-a, terá novamente uma mão com cartas ordenadas.

**Pseudocódigo do Algoritmo Insertion-Sort:**

      for(i = 1; i < 5; i++) {				
         aux = array[i];
         j = i - 1;					
         while ((j >= 0) && (array[j] > aux)){				
            array[j+1] = array[j];
            j--;
         }	
         array[j+1] = aux;
      }

O Insertion-Sort tem como vantagem ser um algoritmo estável, que não altera a ordem dos dados iguais e
pode organizar os elementos assim que os recebe, sem necessitar organizar depois de receber todos os dados.
Porém, uma desvantagem é o alto custo de movimentação de elementos no array.
Considerando um array com n elementos, a complexidade do algoritmo de ordenação Insertion-Sort é dada
por:
* melhor caso: O(n);
* médio caso: O(n );
* pior caso: O(n ).

##  Método Quick-Sort

   O método de ordenação rápida ou Quick-Sort é mais complexo que os algoritmos anteriores. É um método de 
   ordenação interna rápido, pois utiliza a estratégia de dividir para conquistar. Assim, a ideia é ideia é escolher um
   elemento qualquer chamado pivô, sendo que, a partir desse pivô, o array é organizado.

#### VOCÊ O CONHECE?
   Charles Antony Richard Hoare, nascido em 1934, formou-se na universidade de
   Oxford em 1956. É conhecido por desenvolver o método de ordenação Quick-Sort em
   1960, ao tentar traduzir um dicionário de inglês para russo, ordenando as palavras. O
   algoritmo de ordenação é um dos mais utilizados do mundo até hoje.
   
###    **_Pivô_**

   Primeiramente, o algoritmo escolhe um elemento do array chamado pivô. Existem várias
   maneiras possíveis de se escolher um pivô, podendo ser o primeiro, o último ou o elemento
   central do array. Tal escolha depende do critério do programador ao implementar o código.

###    Ordenação **_crescente_**
      
   Depois de escolhermos o pivô, reorganizamos o array a partir dele, de modo que os elementos
   menores fiquem a sua esquerda e os elementos maiores fiquem a sua direita, caso a ordenação dos
   dados seja crescente.

####    Fim do processo
   Terminando esse processo, o pivô estará em sua posição final e haverá dois subconjuntos de
   arrays não ordenados, um à direita e outro à esquerda do pivô. Depois, de maneira recursiva, o
   algoritmo ordena o subconjunto dos elementos menores e maiores que o pivô, até que o array seja
   ordenado.



