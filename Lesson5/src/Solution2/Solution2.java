package Solution2;

import java.util.Scanner;

public class Solution2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Программа заменяет в введенной строке все выбранные буквы на заданный символ.\nВвведите строку:");
        String stroka = in.nextLine();
        System.out.println("Ввведите символ, который хотите заменить в строке:\n");
        String start_sym = in.next();
        //System.out.println(start_sym);

        if (stroka.contains(start_sym) && (start_sym.length() ==1))//проверяем содержит ли введенный строка символ
        {
            char[] array_start_sym = start_sym.toCharArray();//преобразуем строку символа в массив, чтоб можно было сравнить с элементами массива строки
            System.out.println("Ввведите символ, на который хотите заменить:\n");
            String change_sym = in.next();
            char[] array_change_sym = change_sym.toCharArray();//преобразуем строку символа в массив, чтоб можно было записать в элементы массива строки

            //String stroka="Рассерженный Родион Романович раскричался: «Рано радовались, размокший ремень рюкзака разорвался";
            stroka = stroka.toLowerCase();//приводим все символы к нижнему регистру

            char[] chArray = stroka.toCharArray(); //преобразовываем строку в массив
            if (change_sym.length() == 1)//проверяем длину введеного символа
            {
                System.out.println("В результате замены символа " + start_sym + " на " + change_sym + " получается следующая строка:\n");

                for (int i = 0; i < chArray.length; i++)//перебираем все элементы массива
                {
                    //находим start_sym
                    if (chArray[i] == array_start_sym[0]) {
                        chArray[i] = array_change_sym[0]; //заменяем start_sym на change_sym
                    }
                }
                System.out.println(chArray);
            }
            else
                System.out.println("Символ должен состоять из одной буквы/цифры/знака");

        }
        else if (start_sym.length() !=1){//если символ состоит больше чем из одного элемента, то выводим сообщение об ошибке

            System.out.println("Символ должен состоять из одной буквы/цифры/знака");

        }

        else {
            System.out.println("Строка не содержит введенный символ.");
        }
    }
}
