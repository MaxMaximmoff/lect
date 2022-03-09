// encoding utf-8
package lect5.Task3;

/*
    Задание 3: Геттеры и сеттеры для класса Dog
    Создать class Dog. У собаки должна быть кличка String name и возраст int age.
    Создайте геттеры и сеттеры для всех переменных класса Dog.
*/
class Dog {

    private String name;
    private int age;

    public Dog (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Task3Lect5 {

    public static void main(String[] args){

    }
}
