import java.util.HashMap;

public class Main {

  public static void main(String[] args) {

    // Creation of Bikes

    Bike bike0 = new Bike("White", "CanBeRented");
    Bike bike1 = new Bike("Black", "CanBeRented");
    Bike bike2 = new Bike("Red", "CanBeRented");
    Bike bike3 = new Bike("Green", "CanBeRented");
    Bike bike4 = new Bike("Blue", "InService");
    Bike bike5 = new Bike("Yellow", "Discarded");
    Bike bike6 = new Bike("Cyan", "InService");
    Bike bike7 = new Bike("Magenta", "CanBeRented");
    Bike bike8 = new Bike("Indigo", "CanBeRented");
    Bike bike9 = new Bike("Silver", "CanBeRented");

    HashMap<Integer, Bike> bikePool;
    bikePool = new HashMap<>();

    // HashMap (Key: BikeID, Value: Bike Object)

    bikePool.put(bike0.bikeId, bike0);
    bikePool.put(bike1.bikeId, bike1);
    bikePool.put(bike2.bikeId, bike2);
    bikePool.put(bike3.bikeId, bike3);
    bikePool.put(bike4.bikeId, bike4);
    bikePool.put(bike5.bikeId, bike5);
    bikePool.put(bike6.bikeId, bike6);
    bikePool.put(bike7.bikeId, bike7);
    bikePool.put(bike8.bikeId, bike8);
    bikePool.put(bike9.bikeId, bike9);


    System.out.println(bikePool);


    // Creation of stations + HashMap

    HashMap<Integer, Station> stations;
    stations = new HashMap<>();

    Station karlsplatz    =new Station(101, "Karlsplatz");
    Station siebenbrunnen =new Station(102, "Siebenbrunnenplatz");
    Station meidling      =new Station(103, "Bahnhof Meidling");

    // Filling the Stations through HashMap

    stations.put(0,karlsplatz);
    karlsplatz.addBike(bikePool.get(1));
    karlsplatz.addBike(bikePool.get(2));
    karlsplatz.addBike(bikePool.get(3));


    stations.put(1,siebenbrunnen);


    stations.put(2,meidling);
    meidling.addBike(bikePool.get(4));
    meidling.addBike(bikePool.get(8));
    meidling.addBike(bikePool.get(9));
    meidling.addBike(bikePool.get(10));

    // Creation of Users

    User paul   =new User(1111,"Paul","Paulsen");
    User peter  =new User(2222,"Peter","Peterson");
    User john   =new User(3333,"John","Doe");
    User jane   =new User(4444,"Jane","Doe");

    // testing the methods

    System.out.println(paul.rentedBike + "\n");

    paul.rentBike(karlsplatz);
    System.out.println(paul.rentedBike + "\n");

    paul.returnBike(meidling);
    System.out.println(paul.rentedBike + "\n");


    System.out.println(karlsplatz.availableBikes + "\n");
    System.out.println(meidling.availableBikes + "\n");

    peter.rentBike(karlsplatz);
    peter.returnBike(meidling);
    System.out.println(meidling.availableBikes + "\n");
    System.out.println(peter.rentedBike + "\n");

  }
}
