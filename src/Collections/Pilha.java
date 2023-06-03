package Collections;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;

/*
A interface Deque (Double Ended Queue)
    representa uma fila de elementos onde é possível adicionar e remover elementos tanto no início quanto no final da
    fila. Isso permite que ela seja usada como uma pilha (estrutura LIFO - Last-In-First-Out) ou uma fila
    (estrutura FIFO - First-In-First-Out), dependendo da forma como os elementos são manipulados.

ArrayDeque
    é uma implementação concreta da interface Deque que utiliza um array redimensionável para armazenar seus elementos.
    Ela fornece acesso rápido tanto ao início quanto ao final da fila, além de oferecer um desempenho eficiente na
    adição e remoção de elementos nas extremidades.

A classe ArrayDeque
    é uma estrutura de dados de tamanho dinâmico, o que significa que ela pode aumentar ou diminuir automaticamente
    sua capacidade à medida que elementos são adicionados ou removidos. Isso é feito internamente pela realocação do
    array subjacente.

    Além dos métodos herdados da interface Deque, como addFirst(), addLast(), removeFirst(), removeLast(), peekFirst(),
    peekLast(), entre outros, ArrayDeque também implementa a interface Queue, permitindo que ela seja usada como uma
    fila convencional.

A principal vantagem de usar ArrayDeque
    em relação a outras implementações de fila, como LinkedList, é seu desempenho superior para operações de adição e
    remoção em ambas as extremidades da fila.


 */


public class Pilha {
    public static void main(String[] args) {

        // EXEMPLO 1
        System.out.println("EXEMPLO 1 \n");
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Elemento 1");
        deque.addLast("Elemento 2");
        deque.addLast("Elemento 3");

        System.out.println(deque.peekFirst()); // Saída: Elemento 1
        System.out.println(deque.peekLast());  // Saída: Elemento 3

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque.peekFirst()); // Saída: Elemento 2

        System.out.println();
        // EXEMPLO 2
        System.out.println("EXEMPLO 2 \n");
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println("Livros da pilha usando Foreach: ");
        for (String li : livros) {
            System.out.println(li);
        }

        System.out.println();

        System.out.println("Exibindo o elemento da frente da pilha: ");
        System.out.println(livros.peek());// Retorna o elemento no topo da pilha sem removê-lo
        System.out.println(livros.element());// Retorna o elemento no topo da pilha sem removê-lo.

        System.out.println("Exibindo e removendo o elemento no top da pilha: ");
        System.out.println(livros.pop());// remove e retorna o elemento no topo da pilha. Este método é equivalente a removeFirst().
        System.out.println(livros.poll()); // Remove o elemento no topo da pilha e o retorna.
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // Retorna null
    //  System.out.println(livros.remove()); // Lança uma Exceção.



    }
}