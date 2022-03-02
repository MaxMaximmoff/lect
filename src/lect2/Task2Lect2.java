package lect2;

/*

    Задача №2

    Задание:
    Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".

*/

public class Task2Lect2 {

    public static class Dog

    {
        public String name;
    }

    public static void main(String[] args)

    {

        Dog dog1 = new Dog();
        dog1.name = "Max";

        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();
        dog3.name = "Jack";


    }

}

