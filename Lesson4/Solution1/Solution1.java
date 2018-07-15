import java.util.Scanner;

public class Solution1 {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n ,j = 1;

            System.out.println("Программа вычисляет результат деления с остатком двух целых чисел n на j.\nВвведите число n:");

            if(in.hasNextInt()) { //проверка на ввод целого числа
                n = in.nextInt();
                System.out.println("Ввведите число j:");
                if (in.hasNextInt()) { //проверка на ввод целого числа
                    j = in.nextInt();
                    if (j != 0)  // на ноль делить нельзя
                    {
                        System.out.println("Результат:" + "\t" + n + "/" + j + " = " + n / j + " и " + n % j + " в остатке");}
                    else{
                        System.out.println("На ноль делить нельзя!");}
                } else {
                    System.out.println("Вы ввели не целое число");}
            }
            else{
                System.out.println("Вы ввели не целое число");}
        }
}
