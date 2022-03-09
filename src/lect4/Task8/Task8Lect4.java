// encoding utf-8
package lect4.Task8;

/*
    Задание 8: Сортировка трех чисел

    Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Task8Lect4 {

    public static void main(String[] args) throws Exception {

        Integer[] numbers = new Integer[3];

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        String[] strNums;

        while(true) {

            System.out.print("Введите три целых числа через пробел: ");

            strNums = bi.readLine().split(" ");

            try {
                for (int i = 0; i < 3 || i <strNums.length; i++) {
                    numbers[i] = Integer.parseInt(strNums[i]);
                }
                //Сортируем массив
                Arrays.sort(numbers, Collections.reverseOrder());
                //Выводим отсортированный массив на консоль.
                for(int i = 0; i <  numbers.length; i++) {
                    System.out.print(numbers[i] + "  ");
                }
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Вы должны вводить числа!");
                continue;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Должно быть три числа с пробелом между ними!");
                continue;
            }
        }
    }

}