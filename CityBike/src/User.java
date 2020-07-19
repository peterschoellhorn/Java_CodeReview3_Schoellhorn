public class User {
  public int userID;
  public String name;
  public String surname;
  public Bike rentedBike;




  public User(int userID, String name, String surname) {
    this.userID = userID;
    this.name = name;
    this.surname = surname;
  }

    // RENT METHOD

  public void rentBike(Station Station) {
    this.rentedBike=Station.availableBikes.get(0);
    Station.availableBikes.remove(0);
  }

    // RETURN METHOD

  public void returnBike(Station Station) {
    int size=Station.availableBikes.size();
    if (size < 5)
      {Station.availableBikes.add(this.rentedBike);
      this.rentedBike =null;}
    else System.out.println("Sorry, max capacity reached");
  }

}


