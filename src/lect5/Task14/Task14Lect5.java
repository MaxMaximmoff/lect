package lect5.Task14;

/*
    Задание 14: Вывести на экран сегодняшнюю дату

    Вывести на экран текущую дату в аналогичном виде «21 06 2015».
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task14Lect5 {

    public static void main(String[] args) {

        Date dateNow = new Date();
//        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM yyyy");

        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));

    }
}
