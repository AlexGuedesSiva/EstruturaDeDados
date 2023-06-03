package Collections;

import java.util.HashSet;
import java.util.Objects;

public class Hash {
    public static void main(String[] args) {

        HashSet<UsuarioHash> usuarios = new HashSet<>();

        usuarios.add(new UsuarioHash("Frodo"));
        usuarios.add(new UsuarioHash("Bilbo Bolseiro"));
        usuarios.add(new UsuarioHash("Gandalf"));

        System.out.println(usuarios.contains(new UsuarioHash("Frodo")));
    }
}



class UsuarioHash {

    String nome;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public UsuarioHash(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioHash usuario = (UsuarioHash) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}