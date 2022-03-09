package lect4.Task23;

/*
    Задание 23: Среднее такое среднее
    Ввести с клавиатуры три числа, вывести на экран среднее из них,
    т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task23Lect4 {

    public static void main(String[] args) throws Exception {

        int[] number = new int[3];

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        String[] strNums;

        while(true) {

            System.out.print("Введите три целых числа через пробел: ");

            strNums = bi.readLine().split(" ");

            try {
                for (int i = 0; i < 3 || i <strNums.length; i++) {
                    number[i] = Integer.parseInt(strNums[i]);
                } if(number[0] > number[1] && number[0] < number[2])
                {
                    System.out.println("Среднее число - " + number[0]);
                } else if(number[1] > number[0] && number[1] < number[2])
                {
                    System.out.println("Среднее число - " + number[1]);
                } else
                    System.out.println("Среднее число - " + number[2]);

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
