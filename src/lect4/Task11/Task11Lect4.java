// encoding utf-8
package lect4.Task11;

/*
    Задание 11: И 18-ти достаточно
    Ввести с клавиатуры имя и возраст.
    Если возраст больше 20 вывести надпись «И 18-ти достаточно»
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11Lect4 {

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
                } else if (Integer.parseInt(age) > 20) {
                    System.out.println("И 18-ти достаточно! Welcome!");
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
