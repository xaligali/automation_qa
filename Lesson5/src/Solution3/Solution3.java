package Solution3;

import java.util.Scanner;

public class Solution3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";//спецкод красного цвета

    public static void main(String args[]) {

        System.out.println("Программа проверяет попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщает результат на экран.\n");

        int random = 5 + (int) (Math.random() * (155+1));//генерируем целое число из диапазона  [5;155]
        if (random > 25 && random <100)//проверяем чсила на попадание в интервал (25;100)
            System.out.println("Cлучайно выбранное из отрезка [5;155] целое число " + random + ANSI_RED + " попало " + ANSI_RESET + "в интервал (25;100).");
        else
            System.out.println("Cлучайно выбранное из отрезка [5;155] целое число " + random + ANSI_RED + " не попало " + ANSI_RESET + "в интервал (25;100).");
    }
}
