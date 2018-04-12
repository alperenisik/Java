
package chief;
import java.util.Scanner;

public class Chief {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

          System.out.println("Dikdörtgenin En Değerini Giriniz ");
          double width = input.nextInt();
          System.out.println("Dikdörtgenin Boy Değerini Giriniz ");
          double height = input.nextInt();
          System.out.println("Dikdörtgenin Solt Alt Köşe X Değerini Giriniz");
          double x = input.nextInt();
          System.out.println("Dikdörtgenin Sol Alt Köşe Y Değerini Giriniz");
          double y = input.nextInt();

          Building edge = new Building();
          edge.widthSet(width);
          edge.heightSet(height);
          edge.xSet(x);
          edge.ySet(y);
          edge.area();
          edge.environment();
          edge.view();

          System.out.println("Ötelencek Olan X Değerini Giriniz ");
           double newx = input.nextInt();
          System.out.println("Ötelencek Olan Y Değerini Giriniz");
           double newy = input.nextInt();

          edge.changing(newx,newy);
          edge.vista();
    }
  }
