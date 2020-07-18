public class Bike {
  public static int bikeId;
  public String color;
  public String state;



  public Bike(String color, String state) {

    ++bikeId;
    this.color = color;
    this.state = state;
  }

  //Get-Set-Methods


  public static int getBikeId() {
    return bikeId;
  }

}