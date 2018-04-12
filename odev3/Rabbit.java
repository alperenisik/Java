import java.util.Random;

public class Rabbit {
  private int location = 0; // Konumu
  private int winner = 0;  // Kazanma Kontrolü

  public void SetLocation(int location){
    this.location = location;
  }
  public int GetLocation() {
    return this.location;
  }

  public void SetWinner(int location){
    this.winner = winner;
  }
  public int GetWinner() {
    return this.winner;
  }


  public void move() {
    Random random = new Random();
    switch (random.nextInt(10)+1) {
// Her bir case %10 değerinde etki etmektedir.
// Yüzde kaç olasılık ile nasıl bir hareket yapacağını belirledik
      case 1: case 2: // %20
      break;

      case 3: case 4: //%20
      location+=9;
      break;

      case 5:         //%10
      if(location<12)
      location=0;
      else
      location-=12;
      break;

      case 6: case 7: case 8:  // %30
      location+=1;
      break;

      case 9: case 10:  // %20
      if(location<2)
      location=0;
      else
      location-=2;
      break;
    }
/* Konumu parkur uzunluğu kadar değere sahip olursa
veya
 parkur uzunluğundan büyük bir değere sahip olursa , konumu parkur uzunluğuna eşitle
ve
 Kazanma kontrolünü 1 yap
 */
    if (location >= 69) {
      location = 69;
      winner = 1;
    }
  }
}
