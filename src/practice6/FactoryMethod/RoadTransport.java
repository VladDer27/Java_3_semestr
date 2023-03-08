package practice6.FactoryMethod;

public class RoadTransport extends Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by road");
    }

}
