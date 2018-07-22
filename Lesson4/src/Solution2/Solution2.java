import java.util.Scanner;
import java.math.*;
import java.io.*;
public class Solution2 {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double n;

        System.out.println("Программа округляет дробное число n до ближайшего целого.\nВвведите число n. В качестве разделителя целой и дробной части используйте запятую");
        if (in.hasNextDouble()) {//проверка на ввод  числа типа double
            n = in.nextDouble();
            if (n % 1 != 0 ) {//если дробная часть ненулевая
                System.out.println("Результатом округления числа " + n + " до ближайшего целого является число " + Math.round(n));
            }
            else{
                System.out.println("Дробная часть числа должна быть не нулевой");
            }

        } else {
            System.out.println("Вы ввели не дробное число");
        }
    }
}