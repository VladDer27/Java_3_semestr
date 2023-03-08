package practice6.AbstractFactory;

public class ItalianCar implements Car{
    @Override
    public void gas() {
        System.out.println("Italian Ferrari go vroom vroom");
    }
}
