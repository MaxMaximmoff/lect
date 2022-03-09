// encoding utf-8
package lect4.Task18;

/*
    Задание 18: Рисуем прямоугольник

    Ввести с клавиатуры два числа m и n.
    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

    Пример: m=2, n=4
    8888
    8888
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task18Lect4 {

    public static void main(String[] args) throws Exception {

        Integer[] numbers = new Integer[2];

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        int m, n;

        while(true) {
            try {
                System.out.print("Введите число m: ");
                String rowCount = bi.readLine();
                m = Integer.parseInt(rowCount);
                System.out.print("Введите число n: ");
                String colCount = bi.readLine();
                n = Integer.parseInt(colCount);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Вы должны вводить числа!");
                continue;
            }
        }

        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
