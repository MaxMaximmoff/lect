package lect4.Task25;

/*
    Задание 25: Меня зовут 'Вася'...
    Ввести с клавиатуры строку name.
    Ввести с клавиатуры дату рождения (три числа): y, m, d.
    Вывести на экран текст:
    «Меня зовут name
    Я родился d.m.y»
    Пример:
    Меня зовут Вася
    Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task25Lect4 {

    public static void main(String[] args) throws Exception {

        int[] date = new int[3];
        int y, m, d; // год, месяц, число месяца рождения

        BufferedReader b1 = new BufferedReader(
                new InputStreamReader(System.in));

//        BufferedReader b2 = new BufferedReader(
//                new InputStreamReader(System.in));

        String[] strNums;

        System.out.print("Введите имя: ");

        String name = b1.readLine();

        while(true) {

            System.out.print("Введите дату рождения (три числа y, m, d через пробел): ");

            strNums = b1.readLine().split(" ");

            try {
                for (int i = 0; i < 3 || i <strNums.length; i++) {
                    date[i] = Integer.parseInt(strNums[i]);
                }

                if(1822 > date[0] || date[0] > 2022)
                {
                    System.out.println("Введите валидный год рождения!");
                    continue;
                }
                else if(0 > date[1] || date[1] > 12)
                {
                    System.out.println("Введите валидный месяц рождения!");
                    continue;
                }
                else if(0 > date[2] || date[2] > 31){
                    System.out.println("Введите валидный день месяца рождения!");
                    continue;
                }
                y = date[0];
                m = date[1];
                d = date[2];

                System.out.printf("Меня зовут %s\n", name);
                System.out.printf("Я родился %s.%s.%s \n", d, m, y);

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
