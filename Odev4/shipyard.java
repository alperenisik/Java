

//  Linux 4.13 && Atom : 1.23.3
// Alp Eren Işık 17253024 => NYP ODEV-4
public class shipyard {
  public static void main (String args[]) {
    Ship[] ship = new Ship[3];
    ship [0] = new Ship ("Titanic" , 1912);
    ship [1] = new TouristShip ("Symphony of the Seas" , 2018 , 8880);
    ship [2] = new CargoShip ("MSC Zoe" , 2015 , 19224);
    System.out.println (ship[0]);
    System.out.println (ship[1]);
    System.out.println (ship[2]);
  }
}
