package practice6.Builder;



public class DirectorHouse {
    public void constructSimpleHouse(Builder builder){
        builder.setFrame(true);
        builder.setRooms(5);
        //builder.setGarage(false);
    }
    public void constructGarageHouse(Builder builder){
        builder.setFrame(true);
        builder.setRooms(5);
        builder.setGarage(true);
    }
    public void onlyGarage(Builder builder){
        //builder.setFrame(true);
        //builder.setRooms(5);
        builder.setGarage(true);
    }
}
