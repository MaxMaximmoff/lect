// encoding utf-8
package lect4.Task4;

/*
    Задание 4:
    Реализовать метод setName, чтобы с его помощью можно было
    устанавливать значение переменной private String fullName
    равное значению локальной переменной String fullName.
*/

class Cat
{
    private String fullName;
    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        //написать тут ваш код
        this.fullName = fullName;
    }
    public String getfullName() {
        return fullName;
    }
}

public class Task4Lect4 {

    public static void main(String[] args) throws Exception {

        Cat cat = new Cat();
        cat.setName("Барсик", "Барсиков");
        System.out.println("Полное имя кота: " + cat.getfullName());
    }
}