package lect2;

/*

    Задача №8 Максимум двух чисел

    Задание:
    Написать функцию, которая вычисляет максимум из двух чисел.

*/

public class Task8Lect2 {

    public static int maximum(int a, int b) {

        if (a>b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.println( maximum(3,50) );

        System.out.println( maximum(-12,45) );

        System.out.println( maximum(-3,-5) );

    }
}
