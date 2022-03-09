package lect5.Task10;

/*
    Задание 9: Создать класс прямоугольник (Rectangle)
    Создать класс прямоугольник (Rectangle). Его данными будут
    top, left, width, height (левая координата, верхняя, ширина и высота).
    Создать для него как можно больше методов initialize(…)
    Примеры:
    - заданы 4 параметра: left, top, width, height
    - ширина/высота не задана (оба равны 0)
    - высота не задана (равно ширине) создаём квадрат
    - создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

class Rectangle {
    private int top = 0;
    private int left = 0;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle another) {
        this.left = another.getLeft();
        this.top = another.getTop();
        this.width = another.getWidth();
        this.height = another.getHeight();
    }

    public int getLeft() {
        return left;
    }

    public int getTop() {
        return top;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}


public class Task10Lect5 {
}
