public class Lesson6 {
    public static void main(String args[]) {
        Cat Afina= new Cat("Афина","Ильфат","женский","г.Уфа, пр. Октября, 18/1-39");
        Afina.info();
        Afina.run();
        Afina.eat();
        Afina.voice();

        Cat Kuzya= new Cat("Кузя", "Артур", "мужской", "г.Уфа, ул. Р.Зорге, 15-35");
        Kuzya.info();
        Kuzya.run();
        Kuzya.eat();
        Kuzya.voice();

        Dog Gerda = new Dog("Герда", "бездомная");
        Gerda.info();
        Gerda.run();
        Gerda.eat();
        Gerda.voice();

        Dog dog = new Dog( "домашняя");
        dog.info();
        dog.run();
        dog.eat();
        dog.voice();

        System.out.println("Бой кошек");
        Kuzya.battle(Afina.name);

        System.out.println("\nБой кошки и собаки");
        Gerda.battle(Afina.name);

    }
}
