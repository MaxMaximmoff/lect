// encoding utf-8
package lect4.Task6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Задание 6: Минимум двух чисел

    Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

public class Task6Lect4 {

    public static void main(String[] args) throws Exception {

        int[] number = new int[2];

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        String[] strNums;

        while(true) {

            System.out.print("Введите два целых числа через пробел: ");

            strNums = bi.readLine().split(" ");

            try {
                for (int i = 0; i < 2 || i <strNums.length; i++) {
                    number[i] = Integer.parseInt(strNums[i]);
                }
                if(number[0]<number[1]) System.out.println("Минимальное число - " + number[0]);
                else System.out.println("Минимальное число - " + number[1]);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Вы должны вводить числа!");
                continue;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Должно быть два числа с пробелом между ними!");
                continue;
            }
        }
    }

}