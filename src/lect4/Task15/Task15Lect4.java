// encoding utf-8
package lect4.Task15;

/*
    Задание 15: S-квадрат

    Вывести на экран квадрат из 10х10 букв S используя цикл while.
    Буквы в каждой строке не разделять.
*/

public class Task15Lect4 {

    public static void main(String[] args) throws Exception {

        int i = 0;
        int j = 0;
        while (i++<10){
            while (j++<10){
                System.out.print("S");
            }
            j=0;
            System.out.println();
        }
    }
}
