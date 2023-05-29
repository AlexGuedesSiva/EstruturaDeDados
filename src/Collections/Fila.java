package Collections;

import java.util.LinkedList;
import java.util.Queue;

/*
Collection Queue:
    A interface Collection Queue representa uma estrutura de dados do tipo fila (queue) em Java. Uma fila é uma coleção
    ordenada de elementos que segue o princípio FIFO (First-In-First-Out), o que significa que o primeiro elemento
    adicionado à fila será o primeiro a ser removido. A interface Collection Queue estende a interface Collection e
    adiciona métodos específicos para manipular filas.

Principais métodos da interface Collection Queue:

    add(elemento): Adiciona um elemento à fila. Se não for possível adicionar o elemento, uma exceção é lançada.
    offer(elemento): Adiciona um elemento à fila. Retorna true se o elemento foi adicionado com sucesso, ou false caso
    contrário.
    remove(): Remove o elemento da frente da fila e o retorna. Se a fila estiver vazia, uma exceção é lançada.
    poll(): Remove o elemento da frente da fila e o retorna. Retorna null se a fila estiver vazia.
    element(): Retorna o elemento da frente da fila sem removê-lo. Se a fila estiver vazia, uma exceção é lançada.
    peek(): Retorna o elemento da frente da fila sem removê-lo. Retorna null se a fila estiver vazia.

 */


public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Sara"); // Lança uma Exceção.
        fila.offer("Levi"); // Retorna Null
        fila.offer("Isaque");
        fila.offer("Daniel");
        fila.offer("Lea");
        fila.offer("Raquel");
        fila.offer("José");


        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.element()); // Lança uma Exceção.

        System.out.println(fila.size());// Retorna Tamanho da fila
//        fila.clear(); // Limpar a fila.
//        System.out.println(fila.isEmpty()); // Retorna Sempre True, pois fila esta vazia.

        System.out.println(fila.poll());// Retorna o first elemento e remove.
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // Lança uma Exceção.
        System.out.println(fila.poll()); // Retorna Null, se a fila estiver vazia


    }
}
