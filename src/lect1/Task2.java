package lect1;

/*

Задача №2

Напиши программу, которая выводит на экран надпись:
«Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.

*/

public class Task2 {

    public static void repeatTenTimes( String phrase ) {
        for (int i=0; i<10; i++) {
            System.out.println(phrase);
        }
    }

    public static void main( String[] args ) {

        String phrase = "Когда я вырасту, то хочу быть паровым экскаватором!";

        Task2.repeatTenTimes(phrase);

    }
}
