package day06;

import java.util.Random;
import java.util.Scanner;

public class Q02_TasKagitMakas {
    // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
    // Kural: 5 puana ilk ulasan oyunu kazanir
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int userChoise = 0;
        int compChoise = 0;
        int userPoint = 0;
        int compPoint = 0;
        do {
            System.out.println("lutfen Secim Yapiniz:\n1-Tas\n2-Kagit\n3-Makas ");
            //kullanicidan bir secim alacagiz
            userChoise = scan.nextInt();
            // bilgisayardan bir secim alacagiz
            compChoise = rnd.nextInt(3) + 1;//0-35(0 dahil 3 degil) arasi bir deger uretecegi icin +1 dedik

            if (userChoise == 1 && compChoise == 2) {
                System.out.println("BILGISAYARIN SECTIGI : " + compChoise);
                System.out.println("");
                System.out.println("tas kagidi sarar");
                compPoint++;
                System.out.println("sizin puaniniz" + userPoint + "\nBilgisyarin puani : " + compPoint);
                System.out.println("");
            } else if (userChoise == 1 && compChoise == 3) {

                System.out.println("BILGISAYARIN SECTIGI : " + compChoise);
                System.out.println("tas makasi kirar");
                userPoint++;
                System.out.println("sizin puaniniz" + userPoint + "\nBilgisyarin puani : " + compPoint);
                System.out.println("");

            } else if (userChoise == 2 && compChoise == 1) {

                System.out.println("BILGISAYARIN SECTIGI : " + compChoise);
                System.out.println("kagit tasi sarar");
                userPoint++;
                System.out.println("sizin puaniniz" + userPoint + "\nBilgisyarin puani : " + compPoint);
                System.out.println("");
            } else if (userChoise == 2 && compChoise == 3) {
                System.out.println("BILGISAYARIN SECTIGI : " + compChoise);
                System.out.println("makas kagidi keser");
                compPoint++;
                System.out.println("sizin puaniniz" + userPoint + "\nBilgisyarin puani : " + compPoint);
                System.out.println("");
            } else if (userChoise == 3 && compChoise == 1) {
                System.out.println("BILGISAYARIN SECTIGI : " + compChoise);
                System.out.println("tas makasi kirar");
                compPoint++;
                System.out.println("sizin puaniniz" + userPoint + "\nBilgisyarin puani : " + compPoint);
                System.out.println("");
            } else if (userChoise == 3 && compChoise == 2) {
                System.out.println("BILGISAYARIN SECTIGI : " + compChoise);
                System.out.println("makas kagidi keser");
                userPoint++;
                System.out.println("sizin puaniniz" + userPoint + "\nBilgisyarin puani : " + compPoint);
                System.out.println("");
            } else {
                System.out.println("BIlgisayarla ayni secimi yaptiniz.Kimse puan almadi");
                System.out.println("sizin puaniniz" + userPoint + "\nBilgisyarin puani : " + compPoint);
                System.out.println("");
            }
        } while (userPoint != 5 && compPoint != 5);
        if (userPoint > compPoint) {
            System.out.println("Tebrikler siz kazandiniz...");
        } else {
            System.out.println("Maalesfe Kaybettiniz...");
        }
        System.err.println("Oyun bitti");


    }
}

