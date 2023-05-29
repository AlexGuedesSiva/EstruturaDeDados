package Collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


/* TreeSet:

   O TreeSet é uma implementação da interface Set que mantém os elementos em ordem crescente ou decrescente.
   Internamente, ele utiliza uma árvore balanceada (geralmente uma árvore rubro-negra) para armazenar os elementos.
   Ao contrário do HashSet, o TreeSet não permite elementos duplicados. As operações básicas de adição, remoção e
   verificação de existência de um elemento têm um tempo de execução médio de O(log n), onde n é o número de elementos
   no conjunto.
   Além disso, o TreeSet fornece métodos adicionais para acessar o primeiro e
   o último elemento, bem como para obter subconjuntos de elementos com base em
   um intervalo.
*/

public class ConjuntoComportado {
    public static void main(String[] args) {

        // Dados Homogenize
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

        System.out.println();
        System.out.println("Conjunto de numeros ordenados com SortedSet");
        SortedSet<Integer> nums = new TreeSet<>();
        nums.add(120);
        nums.add(2);
        nums.add(1);
        nums.add(30);

        for (int n : nums) {
            System.out.println(n);
        }

    }
}


/*
    Resumindo, a diferença principal entre HashSet e TreeSet é que o HashSet armazena os elementos de forma não
    ordenada, enquanto o TreeSet os mantém em uma ordem específica definida pela comparação dos elementos. A escolha
    entre eles depende das necessidades específicas do seu programa: se a ordem dos elementos não importa e você só
    precisa verificar a existência de elementos de forma eficiente, o HashSet é uma escolha adequada. No entanto, se
    você precisa dos elementos em uma ordem específica ou deseja realizar operações como obter o menor ou o maior
    elemento, o TreeSet é mais apropriado.
 */