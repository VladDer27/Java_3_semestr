package practice6.AbstractFactory;

public class RussianCar implements Car{
    @Override
    public void gas() {
        System.out.println("Russian's car go vroom vroom");
    }
}
