package br.ucsal.collections_e_Streams.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();     // Cria a lista


        nomes.add("Carlos");        // Adiciona Strings na lista
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");        // Troca o valor da String na posição escolhida pela string digitada

        System.out.println(nomes);

        Collections.sort(nomes);        // Arruma a lista em ordem alfabética

        System.out.println(nomes);

        nomes.remove(3);        //Remove o elemento no indice de posição escolhido

        System.out.println(nomes);

        nomes.remove("Maria");      //Remove um elemento de valor digitado

        System.out.println(nomes);

        String nome = nomes.get(1);     //Atribui o elemento na posição escolhida a variavel nome
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");       //Verifica se elemento existe na lista
        System.out.println(temAnderson);

        int posicao = nomes.indexOf("Carlos");      // Retorna a posição do elemento na lista ou retorna " -1 " caso elemento não exista na lista
        System.out.println(posicao);

        nomes.clear();      // Limpa a lista

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);





    }
}
