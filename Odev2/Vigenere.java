
import java.util.Scanner;

class Vigenere {
    static Scanner sn = new Scanner(System.in);

    public static void main(final String[] args){
        System.out.println("Encrypt (1) or Decrypt(2) ?");
        String choice = sn.nextLine();
        // Şifreleme ya da Şifrelenmiş Metni Çözmek İçin Seçim
        if(choice.toLowerCase().contains("1")){
            System.out.println("Anahtar Giriniz");
            String key = sn.nextLine();
            System.out.println("Sifrelenecek Olan Metni Giriniz");
            String plaintext = sn.nextLine();
            System.out.println("Metnin Sifrelenmis Hali ");
            System.out.println(Encrypt(key,plaintext));
        }
        else if(choice.toLowerCase().contains("2")){
                System.out.println("Anahtar Giriniz");
                String key = sn.nextLine();
                System.out.println("Sifrelenmis Metni Giriniz");
                String plaintext = sn.nextLine();
                System.out.println("Metnin Orjinali");
                System.out.println(Decrypt(key,plaintext));
        }
        else
            System.out.println("Yanlis karakter girdiniz...");
}

//Sifreleme Islemi
      static String Encrypt(String key, String text){
        text = text.replaceAll("[^a-zA-Z]", "").toUpperCase(); //Büyük Harfe Çevirme
        key = key.replaceAll("[^a-zA-Z]", "").toUpperCase();
        /*
        ToCharArray () yöntemi, bir dizeyi karakter dizisine dönüştürdükten sonra bir Array of chars döndürür.
        Döndürülen dizi uzunluğu, String'in uzunluğuna eşittir ve Array'daki karakter dizisi, String'deki karakter dizisi ile eşleşir.
        */
        char[] kChars = key.toCharArray();
        char[] eChars = text.toCharArray();
        int[] eAlph = new int[eChars.length];
        int[] dAlph = new int[eAlph.length];
        char[] dChars = new char[dAlph.length];
        int[] kAlph = new int[kChars.length];

        for(int i = 0; i < kChars.length; i ++){ // Unicode harflerini Alfabetik harflere Cevir
            kAlph[i] = (int) kChars[i]-65;
        }
        for(int i = 0; i < eChars.length; i ++){
            eAlph[i] = ((int) eChars[i])-65;
            dAlph[i] = Math.floorMod(kAlph[i % kAlph.length] + eAlph[i], 26);
            dChars[i] = (char) (dAlph[i]+66);
        }
        String text2 = new String(dChars);
        return(text2); // Yeni text(sifrelenen metni) dizisini döndürür
    }

//Sifre Cözme İslemi
      static String Decrypt(String key, String text2){
        text2 = text2.replaceAll("[^a-zA-Z]", "").toUpperCase();
        key = key.replaceAll("[^a-zA-Z]", "").toUpperCase();

        char[] kChars = key.toCharArray();
        char[] dChars = text2.toCharArray();
        int[] dAlph = new int[dChars.length];
        int[] eAlph = new int[dAlph.length];
        char[] eChars = new char[eAlph.length];
        int[] kAlph = new int[kChars.length];

        for(int i = 0; i < kChars.length; i ++){ // Unicode harfleri Alfabetik harflere Cevir
            kAlph[i] = (int) kChars[i]-65;
        }
        for(int i = 0; i < eChars.length; i ++){
            dAlph[i] = ((int) dChars[i])-66;
            eAlph[i] = Math.floorMod(dAlph[i] - kAlph[i % kAlph.length], 26);
            eChars[i] = (char) (eAlph[i]+65);
        }
        String text = new String(eChars);
        return(text);
  }
}
