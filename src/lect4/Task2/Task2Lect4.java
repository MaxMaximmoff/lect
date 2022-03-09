// encoding utf-8
package lect4.Task2;

/*
    Задание 2:
    Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
    количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

class Cat
{
    private static int catsCount = 0;
    public static void addNewCat() {
        //написать тут ваш код
        catsCount += 1;
    }
    public static int getCatsCount()
    {
        return catsCount;
    }
}

public class Task2Lect4 {

    public static void main(String[] args) throws Exception {

        Cat cat1 = new Cat();
        cat1.addNewCat();
        cat1.addNewCat();
        System.out.println("Количество котов = " + Cat.getCatsCount());
    }
}
