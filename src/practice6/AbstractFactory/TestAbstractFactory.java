package practice6.AbstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        RussianFactory russianFactory=new RussianFactory();
        Car Zhiguli = russianFactory.createCar();
        Zhiguli.gas();
        Train lokomotiv = russianFactory.createTrain();
        lokomotiv.beep();

        ItalianFactory italianFactory = new ItalianFactory();
        Car LaFerrari = italianFactory.createCar();
        LaFerrari.gas();
    }
}
