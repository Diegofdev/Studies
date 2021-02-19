package br.ucsal.workingWithDates.localDateJava8;

import java.time.LocalDate;

public class Exemplo002 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2021-02-15
        System.out.println(ontem);
        // 2021-02-14
    }


}
