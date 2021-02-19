package br.ucsal.collections_e_Streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploList2 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();     // Cria a lista


        nomes.add("Carlos");        // Adiciona Strings na lista
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes + "\n");

        for (String nomeDoItem: nomes) {        // Percorre toda a lista
            System.out.println(">" + nomeDoItem);

        }

        System.out.println("\n");

        Iterator<String> iterator = nomes.iterator();        // Percorre a lista
        while  (iterator.hasNext()) {
            System.out.println(">>" + iterator.next());

        }

    }
}
