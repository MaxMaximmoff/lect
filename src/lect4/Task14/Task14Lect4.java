// encoding utf-8
package lect4.Task14;

/*
    Задание 14: Хорошего не бывает много
    Ввести с клавиатуры строку и число N.
    Вывести на экран строку N раз, используя цикл while.
    Пример ввода:
    абв
    2
    Пример вывода:
    абв
    абв
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task14Lect4 {

    public static void main(String[] args) throws Exception {

        int n; // количество повторений

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Введите строку: ");
        String str = bi.readLine();

        while (true) {
            try {
                System.out.print("Введите количество повторений: ");
                String count = bi.readLine();
                n = Integer.parseInt(count);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы должны ввести число!");
                continue;
            }
        }

        while (n>0){
            System.out.println(str);
            n--;
        }
    }
}
