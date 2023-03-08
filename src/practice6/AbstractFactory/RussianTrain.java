package practice6.AbstractFactory;

public class RussianTrain implements Train{
    @Override
    public void beep() {
        System.out.println("Russian's train goes toooo tooooo");
    }
}