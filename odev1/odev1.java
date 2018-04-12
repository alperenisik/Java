/* 
Nesneye Yönelik Programlama Ödev 1
*/
import java.util.Scanner;

 public class odev1{
//Faktöriyel Hesabı
  public static double Faktoriyel (double sayi){
    double sonuc = 1;  // 1'in çarpmada önemi olmadığı için ilk değerimize 1 verdik
    for (double i=1; i<=sayi; i++ ) {
      sonuc*=i;
    }
    return sonuc;
  }
//Yaklaşık e değeri hesabı
  public static double E (double sayi2){
    double sonuc2 = 1;  // 1 ' in çarpamada önemi olmadığı için ilk değerimize 1 verdik
    double sonuc3 = 1; //  İlk değeri 1 olarak verdik daha sonra gelen değerler ile de topladık... (bir / sıfır faktöriyel == 1)
    // Sıfırdan başlamamız durumunda sonuc2 değişkeni hep sıfır olacağı için -> bir / sıfır faktöriyel değerini sonuc3'e verip direk 1 den başlıyoruz...
    for (double i=1; i<=sayi2; i++ ) {
      sonuc2*=i;
      sonuc3+=(1/sonuc2);
    }
    return sonuc3;
  }

  public static void main (String[] args){
    boolean flag = true;//While için koşul
    while(flag){
      System.out.println("\nFaktoriyel Hesaplamak Icin ==> 1 \ne Sabiti Hesaplamak Icin ==>  2\nCikis Yapmak Icin ==> 3\nLutfen seciniz... ");
      Scanner scn1 = new Scanner (System.in);
      int secim;
      secim = scn1.nextInt();
//Yapılacak işlem için seçim
    switch (secim) {

      case 1: //Faktöriyel Hesabı Yazdırma
      Scanner scn = new Scanner (System.in);
      double sayi;
      System.out.print("Faktoriyeli alinacak sayiyi giriniz : ");
      sayi = scn.nextInt();
      double sonuc = Faktoriyel(sayi);
      System.out.println(sayi+" Sayisinin faktöriyeli = "+ sonuc);
      break;

      case 2://Yaklaşık e Değeri Hesabı Yazdırma
      Scanner scn2 = new Scanner (System.in);
      double sayi2;
      System.out.print("E sayisinin yaklasik degerini hesaplamak icin bir sayi giriniz : ");
      sayi2 = scn2.nextInt();
      double sonuc3 = E (sayi2);
      System.out.println(sayi2+" sayisindan yaklasik hesaplanan e degeri = "+ sonuc3);
      break;

      case 3://Uygulamadan Çıkma
      System.out.println("Cikis Yapiliyor...\nTekrar Bekleriz... :) ");
      flag=false;//While'dan çıkar
      break;

      default:
      System.out.println("Yanlis secim yaptiniz... Lutfen tekrar deneyiniz...");
      }
    }
  }
}
/*                                                                           */
