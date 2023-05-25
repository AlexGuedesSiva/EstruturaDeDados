# O que é Collections Framework?

Collections Framework é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection. A Collections Framework contém os seguintes elementos:

* **Interfaces:** tipos abstratos que representam as coleções. Permitem que coleções sejam manipuladas tendo como base o conceito “Programar para interfaces e não para implementações”, desde que o acesso aos objetos se restrinja apenas ao uso de métodos definidos nas interfaces;
* **Implementações:** são as implementações concretas das interfaces;
* **Algoritmos:** são os métodos que realizam as operações sobre os objetos das coleções, tais como busca e ordenação.

## Interfaces

Neste momento vamos apresentar uma breve descrição de cada uma das interfaces da hierarquia:

* **Collection** – está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
* **Set** – interface que define uma coleção que não permite elementos duplicados. A interface SortedSet, que estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética;
* **List** – define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento;
  A diferença fundamental entre ArrayList e LinkedList em Java é a forma como os elementos são armazenados e acessados internamente.

ArrayList:

Internamente, ArrayList é implementado como um array redimensionável. Ele aloca uma área contígua de memória para armazenar os elementos.
Permite acesso rápido aos elementos por meio de índices, o que significa que o acesso a um elemento específico é eficiente.
A inserção e remoção de elementos no final da lista (add e remove) são rápidas, pois não requerem reorganização dos elementos.
No entanto, a inserção e remoção de elementos em posições intermediárias podem ser mais lentas, pois requerem a reorganização dos elementos subsequentes.
LinkedList:

Internamente, LinkedList é implementado como uma lista duplamente encadeada, onde cada elemento (nó) possui uma referência para o elemento anterior e o próximo.
O acesso aos elementos por meio de índices é menos eficiente, pois a lista precisa ser percorrida sequencialmente até o elemento desejado.
A inserção e remoção de elementos em qualquer posição da lista são rápidas, pois envolvem apenas a atualização das referências nos nós adjacentes.
Além disso, LinkedList oferece algumas operações específicas, como adicionar ou remover elementos no início ou final da lista de forma eficiente.
Em resumo, as principais diferenças entre ArrayList e LinkedList são:

ArrayList é mais eficiente para acesso aleatório (por índice) e para operações no final da lista.
LinkedList é mais eficiente para inserção e remoção em posições intermediárias e para manipulação do início e final da lista.
A escolha entre ArrayList e LinkedList depende do tipo de operações que você realizará com mais frequência na sua aplicação.


* **Queue** – um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface fila pode-se criar filas e pilhas;
* **Map** – mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe Properties, que é usada para persistir propriedades/configurações de um sistema, por exemplo.
*  **Deque** - (Double Ended Queue) em Java representa uma fila de elementos onde tanto o início quanto o fim da fila podem ser usados para inserção e remoção de elementos. Ela estende a interface Queue e define métodos adicionais para operações de inserção, remoção e acesso a elementos tanto no início quanto no fim da fila.