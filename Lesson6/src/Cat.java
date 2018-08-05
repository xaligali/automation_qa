public class Cat extends Animals {
    String name;
    String boss;
    String race;
    String address;
    int age;

    Cat(String name, String boss, String race, String address, int age) throws Exception_1 {
        this.name = name;
        this.boss = boss;
        this.race = race;
        this.address = address;
        this.age=age;
        if (age <=0 || age >40 ) throw new Exception_1("Возраст кошки не может быть меньше 0 или больше 40");
    }



    //переопределяем методы класса-родителя Animals
    @Override
    public void info() {
        if (race == "женский")
            System.out.printf("Кошку зовут %s. Хозяина зовут %s. Проживают они по адресу: %s.\n", name, boss, address);
        else System.out.printf("Кота зовут %s. Хозяина зовут %s. Проживают они по адресу: %s.\n", name, boss, address);
    }

    @Override
    public void run() {
        if (race == "женский") System.out.println("Когда она бежит, то издает: юхуу");
        else System.out.println("Когда он бежит, то издает: юхуу");
    }

    @Override
    public void eat() {
        System.out.println("Когда ест - ням-ням");
    }

    @Override
    public void voice() {
        System.out.println("Когда мяучит - мяу-мяу\n");
    }

    @Override
    public void battle(String name_attack) {
        System.out.println("Бьет " + name_attack + "\nЗащищается " + name);
    }

}

