// encoding utf-8
package lect4.Task5;

/*
    Задание 5:
    Написать код, который бы подсчитывал количество созданных
    котов (count) и на экран выдавалось правильно их количество.
*/

class Cat
{
    private static int catsCount = 0;
    public Cat() {
        Cat.catsCount++;
    }

    public static int count() {
        return catsCount;
    }
}

public class Task5Lect4 {

    public static void main(String[] args) throws Exception {

        Cat cat1 = new Cat();
        //написать тут ваш код
        Cat cat2 = new Cat();
        //написать тут ваш код
        System.out.println("Cats count is " + Cat.count());
    }
}