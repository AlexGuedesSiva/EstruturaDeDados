# **Estruturas De Dados Em JAVA**   

**Estruturas de dados** são utilizadas para organizar e manipular dados de maneira eficiente em um programa. 
Em Java, existem diversas estruturas de dados disponíveis na biblioteca padrão, incluindo arrays, listas, pilhas, filas,
árvores, mapas e conjuntos.



## **Arrays:** 

São estruturas de dados fixas, onde os elementos são acessados por índices. Em Java, os arrays podem 
armazenar tipos primitivos ou objetos.



## **Listas:** 

São estruturas de dados dinâmicas, onde os elementos são organizados em uma sequência.Em Java, as
principais classes de lista são ArrayList e LinkedList.

    

## **Pilhas:** 

São estruturas de dados baseadas em LIFO (Last In, First Out), onde o último elemento adicionado é o
primeiro a ser removido. Em Java, a classe Stack implementa uma pilha.
É possível usar a classe java.util.Stack ou a interface java.util.Deque em conjunto com a classe java.util.LinkedList para implementar uma pilha.

A classe Stack é uma implementação legada de uma pilha em Java. Ela estende a classe Vector e implementa a interface List, fornecendo os métodos comumente usados para operações de pilha, como push, pop, peek e outros. No entanto, é recomendado usar a interface Deque em vez da classe Stack, já que a classe Stack é sincronizada por padrão e tem algumas desvantagens de desempenho.

A interface Deque (Double Ended Queue) é uma interface que estende a interface Queue e define uma fila duplamente terminada, permitindo operações tanto no início quanto no fim da fila. A classe LinkedList implementa a interface Deque e pode ser usada para implementar uma pilha, já que possui os métodos push, pop e peek herdados da interface Deque.

**Filas:** são estruturas de dados baseadas em FIFO (First In, First Out), onde o primeiro elemento adicionado é o
primeiro a ser removido. Em Java, a interface Queue e suas implementações, como LinkedList e PriorityQueue,
são utilizadas para implementar filas. 

**Árvores:** são estruturas de dados hierárquicas, onde cada elemento é um nó que pode ter um ou mais filhos. Em Java,
a classe Tree é uma interface que define a estrutura de uma árvore, enquanto as classes AbstractTree e DefaultTree
implementam a árvore padrão.

**Mapas:** são estruturas de dados que associam uma chave a um valor. Em Java, a interface Map e suas implementações,
como HashMap e TreeMap, são utilizadas para implementar mapas.

**Conjuntos:** são estruturas de dados que armazenam elementos únicos, sem repetição. Em Java, a interface Set e suas
implementações, como HashSet e TreeSet, são utilizadas para implementar conjuntos.