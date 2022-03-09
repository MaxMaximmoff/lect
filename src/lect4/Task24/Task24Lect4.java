package lect4.Task24;

/*
    Задание 24: Посчитать сумму чисел
    Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
    вывести на экран сумму и завершить программу. -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task24Lect4 {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        while(true) {

            System.out.print("Введите число: ");

            String line = bi.readLine();

            try {
                numbers.add(Integer.parseInt(line));
                if(Integer.parseInt(line)==-1) {
                    int sum = 0;
                    for (int i=0; i<numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.printf("Сумма равна: %s", sum);
                    break;
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Вы должны вводить числа!");
                continue;
            }
        }
    }
}
