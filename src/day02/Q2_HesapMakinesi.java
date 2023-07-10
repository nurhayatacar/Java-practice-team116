package day02;

import java.util.Scanner;

public class Q2_HesapMakinesi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */

        System.out.println("*****if cozumu********");
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen matematiksel isleme sokmak icin iki tamsayi girin");
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println("islem turunu secin : \n \t1 : toplama\n\t2 : cikartma\n\t3 : carpma\n\t4 : bolme ");
        int islem= scan.nextInt();
         if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4){
            if (b==0) System.out.println("0' a bolum tanimsizdir");
            else System.out.println(a/b);
         }
        else System.out.println("Yanlis giris yaptiniz, lutfen yeni bir sayi giriniz");

        System.out.println("*****switch cozumu********");

        switch (islem){
            case 1: System.out.println(a + " + " + b + " = " + (a + b));
            case 2: System.out.println(a + " + " + b + " = " + (a + b));
            case 3: System.out.println(a + " + " + b + " = " + (a + b));
            case 4:  if (b==0) System.out.println("0' a bolum tanimsizdir");
                     else System.out.println(a + " / " + b + " = " + (a / b));
                     break;
            default:
                System.out.println("Yanlis giris yaptiniz, lutfen yeni bir sayi giriniz");
        }
        System.out.println("*****switch cozumu 2 ********");

        System.out.println("lutfen bir isaret giriniz");

        char isaret=scan.next().charAt(0);


        switch(isaret){

            case '+': System.out.println(a+b); break;
            case '-': System.out.println(a-b);break;
            case '*': System.out.println(a*b);break;
            case '/':  if (b==0) System.out.println("0' a bolum tanimsizdir");
            else System.out.println(a/b);
                break;
            default:
                System.out.println("Yanlis giris yaptiniz, lutfen yeni bir sayi giriniz");
        }

    }
}
