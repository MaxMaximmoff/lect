package lect5.Task7;

/*
    Задание 7: Создать класс Cat (кот) с пятью инициализаторами:
    - Имя
    - Имя, вес, возраст
    - Имя, возраст (вес стандартный)
    - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    - вес, цвет, адрес (чужой домашний кот)
    Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно
    указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста.
    А вот имени может и не быть (null). То же касается адреса: null.
*/

class Cat
{
    //напишите тут ваш код
    private String name = null;
    private int age = 1;
    private int weight = 5;
    private String address = null;
    private String color = null;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}

public class Task7Lect5 {
}
