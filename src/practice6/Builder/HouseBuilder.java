package practice6.Builder;

public class HouseBuilder implements Builder{
    House house = new House();


    @Override
    public void setFrame(Boolean hasFrame) {
        house.buildFrame(hasFrame);
    }

    @Override
    public void setGarage(Boolean hasGarage) {
        house.buildGarage(hasGarage);
    }

    @Override
    public void setRooms(int numberRoom) {
        house.buildRooms(numberRoom);
    }

    @Override
    public House getResult() {
        return house;
    }
}
