// encoding utf-8
package lect4.Task20;

/*
    Задание 20: Рисуем линии

    Используя цикл for вывести на экран:
    - горизонтальную линию из 10 восьмёрок
    - вертикальную линию из 10 восьмёрок.
*/

public class Task20Lect4 {

    public static void main(String[] args) throws Exception {

        for(int col=0; col<10; col++){
            System.out.print("8");
        }
        System.out.println();

        for(int row=0; row<10; row++){

            System.out.println("8");
        }
    }
}
