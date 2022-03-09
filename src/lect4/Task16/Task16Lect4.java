// encoding utf-8
package lect4.Task16;

/*
    Задание 16: Таблица умноження

Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.

Example output:
1	2	3	4	5	6	7	8	9	10
2	4	6	8	10	12	14	16	18	20
3	6	9	12	15	18	21	24	27	30
...
*/

public class Task16Lect4 {

    public static void main(String[] args) throws Exception {

        int row = 0;
        int col = 0;
        while (row++<10){
            while (col++<10){
                System.out.printf(  "%2s ", row * col );
            }
            row=0;
            System.out.println();
        }
    }
}
