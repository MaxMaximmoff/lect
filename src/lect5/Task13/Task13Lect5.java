package lect5.Task13;

/*
    Задание 13: Создай public static классы Dog, Cat.
    Добавь по три поля в каждый класс, на твой выбор.
    Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
    Пример:
    Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см) , 5 (длина хвоста, см))
*/

import lect5.Task12.Task12Lect5;

public class Task13Lect5 {

    public static void main(String[] args)
    {
        Dog dog = new Dog("Billy", 50, 5);
        Cat cat = new Cat("Tom", 25, 20);


        System.out.println("Бульдог " + dog.name + ", высота, см: " + dog.height + ", длина хвоста, см: " + dog.tailLength);
        System.out.println("Кот " + dog.name + ", высота, см: " + dog.height + ", длина хвоста, см: " + dog.tailLength);

    }

    public static class Dog {
        String name;
        int height;
        int tailLength;

        public Dog (String name, int height, int tailLength){
            this.name = name;
            this.height = height;
            this.tailLength = tailLength;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tailLength;

        public Cat (String name, int height, int tailLength){
            this.name = name;
            this.height = height;
            this.tailLength = tailLength;
        }
    }
}
