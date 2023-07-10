package day02;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_soru6cozum2 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iminizi ve soyisminizi giriniz");
        String userInput=scan.nextLine();
        userInput=userInput.replaceAll("\\d","").
                                trim().
                                replaceAll(" ","0").
                                replaceAll("//W","").
                                replaceAll("0"," ");

       String [] isimSoyisim=userInput.split(" ");

       String isim = isimSoyisim[0].substring(0,1).toUpperCase()+isimSoyisim[0].substring(1).toLowerCase();
       String soyisim = isimSoyisim[1].substring(0,1).toUpperCase()+isimSoyisim[1].substring(1).toLowerCase();
        System.out.println("Isim : "+isim );
        System.out.println("Soyisim : "+soyisim);



    }
}
