package lect3;

/*
    Задача №13 Скромность украшает человека

    Задание:
    Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!

    Пример:
    Тимур зарабатывает $5,000. Ха-ха-ха!

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task13Lect3 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: ");
        String name = reader.readLine();
        System.out.print("Введите сумму: ");
        String num = reader.readLine();
        Double number = Double.parseDouble(num);

        System.out.println(name + " зарабатывает $" + number + ". Ха-ха-ха!");
    }
}
