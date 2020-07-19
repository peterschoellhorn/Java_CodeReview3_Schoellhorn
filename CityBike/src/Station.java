import java.util.ArrayList;



public class Station {
  public int stationId;
  public String location;
  public ArrayList<Bike>availableBikes;

  public Station(int stationId, String location) {
    this.stationId = stationId;
    this.location = location;
    this.availableBikes = new ArrayList<>();
  }



/*    addBike is used by WienerLinien to distribute bikes to station
    as well as to initially fill the station and guarantee an even distribution*/

  public void addBike(Bike Bike){
      availableBikes.add(Bike);

  }


}
