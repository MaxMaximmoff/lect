// encoding utf-8
package lect4.Task19;

/*
    Задание 19: Рисуем треугольник

    Используя цикл for вывести на экран прямоугольный
    треугольник из восьмёрок со сторонами 10 и 10.

    Пример:
    8
    88
    888
    ...
*/

public class Task19Lect4 {

    public static void main(String[] args) throws Exception {

        for(int row=0; row<10; row++){
            for(int col=0; col<row+1; col++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
