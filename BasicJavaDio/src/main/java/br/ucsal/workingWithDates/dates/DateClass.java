package br.ucsal.workingWithDates.dates;

import java.util.Date;

public class DateClass {

    public static void dataComum (){
        Date novaData = new Date();
        System.out.println(novaData);

        //retorna: Mon Feb 15 15:00:12 BRT 2021
    }

    public static void dataMilissegundos (){
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1613413234604

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Mon Feb 15 15:20:34 BRT 2021
    }


    public static void main(String[] args) {

        //dataComum();
        dataMilissegundos();



    }
}
