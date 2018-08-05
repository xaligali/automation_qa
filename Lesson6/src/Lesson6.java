public class Lesson6 {
    public static void main(String args[]) {

        try{
        Cat Afina = new Cat("Афина", "Ильфат", "средний", "г.Уфа, пр. Октября, 18/1-39", 0);

        Afina.info();
        Afina.run();
        Afina.eat();
        Afina.voice();

        Cat Kuzya= new Cat("Кузя", "Артур", "мужской", "г.Уфа, ул. Р.Зорге, 15-35",9);
        Kuzya.info();
        Kuzya.run();
        Kuzya.eat();
        Kuzya.voice();


       }
        catch(Exception_1 e) {
            System.out.println(e.getMessage());
        }

        try{
            Dog Gerda = new Dog("Герда", "бездомная");
            Gerda.info();
            Gerda.run();
            Gerda.eat();
            Gerda.voice();

           /* Dog dog = new Dog( "домашняя");
            dog.info();
            dog.run();
            dog.eat();
            dog.voice();*/

        }
        catch(Exception_1 e) {
            e.gethome();
            System.out.printf(e.getMessage());

        }


        /*System.out.println("Бой кошек");
        Kuzya.battle(Afina.name);

        System.out.println("\nБой кошки и собаки");
        Gerda.battle(Afina.name);*/
    }
}
