// encoding utf-8
package lect5.Task2;

/*
    Задание 2: Реализовать метод fight
    Реализовать метод boolean fight(Cat anotherCat): реализовать
    механизм драки котов в зависимости от их веса, возраста и силы.
    Зависимость придумать самому. Метод должен определять, выиграли ли
    мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
    Должно выполняться условие:
    если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
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

    public boolean fight(Cat cat) {
        int thisCatRating = 0;
        int catRating = 0;

        if(this.getAge() > cat.getAge()){
            thisCatRating++;
        } else catRating++;

        if(this.getWeight() > cat.getWeight()){
            thisCatRating++;
        } else catRating++;

        if(this.getStrength() > cat.getStrength()){
            thisCatRating++;
        } else catRating++;

        if(thisCatRating > catRating) return true;

        return false;
    }
}

public class Task2Lect5 {

    public static void main(String[] args){
        Cat cat1 = new Cat("Барсик", 2, 5, 10);
        Cat cat2 = new Cat("Мурзик", 1, 4, 5);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
