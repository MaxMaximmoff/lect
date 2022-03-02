package lect2;

/*

    Задача №11 Дублирование строки

    Задание:
    Написать функцию, которая выводит переданную строку на
    экран три раза, каждый раз с новой строки.

*/

public class Task11Lect2 {

    public static void repeatThreeTimes( String phrase) {
        for (int i=0; i<3; i++) {
            System.out.println(phrase);
        }
    }

    public static void main(String[] args) {

        repeatThreeTimes("Hello!");

    }
}
