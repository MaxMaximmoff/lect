// encoding utf-8
package lect4.Task7;

/*
    Задание 7: Максимум четырех чисел

    Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task7Lect4 {

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

    public static void main(String[] args) throws Exception {

        int[] number = new int[4];

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        String[] strNums;

        while(true) {

            System.out.print("Введите четыре целых числа через пробел: ");

            strNums = bi.readLine().split(" ");

            try {
                for (int i = 0; i < 4 || i <strNums.length; i++) {
                    number[i] = Integer.parseInt(strNums[i]);
                }
                int min = min(number[0], number[1], number[2], number[3]);
                System.out.println("Минимальное число: " + min);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Вы должны вводить числа!");
                continue;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Должно быть четыре числа с пробелом между ними!");
                continue;
            }
        }
    }

}