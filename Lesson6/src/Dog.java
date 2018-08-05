public class Dog extends Animals{
    String name;
    String home;

    Dog(String home) {this.home=home;}
    Dog(String name, String home) throws Exception_1
    {
        this.name=name;
        this.home=home;
        if (home=="бездомная") throw new Exception_1(" cобака, это очень грустно", home);
    }

    //переопределяем методы класса-родителя Animals
    @Override
    public void info()
    {
        if(name!=null) System.out.printf("Cобаку зовут %s. Она %s.\n",name, home);
        else System.out.printf("У собаки нет имени, но она %s.\n",home);
    }

    @Override
    public void run()
    {
        System.out.println("Когда она бежит, то издает звук: еее");
    }

    @Override
    public void eat()
    {
        System.out.println("Когда ест - хрум-хрум");
    }

    @Override
    public void voice()
    {
        System.out.println("Когда лает - гав-гав\n");
    }

    @Override
    public void battle(String name_attack) {
        System.out.println("Бьет " + name_attack + "\nЗащищается " + name);
    }
}
