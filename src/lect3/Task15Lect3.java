package lect3;

/*
    Задача №13 Чистая любовь

    Задание:
    Ввести с клавиатуры три имени, вывести на экран
    надпись name1 + name2 + name3 = Чистая любовь, да-да!

    Пример:
    Вася + Ева + Анжелика = Чистая любовь, да-да!

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task15Lect3 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: ");
        String name1 = reader.readLine();
        System.out.print("Введите имя: ");
        String name2 = reader.readLine();
        System.out.print("Введите имя: ");
        String name3 = reader.readLine();
        System.out.println();


        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
