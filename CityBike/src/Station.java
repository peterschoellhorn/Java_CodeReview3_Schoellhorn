import java.util.ArrayList;
import java.util.HashMap;


public class Station {
  public int stationId;
  public String location;
  public static ArrayList<Bike> availableBikes;

  public Station(int stationId, String location) {
    this.stationId = stationId;
    this.location = location;
  }



   static void addBike(Bike Bike){
     availableBikes.add(Bike);

  }


}
