import java.util.Scanner;

public class Race {

	int counter = 1; // Raund

	void add(){
	    Scanner scn = new Scanner (System.in);
			// Kaplumbağa sayıları
			System.out.print("Please Enter The Number Of Turtles (T) : ");
	    Turtle[] tospaa = new Turtle[scn.nextInt()] ;
			// Tavşan sayıları
	    System.out.print("Please Enter The Number Of Rabbits (R) : ");
	    Rabbit[] davsan = new Rabbit[scn.nextInt()] ;
			// Nesneler
	    for (int i=0; i<davsan.length ; i++ ) {
	      davsan[i]=new Rabbit();
	    }
			// Nesneler
	    for (int i=0; i<tospaa.length ; i++ ) {
	      tospaa[i]=new Turtle();
	    }

	    competition(tospaa, davsan);
	  }


	  public void competition(Turtle[] tospaa, Rabbit[] davsan) {
	    for (int i=0; i<tospaa.length ; i++ ) {
	      tospaa[i].move();
	    }
			// Tavşan ve Kaplumbağalarımızın hareketleri
	    for (int i=0; i<davsan.length ; i++ ) {
	      davsan[i].move();
	    }

	    display(tospaa,davsan);
	    isFinished(tospaa, davsan);
	  }


	   int rab,tur;
	   public void isFinished(Turtle[] tospaa, Rabbit[] davsan) {
			 // Kazanma Kontrolü (winner) varsayılan olarak sıfırdır.
			 // Birisi yarışı bitirdiği zaman onun winner değeri 1 olur.
			 // Böylece kazanan kişi(T || R) veya kişileri(T && R) rahatlıkla yazdırabileceğiz.
	     for (int i=0; i<tospaa.length ; i++ ) {
	       if (tospaa[i].GetWinner() == 1)
	        tur = i+1;
	     } // Kazanma Kontrolü Yapılır.
	     for (int i=0; i<davsan.length ; i++ ) {
	       if (davsan[i].GetWinner() == 1)
	        rab = i+1;
	     }
			 // Kazanan veya beraberlik durumu varsa yarış biter.
			 // Kazanan veya beraber bitiren (T) && (R) yazdırılır.
	    if (rab != 0 && tur != 0)
	      System.out.println("Tied up betwean "+tur+". Turtle and "+rab+". Rabbit");
	    else if (tur != 0)
	      System.out.println("\n"+tur + ". Tosbaga Kazandi ");
	    else if (rab != 0)
	      System.out.println("\n"+rab + ". Davsan Kazandi ");
	    else
	      competition(tospaa, davsan); // Kazanma veya beraberlik durumları yoksa yarış devam eder.
	  }


	  void display(Turtle[] tospaa, Rabbit[] davsan) {

/*LİNK (delay) : https://stackoverflow.com/questions/24104313/how-to-delay-in-java*/
			try { // Raundlar arasında bekleme süresi oluşur. Bu sayede yarış adım adım ilerler
				Thread.sleep(750);
			}
			catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
			}
/*LİNK (clear) : https://stackoverflow.com/questions/2979383/java-clear-the-console */
// Geçmiş raundları siliyoruz...
			System.out.print("\033[H\033[2J");	// Ekranı Temizleme
			System.out.flush();           			// Ekranı Temizleme

			System.out.println("\n \n"+counter+". Raund");
			counter++; // Her defasında raund yazdırılır ve arttırılır.

			for (int j=0; j<tospaa.length ; j++ ) {
	       for (int i=0; i<70; i++ ) {
	         if(tospaa[j].GetLocation() == i)
	        	System.out.print("T"); // Mevcut konumuna gelince T harfini yaz
	         else
	        	System.out.print("_"); // Mevcut konumu dışındaki yerlere "_" ile yolu çiz
	      }
	      System.out.println("");
	    }
/* Tüm yarışmacıların bulundukları yerlerı kontrol et
 ve
	 yol üzerindeki mevcut konumlarına harflerini (T || R) yaz.
*/
	    for (int j=0; j<davsan.length ; j++ ) {
	       for (int i=0; i<70; i++ ) {
	         if(davsan[j].GetLocation() == i)
	        	System.out.print("R"); // Mevcut bulunduğu noktaya R harfini yaz
	         else
	        	System.out.print("_"); // Kalan yerlere "_" ile yolu çiz
	      }
	      System.out.println("");
	    }
	  }
}
