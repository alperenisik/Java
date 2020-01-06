
public class TouristShip extends Ship {
  private int passenger;

  public int getPassenger () {
    return passenger;
  }
  public void setPassenger (int passenger) {
    this.passenger = passenger;
  }

  public String toString () {
    return "\n\nGeminin Adı : " + getName() + "\nGeminin İnşa Edildiği Yıl : " + getYear() + "\nMaksimum Yolcu Sayisi : " + getPassenger() ;
  }

  public TouristShip (String name, int year, int passenger) {
      super(name, year);
      this.passenger = passenger;
  }
}
