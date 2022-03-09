// encoding utf-8
package lect5.Task1;

/*
    Задание 1: Создать класс Cat.
    Создать класс Cat. У кота должно быть имя (name, String),
    возраст (age, int), вес (weight, int), сила (strength, int).
*/
class Cat {

    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat() {}

    public Cat (String name, int age, int weight, int strength){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}

public class Task1Lect5 {

    public static void main(String[] args){

    }
}
