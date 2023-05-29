package Collections;

import java.util.ArrayList;
import java.util.Objects;

/*
ArrayList:
    ArrayList é uma classe que implementa uma lista redimensionável usando um array interno. Ele armazena os elementos
    em uma sequência ordenada, permitindo acesso rápido por índices. É eficiente para acesso e pesquisa de elementos em
    qualquer posição, mas menos eficiente para inserções e remoções frequentes no meio da lista. Ao adicionar elementos,
    o ArrayList aumenta automaticamente seu tamanho conforme necessário para acomodar novos elementos. O acesso aos
    elementos por índices é rápido, pois o ArrayList calcula a posição diretamente usando o índice. O tempo de busca
    linear (O(n)) é necessário para pesquisar um elemento, pois todos os elementos precisam ser verificados até
    encontrar uma correspondência. O ArrayList é adequado para cenários em que a prioridade é o acesso rápido aos
    elementos por índices e o número de inserções/remoções no meio da lista é limitado.
 */

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));// Consegue acessar pelo indice

        System.out.println("Remove o usuario " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));


        System.out.println("Tem ?? " + lista.contains(new Usuario("Lia")));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }


    }
}


class Usuario {

    String nome;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}