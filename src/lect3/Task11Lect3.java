package lect3;

import java.io.*;

/*

    Задача №11 Как захватить мир

    Задание:
    Ввести с клавиатуры число и имя, вывести на экран строку:
    «имя» захватит мир через «число» лет. Му-ха-ха!
    ( Последовательность вводимых данных имеет большое значение.)

    Пример:
    Вася захватит мир через 8 лет. Му-ха-ха!

*/

public class Task11Lect3 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите период захвата: ");
        String per = reader.readLine();
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        int period = Integer.parseInt(per);
        System.out.println(name + " захватит мир через " + period + " лет. Му-ха-ха!");
    }
}
