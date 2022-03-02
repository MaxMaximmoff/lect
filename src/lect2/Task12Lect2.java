package lect2;

/*

    Задача №12 Вывод текста на экран

    Задание:
    Написать функцию, которая выводит переданную строку (слово) на экран три раза,
    но в одной строке. Слова должны быть разделены пробелом и не должны сливаться в одно.

*/

public class Task12Lect2 {

    public static void repeatThreeTimes( String phrase) {
        String out = "";
        for (int i=0; i<3; i++) {
            out += phrase + " ";
        }

        System.out.println(out.trim());
    }

    public static void main(String[] args) {

        repeatThreeTimes("Hello!");

    }

}
