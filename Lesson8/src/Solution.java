import java.util.*;

public class Solution {

    private int age;

    public static void main(String args[]) {

        int race_m = 0;
        String color_m = null;
        double age_m = 0;
        int type_m = 0;

        //создаем несколько объектов класса Cat и Dog - состав животных в приюте
        Cat Afina = new Cat("Афина", "рыжий", "женский", 2);
        Cat Murzic = new Cat("Мурзик", "белый", "мужской", 1);
        Dog Gerda = new Dog("Герда", "рыжий", "женский", 3);

        //создаем список их объектов классов (создаем список класса Animals)
        List<Animals> animals = new ArrayList<Animals>();
        //добавляем в список объекты класса Cat и Dog
        //можем это сделать, поскольку класс Animals - родительский класс этих классов
        animals.add(Afina);
        animals.add(Murzic);
        animals.add(Gerda);

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
                        type_m = in.nextInt();
                        if (type_m == 1) {//если животное кошка
                            System.out.println("Введите цвет животного:");
                            color_m = in.next();
                            Cat cat = new Cat(color_m, "из семества кошачьих");
                            animals.add(cat);
                            System.out.println("Вы добавили в приют следующее животное:\n" + animals.get(animals.size() - 1));
                        } else if (type_m == 2) {//если животное собака
                            System.out.println("Введите цвет животного:");
                            color_m = in.next();
                            Dog dog = new Dog(color_m, "собака");
                            animals.add(dog);
                            System.out.println("Вы добавили в приют следующее животное:\n" + animals.get(animals.size() - 1));
                        } else
                            System.out.println("Вы выбрали несуществующий в приюте тип животного");
                    } else
                        System.out.println("Вы выбрали несуществующий в приюте тип животного");
                    break;
                case 2:
                    final Random random = new Random();
                    //выбираем элемент из списка случайным образом из диапазона [0,размер списка)
                    System.out.println("Вы выбрали слуйчайное животное из приюта. Им является:\n" + animals.get(random.nextInt(animals.size())));
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
                                    final String color_ = color_m;
                                    System.out.println("\nВозраст(год/лет):");
                                    if (in.hasNextDouble()) { //проверка на ввод целого числа
                                        age_m = in.nextDouble();
                                        final double age_ = age_m;

                                        System.out.println("\nПо вашим критериям подходит(-ят) следующие(-ее) животные(-ое):");
                                        //находим в списке рыжую собаку c помощью стрима
                                        if ((type_m == 1) && (race_m == 1)) {
                                            animals.stream().filter(s -> s.type.contains("из семества кошачьих") && s.race.contains("женский") && s.color.contains(color_) && s.age_animal() == age_)
                                                    .forEach(s -> System.out.println(s));
                                        }
                                        if ((type_m == 1) && (race_m == 2)) {
                                            animals.stream().filter(s -> s.type.contains("из семества кошачьих") && s.race.contains("мужской") && s.color.contains(color_) && s.age_animal() == age_)
                                                    .forEach(s -> System.out.println(s));
                                        }
                                        if ((type_m == 2) && (race_m == 1)) {
                                            animals.stream().filter(s -> s.type.contains("собака") && s.race.contains("женский") && s.color.contains(color_) && s.age_animal() == age_)
                                                    .forEach(s -> System.out.println(s));
                                        }
                                        if ((type_m == 2) && (race_m == 2)) {
                                            animals.stream().filter(s -> s.type.contains("собака") && s.race.contains("мужской") && s.color.contains(color_) && s.age_animal() == age_)
                                                    .forEach(s -> System.out.println(s));
                                        }
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