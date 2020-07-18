import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
/*    new Bike("White","CanBeRented");
    new Bike("Black","CanBeRented");
    new Bike("Red","CanBeRented");
    new Bike("Green","CanBeRented");
    new Bike("Blue","InService");
    new Bike("Yellow","Discarded");
    new Bike("Cyan","InService");
    new Bike("Magenta","Discarded");
    new Bike("Indigo","CanBeRented");
    new Bike("Silver","CanBeRented");*/

    HashMap<Integer, Bike> bikePool;
    bikePool = new HashMap<>();

    bikePool.put(Bike.bikeId, new Bike("White", "CanBeRented"));
    bikePool.put(Bike.bikeId, new Bike("Black", "CanBeRented"));
    bikePool.put(Bike.bikeId, new Bike("Red", "CanBeRented"));
    bikePool.put(Bike.bikeId, new Bike("Green", "CanBeRented"));
    bikePool.put(Bike.bikeId, new Bike("Blue", "InService"));
    bikePool.put(Bike.bikeId, new Bike("Yellow", "Discarded"));
    bikePool.put(Bike.bikeId, new Bike("Cyan", "InService"));
    bikePool.put(Bike.bikeId, new Bike("Magenta", "CanBeRented"));
    bikePool.put(Bike.bikeId, new Bike("Indigo", "CanBeRented"));
    bikePool.put(Bike.bikeId, new Bike("Silver", "CanBeRented"));


    HashMap<Integer, Station> stations;
    stations = new HashMap<>();

    {
      stations.put(0, new Station(101, "Karlsplatz"));
      Station.addBike(bikePool.get(0));
      Station.addBike(bikePool.get(1));
      Station.addBike(bikePool.get(2));
    }

    stations.put(1, new Station(102, "Siebenbrunnenplatz"));

    {
      stations.put(2, new Station(103, "Bahnhof Meidling"));
      Station.addBike(bikePool.get(3));
      Station.addBike(bikePool.get(7));
      Station.addBike(bikePool.get(8));
      Station.addBike(bikePool.get(9));
    }


    new User(1111,"Paul","Paulsen");
    new User(2222,"Peter","Peterson");
    new User(3333,"John","Doe");
    new User(4444,"Jane","Doe");


    User.rentBike();

    System.out.println();

  }
}
