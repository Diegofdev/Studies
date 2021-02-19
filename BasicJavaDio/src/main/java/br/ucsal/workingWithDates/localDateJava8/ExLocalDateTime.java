package br.ucsal.workingWithDates.localDateJava8;

import java.time.LocalDateTime;


public class ExLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        // 2021-02-15T16:43:36.214413300

        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
        // 2021-02-17T17:43:48.214413300

        System.out.println(futuro);
    }
}
