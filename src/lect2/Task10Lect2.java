package lect2;

/*

    Задача №10 Минимум четырёх чисел

    Задание:
    Написать функцию, которая вычисляет минимум из четырёх чисел.
    Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)

*/

public class Task10Lect2 {

    public static int min(int a, int b) {

        if (a<b) {
            return a;
        } else {
            return b;
        }

    }

    public static int min(int a, int b, int c, int d) {

        if ((min(a,b))<c && (min(a,b))< d ) {
            return min (a,b);
        } else if (c<d) {
            return c;
        }else return d;
    }

    public static void main(String[] args) throws Exception

    {

        System.out.println( min(-200, -1, -80, 0) );

        System.out.println( min(0, -10, 1, 2) );

    }
}
