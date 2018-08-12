public class Cat extends Animals {

    Cat(String name, String color, String race, int age)  {
        type = "из семества кошачьих";
        this.name = name;
        this.color = color;
        this.race = race;
        this.age=age;
    }
    Cat(String color, String type)
    {
        this.color = color;
        this.type = type;

    }

}