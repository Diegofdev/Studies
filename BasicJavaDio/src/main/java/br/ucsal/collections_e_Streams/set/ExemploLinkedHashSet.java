package br.ucsal.collections_e_Streams.set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        // Remove o numero do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        //retorna a quantidade de itens do set

        System.out.println(sequenciaNumerica.size());


    }
}
