package practice6.FactoryMethod;

public class SeaCreator extends Factory{
    @Override
    public Transport createTransport() {
        return new SeaTransport();
    }
}
