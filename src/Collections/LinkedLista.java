package Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLista {

    public static void main(String[] args) {

        List<Double> linkedList = new LinkedList<>();

        //Criando uma lista de notas a serem inseridas no linkedList
        List<Double> notas = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 10.0);

        linkedList.addAll(notas);

        System.out.println(linkedList);

        linkedList.add(7.0);
        linkedList.add(8.0);
        linkedList.add(9.0);

        System.out.println(linkedList);

        Iterator<Double> iterator1 = linkedList.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(linkedList);

    }
}
