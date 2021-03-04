package br.ucsal.collections_e_Streams.set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Sao paulo");
        treeCapitais.add("Rio de janeiro");
        treeCapitais.add("Belo horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo da arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);
    }
}
