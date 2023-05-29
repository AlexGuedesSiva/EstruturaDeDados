package Collections;

import java.util.HashSet;
import java.util.Set;

/*
HashSet:
    O HashSet é uma implementação da interface Set na estrutura de dados hash table. Ele armazena elementos de forma
    não ordenada e não permite elementos duplicados. O tempo de execução das operações básicas, como adicionar, remover
    e verificar a existência de um elemento, é constante, desde que não haja colisões de hash. No entanto, a ordem dos
    elementos não é garantida, pois depende da função de hash dos elementos.
 */

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();


        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste");
        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove('X'));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
