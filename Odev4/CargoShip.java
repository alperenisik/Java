
public class CargoShip extends Ship {
  private int capacity;

  public int getCapacity () {
    return capacity;
  }
  public void setCapacity (int capacity) {
    this.capacity = capacity;
  }

  public String toString () {
      return "\n\nGeminin Adı : " + getName() + "\nGeminin İnşa Edildiği Yıl : " + getYear() + "\nMaksimum Kargo Kapasitesi : " + getCapacity() + " konteyner " ;
  }

  public CargoShip (String name, int year, int capacity) {
  super(name, year);
  this.capacity=capacity;
 }
}
