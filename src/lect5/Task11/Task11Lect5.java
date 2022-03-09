package lect5.Task11;

/*
    Задание 11: Три класса
    По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
    Подумай, что должен возвращать метод toString в классах Cat и Dog?
    В методе main создай по два объекта каждого класса и выведи их на экран.
    Объекты класса Duck уже созданы и выводятся на экран.
*/
class Duck
{
    private String name;

    public Duck (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Duck";
    }
}
class Cat
{
    private String name;

    public Cat (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Cat";
    }
}
class Dog{

    private String name;

    public Dog (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Dog";
    }
}

public class Task11Lect5 {
    public static void main(String[] args)
    {
        Duck duck1 = new Duck("Кряка");
        Duck duck2 = new Duck("Кряка2");
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        System.out.println(duck1.toString() + "1: " + duck1.getName());
        System.out.println(duck2.toString() + "2: " + duck2.getName());
        System.out.println(cat1.toString() + "1: " + cat1.getName());
        System.out.println(cat2.toString() + "2: " + cat2.getName());
        System.out.println(dog1.toString() + "1: " + dog1.getName());
        System.out.println(dog2.toString() + "2: " + dog2.getName());
    }


}
