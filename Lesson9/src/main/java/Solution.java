import java.util.*;

public class Solution {

    private int age;

    public static void main(String args[]) {
        int type_m = 0;
        int race_m = 0;
        String color_m;
        double age_m = 0;

        Shelter sh = new Shelter();
        Scanner in = new Scanner(System.in);
        int i = 1;
        System.out.println("Программа создает приют для бездомных кошек и собак. Возможно осуществить следющие действия:\n" +
                "1. Добавить животное в приют.\n2. Взять из приюта случайное животное.\n" +
                "3. Забрать из приюта животное с определёнными свойствами.\nВыберите пункт меню:");

        if (in.hasNextInt()) { //проверка на ввод целого числа
            i = in.nextInt();
            switch (i) {
                case 1:
                    //Добавление животного приют
                    System.out.println("Опишите характеристики животного: выберите к какому типу относится?\n1. из семества кошачьих; 2. собака");
                    if (in.hasNextInt()) { //проверка на ввод целого числа
                        sh.Initial(in.nextInt());
                    } else
                        System.out.println("Вы выбрали несуществующий в приюте тип животного");
                    break;
                case 2:
                    sh.Shelter();
                    sh.getRandPet();
                    break;
                case 3:
                    System.out.println("\nКак здорово,что вы решили взять животное из нашего приюта. Оно станет вам настоящим другом!\n" +
                            "Укажите критерии, которым должен удовлетворять питомец:\nТип животного: 1. из семества кошачьих; 2. собака");
                    if (in.hasNextInt()) { //проверка на ввод целого числа
                        type_m = in.nextInt();
                        if (type_m == 1 || type_m == 2) {

                            System.out.println("\nРод: 1. женский; 2. мужской");
                            if (in.hasNextInt()) { //проверка на ввод целого числа
                                race_m = in.nextInt();
                                if (race_m == 1 || race_m == 2) {
                                    System.out.println("\nЦвет:");
                                    color_m = in.next();
                                    System.out.println("\nВозраст(год/лет):");
                                    if (in.hasNextDouble()) { //проверка на ввод целого числа
                                        age_m = in.nextDouble();
                                        sh.Shelter();
                                        sh.SearchPet(type_m, color_m, age_m, race_m);
                                    } else
                                        System.out.println("Вы задали не числовое значение возраста животного");

                                } else
                                    System.out.println("Вы задали несуществующий в природе род животного");
                            } else
                                System.out.println("Вы задали несуществующий в природе род животного");
                        } else
                            System.out.println("Вы задали несуществующий в приюте тип животного");
                    } else
                        System.out.println("Вы задали несуществующий в приюте тип животного");
            break;
                default:
                    System.out.println("Вы выбрали несуществующий пункт меню");
                    break;
            }
        } else {
            System.out.println("Вы выбрали несуществующий пункт меню");
        }
    }
}