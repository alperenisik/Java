
public class Ship {
  private String name;
  private int year;

  public String getName () {
    return name;
  }
  public void setName (String name) {
    this.name = name;
  }
  public int getYear () {
    return year;
  }
  public void setYear (int year) {
    this.year = year;
  }

  public String toString () {
    return "\n\nGeminin Adı : " + getName() + "\nGeminin İnşa Edildiği Yıl : " + getYear() ;
  }

  public Ship(String name, int year) {
    super();
    this.name = name;
    this.year = year;
   }

}
