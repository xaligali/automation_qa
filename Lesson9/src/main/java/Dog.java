public class Dog extends Animals{

    Dog(String name, String color, String race,  int age)  {
        type = "собака";
        this.name = name;
        this.color = color;
        this.race = race;
        this.age=age;
    }
    Dog(String color, String type)  {
        this.color = color;
        this.type = type;
    }
}
