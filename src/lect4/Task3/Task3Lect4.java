// encoding utf-8
package lect4.Task3;

/*
    Задание 3:
    Реализовать метод setCatsCount так, чтобы с его помощью можно было
    устанавливать значение переменной catsCount равное переданному параметру.
*/

class Cat
{
    private static int catsCount = 0;
    public static void setCatsCount(int catsCount) {
        //написать тут ваш код
        Cat.catsCount=catsCount;
    }
    public static int getСatsCount() {
        return catsCount;
    }
}

public class Task3Lect4 {

    public static void main(String[] args) throws Exception {

        Cat cat = new Cat();
        cat.setCatsCount(5);
        System.out.println("Количество котов = " + Cat.getСatsCount());
    }
}