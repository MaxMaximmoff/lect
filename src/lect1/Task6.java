package lect1;

/*

    Задача №6

    Задание: вывести на экран текст:

    Меня зовут Амиго.

    Я согласен на зарплату $800/месяц в первый год.
    Я согласен на зарплату $1500/месяц во второй год.
    Я согласен на зарплату $2200/месяц в третий год.
    Я согласен на зарплату $2700/месяц в четвертый год.
    Я согласен на зарплату $3200/месяц в пятый год.

    Поцелуй мой блестящий металлический зад!

*/

public class Task6 {

    public static void main(String[] args)

    {
        int salaryFirstYear = 800;
        int salarySecondYear = 1500;
        int salaryThirdYear = 2200;
        int salaryFourthYear = 2700;
        int salaryFifthYear = 3200;
        String preface = "Меня зовут Амиго.";
        String afterword = "Поцелуй мой блестящий металлический зад!";

        System.out.println(preface + "\n");
        System.out.printf("Я согласен на зарплату $%s/месяц в первый год.\n", salaryFirstYear);
        System.out.printf("Я согласен на зарплату $%s/месяц во второй год.\n", salarySecondYear);
        System.out.printf("Я согласен на зарплату $%s/месяц в третий год.\n", salaryThirdYear);
        System.out.printf("Я согласен на зарплату $%s/месяц в четвертый год.\n", salaryFourthYear);
        System.out.printf("Я согласен на зарплату $%s/месяц в пятый год.\n\n", salaryFifthYear);
        System.out.println(afterword);

    }

}
