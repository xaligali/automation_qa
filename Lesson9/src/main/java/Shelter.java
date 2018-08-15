import java.util.*;

public class Shelter extends Animals {

    List<Animals> shelter = new ArrayList<>();

    int Shelter() {
        //создаем несколько объектов класса Cat и Dog - состав животных в приюте
        Cat Afina = new Cat("Афина", "рыжий", "женский", 2);
        Cat Murzic = new Cat("Мурзик", "белый", "мужской", 1);
        Dog Gerda = new Dog("Герда", "рыжий", "женский", 3);

        //добавляем в список объекты класса Cat и Dog
        //можем это сделать, поскольку класс Animals - родительский класс этих классов
        shelter.add(Afina);
        shelter.add(Murzic);
        shelter.add(Gerda);
        //System.out.println(shelter.size());
        return shelter.size();
    }

    public void Initial(int type_m) {
        Shelter sh = new Shelter();
        String color_m = null;
        //int type_m = 0;
        Scanner in = new Scanner(System.in);

        if (type_m == 1) {//если животное кошка
            System.out.println("Введите цвет животного:");
            color_m = in.next();
            Cat cat = new Cat(color_m, "из семества кошачьих");
            sh.setPet(cat);
            System.out.println("Вы добавили в приют животное.\n");
        } else if (type_m == 2) {//если животное собака
            System.out.println("Введите цвет животного:");
            color_m = in.next();
            Dog dog = new Dog(color_m, "собака");
            sh.setPet(dog);
            System.out.println("Вы добавили в приют следующее животное.\n");
        } else
            System.out.println("Вы выбрали несуществующий в приюте тип животного");
    }

    public Animals setPet(Animals o) {
        shelter.add(o);
        return o;
    }

    public int getRandPet() {
        Random random = new Random();
        //выбираем элемент из списка случайным образом из диапазона [0,размер списка)
        int id = random.nextInt(shelter.size());
        System.out.println("Вы выбрали слуйчайное животное из приюта. Им является:\n" + shelter.get(id));
        return id;
    }

    public void SearchPet(int type, String color, double age, int race) {

        System.out.println("\nПо вашим критериям подходит(-ят) следующие(-ее) животные(-ое):");
        //находим в списке нужное животное c помощью стрима
        if ((type == 1) && (race == 1)) {
            shelter.stream().filter(s -> s.type.contains("из семества кошачьих") && s.race.contains("женский") && s.color.contains(color) && s.age_animal() == age)
                    .forEach(s -> System.out.println(s));
        }
        if ((type == 1) && (race == 2)) {
            shelter.stream().filter(s -> s.type.contains("из семества кошачьих") && s.race.contains("мужской") && s.color.contains(color) && s.age_animal() == age)
                    .forEach(s -> System.out.println(s));
        }
        if ((type == 2) && (race == 1)) {
            shelter.stream().filter(s -> s.type.contains("собака") && s.race.contains("женский") && s.color.contains(color) && s.age_animal() == age)
                    .forEach(s -> System.out.println(s));
        }
        if ((type == 2) && (race == 2)) {
            shelter.stream().filter(s -> s.type.contains("собака") && s.race.contains("мужской") && s.color.contains(color) && s.age_animal() == age)
                    .forEach(s -> System.out.println(s));
        }
    }
}