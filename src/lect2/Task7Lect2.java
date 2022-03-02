package lect2;

/*

    Задача №7 Минимум двух чисел

    Задание:
    Написать функцию, которая возвращает минимум из двух чисел.

*/

public class Task7Lect2 {

    public static int minimum(int a, int b) {

        if (a<b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.println( minimum(3,50) );

        System.out.println( minimum(-12,45) );

        System.out.println( minimum(-3,-5) );

    }

}
