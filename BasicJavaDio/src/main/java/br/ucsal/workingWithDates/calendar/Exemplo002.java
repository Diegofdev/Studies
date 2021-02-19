package br.ucsal.workingWithDates.calendar;

import java.util.Calendar;

public class Exemplo002 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Mon Feb 15 16:09:44 BRT 2021
        System.out.printf("%tF\n", agora);
        //2021-02-15
        System.out.printf("%tD\n", agora);
        //02/15/21
        System.out.printf("%tr\n", agora);
        //04:09:44 PM
        System.out.printf("%tT\n", agora);
        //16:09:44
    }
}
