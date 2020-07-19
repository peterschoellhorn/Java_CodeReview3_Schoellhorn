public class Bike {
  public int bikeId;
  public static int tempBikeId = 0;
  public String color;
  public String state;


  public Bike(String color, String state) {

    this.bikeId=(++tempBikeId);
    this.color = color;
    this.state = state;
  }

  //Get-Set-Methods


  public int getBikeId() {
    return bikeId;
  }
}

