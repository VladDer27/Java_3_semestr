package practice6.AbstractFactory;

public class RussianFactory implements AbstractFactoryMech{
    @Override
    public Car createCar() {
        return new RussianCar();
    }

    @Override
    public Train createTrain() {
        return new RussianTrain();
    }
}
