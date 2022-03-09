// encoding utf-8
package lect4.Task21;

/*
    Задание 21: Все любят Мамбу
    Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    Пример текста:
    Света любит меня.
    Света любит меня.
    …
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task21Lect4 {

    public static void main(String[] args) throws IOException {

        try{
            BufferedReader bi = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.print("Введите имя: ");
            String name = bi.readLine();

            for(int col=0; col<10; col++){
                System.out.printf("%s любит меня.\n", name);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
