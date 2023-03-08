package practice6.FactoryMethod;

public class RoadCreator extends Factory{
    @Override
    public Transport createTransport() {
        return new RoadTransport();
    }

}