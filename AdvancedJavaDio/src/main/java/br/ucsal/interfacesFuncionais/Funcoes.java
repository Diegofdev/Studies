package br.ucsal.interfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {

        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroVezesDois = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("Joao"));
        System.out.println(converterStringParaInteiroVezesDois.apply("20"));
    }
}
