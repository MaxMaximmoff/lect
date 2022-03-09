// encoding utf-8
package lect4.Task10;

/*
    Задание 10: 18+
    Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10Lect4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Введите ваше имя: ");
        String name = bi.readLine();

        while (true) {
            try {
                System.out.print("Введите ваш возраст: ");
                String age = bi.readLine();
                if (Integer.parseInt(age)<18) {
                    System.out.printf("%s подрасти ещё!", name, age);
                }
                else {
                    System.out.println("Welcome!");
                }
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Вы должны ввести число!");
                continue;
            }
        }
    }
}
