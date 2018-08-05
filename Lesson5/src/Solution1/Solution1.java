package Solution1;
import java.util.Scanner;

public class Solution1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        System.out.println("Программа заменяет в введенной строке все выбранные буквы на заданный символ.\nВвведите строку:");
        String stroka = in.nextLine();
        System.out.println("Ввведите символ, который хотите заменить в строке:\n");
        String start_sym = in.next();
        if(stroka.contains(start_sym))//проверяем содержит ли введенный строка символ
        {
            System.out.println("Ввведите символ, на который хотите заменить:\n");
            String change_sym = in.next();
            stroka=stroka.toLowerCase();//приводим все символы к нижнему регистру
            stroka=stroka.replace(start_sym, change_sym);//заменяем заданный ссимвол нанужный
            System.out.println("В результате замены символа " + start_sym + " на " + change_sym + " получается следующая строка:\n" + stroka);
        }
        else
        {
            System.out.println("Строка не содержит введенный символ.");
        }
    }
}
