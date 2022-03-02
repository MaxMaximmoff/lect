package lect2;

/*

    Задача №9 Минимум трёх чисел

    Задание:
    Написать функцию, которая вычисляет минимум из трёх чисел.

*/

public class Task9Lect2 {

    public static int minimum(int a, int b, int c) {
        int [] set = {a, b, c};

        int min = set[0];

        for (int i=0; i<3; i++) {
            if (set[i]<min) {
                min = set[i];
            }
        }

        return min;
    }

    public static void main(String[] args) throws Exception {

        System.out.println( minimum(4,8,0) );

        System.out.println( minimum(-11,-2,9) );

        System.out.println( minimum(5,55,5) );

    }

}
