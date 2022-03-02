package lect3;

/*

    Задача №7 Таблица умножения

    Задание:
    Выведи на экран таблицу умножения 10 на 10 в следующем виде:
    1 2 3 …
    2 4 6 …
    3 6 9 …
    …

*/

public class Task7Lect3 {

    public static void main(String[] args) {

        for(int row = 1; row <= 10; row++){
            for(int col = 1; col <= 10; col++){
                System.out.printf(  "%2s ", row * col );
            }
            System.out.println();
        }
    }

}
