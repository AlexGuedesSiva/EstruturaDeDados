package Collections;


import java.util.ArrayList;
import java.util.List;

public class ArrayLista {
    public static void main(String[] args) {

        List<String> persons = new ArrayList<>();

        persons.add("Peter Parker");
        persons.add("Tia Mei");
        persons.add("Harry Osborn");
        persons.add("Miles Morales");

        System.out.print("Mostra o nome gravado no index 0: ");
        System.out.println(persons.get(0));

        System.out.print("Mostra o tamanho da lista: ");
        System.out.println(persons.size());

        System.out.print("verificar se a lista esta vazia: ");
        System.out.println(persons.isEmpty());

        System.out.println("adicionar elemento na lista no index 4: ");
        System.out.println(persons.set(3,"Norman Osborn"));

        System.out.println("Mostrar todos os elementos da lista com for: ");
        for(int i = 0; i < persons.size(); i++) {
            String nome = persons.get(i);
            System.out.println(nome);
        }

        System.out.print("Adicionar mais um elemento a lista no index: ");
        System.out.println(persons.add("Gwen Stacy"));

        System.out.println("Mostrar todos os elemtos da lista com Foreach: ");
        for(String person : persons) {
            System.out.println(person);
        }

        System.out.println("Mostrar o tamanho da lista: " + persons.size());

        System.out.println("Remover o elementos da lista no index 0: " + persons.remove(0));

        System.out.println("Remover todos os elementos da lista: ");
        persons.clear();

        System.out.println("Verificar se a lista esta vazia: " + persons.isEmpty());
    }
}
