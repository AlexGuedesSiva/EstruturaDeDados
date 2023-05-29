package Collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> listaAprovados1 = new TreeSet<>();
        Set<String> listaAprovados2 = new HashSet<>();

        listaAprovados1.add("Ana");
        listaAprovados1.add("Carlos");
        listaAprovados1.add("Lucas");
        listaAprovados1.add("Pedro");

        listaAprovados2.addAll(listaAprovados1);

        System.out.println("Lista de Aprovados Ordenado");
        for (String candidato1 : listaAprovados1) {
            System.out.println(candidato1);
        }

        System.out.println();

        System.out.println("Lista de Aprovados Desordenado");
        for (String candidato2 : listaAprovados2) {
            System.out.println(candidato2);
        }
    }
}
