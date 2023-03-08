package practice6.FactoryMethod;

public class TestFactoryMethod {

    public static void main(String[] args) {
        Factory roadTransport = new RoadCreator();
        for (int i = 0; i < 3; i++) {
            roadTransport.doTransport();
        }

        Factory seaTransport = new SeaCreator();
        seaTransport.doTransport();

    }
}