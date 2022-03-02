package lect3;

/*

    Задача №6 Мама мыла раму

    Задание:
    Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
    Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.
    Пример:
    МылаРамуМама
    РамуМамаМыла

*/

public class Task6Lect3 {

    public static void main(String[] args) {

        String[] set = {"Мама", "Мыла", "Раму"};

        for(int i = 0; i < set.length; i++){
            for(int j = 0; j < set.length; j++){
                for(int k = 0; k < set.length; k++){
                    if ( (set[i]!=set[j]) && (set[i]!=set[j]) && (set[j]!=set[k]) && (set[i]!=set[k])  )
                    System.out.println(set[i] + set[j] + set[k]);
                }
            }
        }
    }

}
