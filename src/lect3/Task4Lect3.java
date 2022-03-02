package lect3;

/*

    Задача №4 Произведение 10 чисел

    Задание:
    Вывести на экран произведение чисел от 1 до 10.
    Подсказка: будет три миллиона с хвостиком

*/

public class Task4Lect3 {

    public static void main(String[] args) {

        int product = 1;

        for (int i=1; i<11; i++) {
            product *= i;
        }

        System.out.println(product);

    }

}
