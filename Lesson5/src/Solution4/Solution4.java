package Solution4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа приводит каждую уникальную букву строки к строчному регистру и помещает ее в массив. Все буквы должны находиться в массиве в алфавитном порядке.\nВвведите строку:");
        String str = in.nextLine();
        str = str.replaceAll("\\s","");//удаляем пробелы из строки
        str = str.toLowerCase();//приводим все символы к нижнему регистру
        char[] array_stroka = str.toCharArray();//преобразуем строку в массив
        Arrays.sort(array_stroka);//сортируем массив по алфавиту
        ArrayList sort_arr = new ArrayList();//создаем новый автоматически расширяемый массив (поскольку мы не знаем размер итоговый размер массива)
        sort_arr.add(array_stroka[0]);

       for (int i = 1; i < array_stroka.length; i++)//перебираем все элементы массива
        {
            if (array_stroka[i] != array_stroka[i - 1])//если следующий элемент уникален
            {
                sort_arr.add(array_stroka[i]); //записываем его в новый массив
            }
        }

        System.out.println("В результате работы программы массив имеет вид:");
        System.out.println(sort_arr);
    }
}
