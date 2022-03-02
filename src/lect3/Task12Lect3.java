package lect3;

/*

    Задача №12 Зарплата через 5 лет

    Задание:
    Ввести с клавиатуры отдельно Имя, число1, число2.
    Вывести надпись: «Имя» получает «число1» через «число2» лет.

    Пример:
    Коля получает 3000 через 5 лет.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task12Lect3 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: ");
        String name = reader.readLine();
        System.out.print("Введите сумму: ");
        String number1 = reader.readLine();
        int number_1 = Integer.parseInt(number1);
        System.out.print("Введите период: ");
        String number2 = reader.readLine();
        int number_2 = Integer.parseInt(number2);
        System.out.println(name + " получает " + number_1 + " через " + number_2 + " лет.");
    }

}
