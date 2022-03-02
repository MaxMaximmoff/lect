package lect3;

/*

    Задача №5 Сумма 10 чисел

    Задание:
    Вывести на экран сумму чисел от 1 до 10 построчно:
    1
    1+2=3
    1+2+3=6
    1+2+3+4=10
    …
    Пример вывода:
    1
    3
    6
    10
    …

*/

public class Task5Lect3 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i=1; i<11; i++) {
            sum += i;
            System.out.println(sum);
        }

    }

}
