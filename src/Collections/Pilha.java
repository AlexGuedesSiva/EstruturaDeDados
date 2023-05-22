package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Principe");
        livros.push("Don Quixote"); //adiciona um elemento no topo da pilha.
        livros.push("O Hobbit");


        System.out.println("Elemento removido --> " + livros.pop()); // remove e retorna o elemento no topo da pilha
        System.out.println("Elemento no topo --> " + livros.peek());
        System.out.println("Tamanho da pilha " + livros.size());

        System.out.println(livros.peek()); // Retorna null caso vazio
        System.out.println(livros.element()); // Retorna uma exceção caso vazio
        System.out.println(livros.poll());
        System.out.println(livros.poll());
//		System.out.println(livros.pop());
//		System.out.println(livros.remove());

//		livros.size(); retorna o numero de elemetos na pilha
//		livros.clear(); // remove todos elemetos da pilha
//		livros.contains();
//		livros.isEmpty(); verifica se a pilha esta vazia


    }
}