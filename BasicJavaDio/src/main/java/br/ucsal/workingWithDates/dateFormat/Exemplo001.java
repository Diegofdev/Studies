package br.ucsal.workingWithDates.dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        //2/15/21, 4:19 PM

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        //February 15, 2021, 4:19 PM

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        //February 15, 2021 at 4:19:29 PM BRT

    }
}
