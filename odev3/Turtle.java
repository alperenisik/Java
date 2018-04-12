import java.util.Random;

public class Turtle{
  private int location = 0; //Konumu
  private int winner = 0;   // Kazanma Kontrolü

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
      case 1: case 2: case 3: case 4: case 5: // %50
      location+=3;
      break;

      case 6: case 7:  // %20
      if(location<6)
      location=0;
      else
      location-=6;
      break;

      case 8: case 9: case 10:  // %30
      location+=1;
      break;
    }

/*  Konumu parkur uzunluğu kadar değere sahip olursa
  veya
    parkur uzunluğundan büyük bir değere sahip olursa , konumu parkur uzunluğuna eşitle
  ve
    Kazanma kontrolünü 1 yap
*/
    if (location >= 69){
      location = 69;
      winner = 1;
    }
  }
}
