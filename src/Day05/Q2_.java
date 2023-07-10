package Day05;

import java.util.Scanner;

public class Q2_ {
    // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.




    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bolmek istediginiz sayiyi giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz");
        int b= scan.nextInt();
        System.out.println(bolme(a, b));
        System.out.println(bolme(25,5));
        System.out.println(bolme(6, 2));
        // System.out.println(bolunenSayi+"/"+bolenSayi+"="+bolum);

    }
    public static int bolme(int bolunenSayi,int bolenSayi){
        int bolum=0;//sayac

        while (bolunenSayi>=bolenSayi){
            bolunenSayi-=bolenSayi;
            bolum++;
        }
     return bolum;
    }

}
