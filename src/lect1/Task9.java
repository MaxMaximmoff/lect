package lect1;

/*

    Задача №9

    Задание:
    Напиши программу, которая выводит на экран надпись:
    «Слава Роботам! Убить всех человеков!» 16 раз.

*/

public class Task9 {

    public static void repeatPhrase( String phrase, int n ) {
        for (int i=0; i<n; i++) {
            System.out.println(phrase);
        }
    }

    public static void main( String[] args ) {

        String phrase = "Слава Роботам! Убить всех человеков!";

        int n = 16; // Количество повторений

        repeatPhrase(phrase, n);

    }
}
