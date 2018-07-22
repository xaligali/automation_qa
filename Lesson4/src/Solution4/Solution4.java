import java.util.Scanner;

public class Solution4 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = 1;

        System.out.println("Программа вычисляет сумму всех цифр целого двузначного числа n.\nВвведите число n:");

        if(in.hasNextInt())//проверка на ввод целого числа
        {
            n = in.nextInt();
            if( Math.abs(n / 10) <= 9 && Math.abs(n / 10) >= 1 ) {//проверка, что число двухзначное
                int sum = Math.abs(n / 10) + Math.abs(n % 10);// сумма десяток и единиц чила
                System.out.println("Сумма всех цифр целого двузначного числа " + n + " равна " + sum);
            }
            else
            { System.out.println("Вы ввели не двухзначное число");}
        }
        else{
            System.out.println("Вы ввели не целое число");}
    }

}
