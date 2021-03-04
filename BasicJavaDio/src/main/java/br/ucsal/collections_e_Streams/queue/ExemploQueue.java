package br.ucsal.collections_e_Streams.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();      //Retorna primeiro elemento da fila e o remove

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();      //Retorna primeiro elemento da fila sem remover

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();     //Retorna primeiro elemento da fila ou lança uma exception ( erro ) caso esteja vazia

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client);
            
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()){
            System.out.println(">>>" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

    }
}
