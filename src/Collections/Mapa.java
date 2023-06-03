package Collections;

import java.util.HashMap;
import java.util.Map;
/*

Em Java, a classe Map é uma interface que define um tipo de coleção que armazena pares de chave-valor.
É uma implementação da estrutura de dados conhecida como dicionário, mapa ou tabela de hash.

Principais características e funcionalidades do Map em Java:

Pares chave-valor: O Map armazena elementos em pares chave-valor, onde cada chave é única e mapeada para um único
valor. Isso significa que cada chave no Map corresponde a apenas um valor.

Não ordenado: A implementação padrão mais comum do Map em Java é a HashMap, que não garante nenhuma ordem
específica dos elementos. Se você precisar de uma ordem específica, pode usar a implementação LinkedHashMap,
que mantém a ordem de inserção, ou TreeMap, que mantém a ordem natural das chaves.

Manipulação de elementos: O Map oferece métodos para adicionar, remover e atualizar elementos. Alguns métodos
importantes incluem put(chave, valor) para adicionar um par chave-valor, get(chave) para obter o valor associado a
uma chave, remove(chave) para remover um elemento pelo seu chave e containsKey(chave) para verificar se uma chave
está presente no Map.

Tamanho e vazio: É possível verificar o número de elementos no Map usando o método size(). O método isEmpty()
retorna true se o Map estiver vazio, ou seja, não contiver nenhum par chave-valor.

Iteração: O Map permite percorrer seus elementos usando iteração. Por exemplo, você pode usar um laço for-each para
 percorrer todas as chaves ou valores do Map, ou obter uma coleção de todas as chaves usando o método keySet().

Implementações alternativas: Além das implementações mencionadas acima (HashMap, LinkedHashMap e TreeMap), a classe
Map em Java possui outras implementações, como Hashtable (semelhante a HashMap, mas sincronizada) e ConcurrentHashMap
(otimizada para operações concorrentes).

Em resumo, a classe Map em Java fornece uma estrutura de dados flexível para armazenar e manipular pares chave-valor.
Ela é amplamente utilizada em muitos cenários de programação para mapear e recuperar valores com base em chaves.
 */


public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Yoda");
        usuarios.put(50, "Lea");
        usuarios.put(30, "Luke");
        usuarios.put(40, "Dart Vader");

        System.out.print("Tamanho do Mapa: ");
        System.out.println(usuarios.size());
        System.out.print("Verificar se esta vazio: ");
        System.out.println(usuarios.isEmpty());

        System.out.print("imprimir as chave do map: ");
        System.out.print(usuarios.keySet() + " \n");
        System.out.print("Verificar os valores do map: ");
        System.out.println(usuarios.values());
        System.out.print("Imprimir as chaves e valores do map: ");
        System.out.println(usuarios.entrySet());

        System.out.print("Verificar se tem a chave 30: ");
        System.out.println(usuarios.containsKey(30));
        System.out.print("Verificar se tem o valor Yoda: ");
        System.out.println(usuarios.containsValue("Yoda"));

        System.out.print("Imprimir a chave 20: ");
        System.out.println(usuarios.get(20));
        System.out.print("Imprimir a chave 1: ");
        System.out.println(usuarios.get(1));

        System.out.print("Remover usuario na chave 1: ");
        System.out.println(usuarios.remove(1));
        System.out.print("Remover usuario na chave 4 de valor Gui: ");
        System.out.println(usuarios.remove(4, "Gui"));

        System.out.println("Percorrer o Map com for e exibir as chaves: ");
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        System.out.println("Percorrer o map com for e exibir os valores: ");
        for (String value : usuarios.values()) {
            System.out.println(value);
        }

        System.out.println("Percorrer o map com Entry e exibir: ");
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + " --> ");
            System.out.println(registro.getValue());
        }


    }
}
