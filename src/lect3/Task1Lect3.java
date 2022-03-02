package lect3;

/*

    Задача №1 Дата рождения

    Задание:
    Вывести на экран дату своего рождения в виде: MAY 1 2012

*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task1Lect3 {

    public static void main(String[] args) {
        String months[] = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER"};
        GregorianCalendar calendar = new GregorianCalendar(1974, Calendar.SEPTEMBER , 2);

        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(" " + calendar.get(Calendar.YEAR));

    }

}
