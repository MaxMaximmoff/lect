// encoding utf-8
package lect4.Task1;

/*
    Задание 1:
    Реализовать метод setName, чтобы с его помощью
    можно было устанавливать значение переменной private
    String name равное переданному параметру String name.
*/

class Cat
{
    private String name;
    public void setName(String name) {
        //написать тут ваш код
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class Task1Lect4 {


    public static void main(String[] args) throws Exception {

        Cat cat = new Cat();
        cat.setName("Барсик");
        System.out.println(cat.getName());

    }
}



