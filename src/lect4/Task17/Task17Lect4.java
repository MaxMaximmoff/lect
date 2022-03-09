// encoding utf-8
package lect4.Task17;

/*
    Задание 17: Четные числа

    Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    Через пробел либо с новой строки.
*/

public class Task17Lect4 {

    public static void main(String[] args) throws Exception {

        for(int i=1; i<101; i++){
            if(i%2==0) System.out.print(i + " ");
        }
    }
}
