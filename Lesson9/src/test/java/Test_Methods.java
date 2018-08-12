import org.junit.Assert;
import org.junit.Test;

public class Test_Methods {

    Shelter test_sh = new Shelter();

    @Test
    public void Test_Shelter_Positive() {
        //проверяем, что питомник не пуст
        Assert.assertFalse(0 == test_sh.Shelter());
        System.out.println("Test_Shelter_Positive");
    }

    @Test
    public void Test_Shelter_Negative() {
        //проверяем, что питомник не пуст
        Assert.assertTrue(3 == test_sh.Shelter());
        System.out.println("Test_Shelter_Negative");
    }

    @Test
    public void Test_getRandPet() {
        //проверяем, что случайно сгенерированный индекс элемента списка не выходит за размеры списка
        Assert.assertFalse(test_sh.Shelter() == test_sh.getRandPet());
        System.out.println("Test_getRandPet");
    }

    @Test
    public void Test_setPet() {
        //проверяем, что добавляется не пустой объект
        Assert.assertFalse(null == test_sh.setPet(new Cat("black", "из семества кошачьих")));
        System.out.println("Test_setPet");
    }

}
