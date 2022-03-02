package lect2;

/*

    Задача №6

    Задание:
    Создайте объект типа Cat(кот), объект типа Dog (собака),
    объект типа Fish (рыбка) и объект типа Woman.
    Присвойте каждому животному владельца (owner).

*/

public class Task6Lect2 {

    public static class Cat {

        public Woman owner;

    }

    public static class Dog {

        public Woman owner;

    }

    public static class Fish {

        public Woman owner;

    }

    public static class Woman {

    }

    public static void main(String[] args)

    {

        Woman Natalia = new Woman();

        Cat cat = new Cat();

        cat.owner = Natalia;

        Dog dog = new Dog();

        dog.owner = Natalia;

        Fish fish = new Fish();

        fish.owner = Natalia;

    }



}
