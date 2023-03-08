package practice6.AbstractFactory;

public class ItalianFactory implements AbstractFactoryMech{
    @Override
    public Car createCar() {
        return new ItalianCar();
    }

    @Override
    public Train createTrain() {
        return new ItalianTrain();
    }
}
