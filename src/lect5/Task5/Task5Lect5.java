// encoding utf-8
package lect5.Task5;

/*
    Задание 5: Провести три боя попарно между котами
    Создать три кота используя класс Cat.
    Провести три боя попарно между котами.
    Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
    Результат каждого боя вывести на экран.
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

public class Task5Lect5 {

    public static void main(String[] args){
        Cat cat1 = new Cat("Барсик", 3, 5, 3);
        Cat cat2 = new Cat("Мурзик", 2, 4, 4);
        Cat cat3 = new Cat("Беня", 1, 5, 7);
        System.out.printf("Имя кота: %s, возраст: %s, вес: %s, сила: %s\n",
                cat1.getName(), cat1.getAge(), cat1.getWeight(), cat1.getStrength());
        System.out.printf("Имя кота: %s, возраст: %s, вес: %s, сила: %s\n",
                cat2.getName(), cat2.getAge(), cat2.getWeight(), cat2.getStrength());
        System.out.printf("Имя кота: %s, возраст: %s, вес: %s, сила: %s\n",
                cat3.getName(), cat3.getAge(), cat3.getWeight(), cat3.getStrength());

        if(cat1.fight(cat2)) {
            System.out.printf("Бой %s-%s. Победил: %s!\n",
                    cat1.getName(), cat2.getName(), cat1.getName());
        }
        else if (cat2.fight(cat1)) {
            System.out.printf("Бой %s-%s. Победил: %s!\n",
                    cat1.getName(), cat2.getName(), cat2.getName());
        } else {
            System.out.printf("Бой %s-%s. Ничья!\n",
                    cat1.getName(), cat2.getName());
        }

        if(cat1.fight(cat3)) {
            System.out.printf("Бой %s-%s. Победил: %s!\n",
                    cat1.getName(), cat3.getName(), cat1.getName());
        }
        else if (cat3.fight(cat1)) {
            System.out.printf("Бой %s-%s. Победил: %s!\n",
                    cat1.getName(), cat3.getName(), cat3.getName());
        } else {
            System.out.printf("Бой %s-%s. Ничья!\n",
                    cat1.getName(), cat3.getName());
        }

        if(cat2.fight(cat3)) {
            System.out.printf("Бой %s-%s. Победил: %s!\n",
                    cat2.getName(), cat3.getName(), cat2.getName());
        }
        else if (cat3.fight(cat2)) {
            System.out.printf("Бой %s-%s. Победил: %s!\n",
                    cat2.getName(), cat3.getName(), cat3.getName());
        } else {
            System.out.printf("Бой %s-%s. Ничья!\n",
                    cat2.getName(), cat3.getName());
        }

    }
}
