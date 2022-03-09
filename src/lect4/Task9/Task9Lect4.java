// encoding utf-8
package lect4.Task9;

/*
    Задание 9: Сравнить имена
    Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9Lect4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Введите первое имя: ");
        String name1 = bi.readLine();
        System.out.print("Введите второе имя: ");
        String name2 = bi.readLine();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        }
        else if (!name1.equals(name2) && name1.length()==name2.length()) {
            System.out.println("Длины имен равны");
        }
        else {
            System.out.println("Имена не идентичны и длины имен не равны");
        }

    }
}