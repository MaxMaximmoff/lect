package lect5.Task8;

/*
    Задание 8: Создать класс Dog
    Создать класс Dog (собака) с тремя инициализаторами:
    - Имя
    - Имя, рост
    - Имя, рост, цвет
*/

class Dog {

    private String name;
    private int height = 1;
    private String color = null;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }


}

public class Task8Lect5 {
}
