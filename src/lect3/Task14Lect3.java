package lect3;

/*
    Задача №14 Спонсор - это звучит гордо

    Задание:
    Ввести с клавиатуры два имени и вывести надпись:
    name1 проспонсировал name2, и она стала известной певицей.

    Пример:
    Коля проспонсировал Лену, и она стала известной певицей.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task14Lect3 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя спонсора: ");
        String name1 = reader.readLine();
        System.out.print("Введите имя певицы: ");
        String name2 = reader.readLine();
        System.out.println();

        System.out.println(name1 + " проспонсировал " + name2 +", и она стала известной певицей.");
    }

}
