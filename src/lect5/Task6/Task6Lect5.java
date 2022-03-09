package lect5.Task6;

/*
    Задание 6: Создать класс Friend
    Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
    - Имя
    - Имя, возраст
    - Имя, возраст, пол
*/

class Friend {

    private String name = null;
    private int age = 0;
    private String sex = null;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

public class Task6Lect5 {
}
