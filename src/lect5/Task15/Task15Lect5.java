package lect5.Task15;

/*
    Задание 15: Вводить с клавиатуры числа и считать их сумму

    Вводить с клавиатуры числа и считать их сумму, пока пользователь
    не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task15Lect5 {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));
        int sum = 0;

        while(true) {

            System.out.print("Введите число: ");

            String line = bi.readLine();

            try {
                if(!line.equals("сумма")){
                    numbers.add(Integer.parseInt(line));
                }
                else if(line.equals("сумма")) {

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
