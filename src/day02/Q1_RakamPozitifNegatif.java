package day02;

import java.util.Scanner;

public class Q1_RakamPozitifNegatif {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi>=0){
            if (sayi<10) System.out.println("Rakam");
            else System.out.println("Pozitif Sayi");
        }
        else{
            System.out.println("Negatif Sayi");
        }// tek satir yazdiracaksak suslu parantez olmasa da olur

        System.out.println("*******2. cozum*********");
        //ikinci cozum


        if (sayi>=0 && sayi<10) System.out.println("Rakam");
        else if (sayi>=0) System.out.println("Pozitif Sayi");
        else System.out.println("Negatif Sayi");
        // tek satir yazdiracaksak suslu parantez olmasa da olur

        System.out.println("**************ternary cozum*************");

        boolean sart1= sayi>=0;
        boolean sart2= sayi<10;
        String sonuc= (sart1) ?((sart2)? "Rakam" : " -Pozitif Sayi"      ):" -Negatif sayi-";
        System.out.println(sonuc);


     String sonuc1 = sayi>=0 ?( sayi>=10 ?"Pozitif sayi":"Rakam" ): "Negatif sayi";
        System.out.println(sonuc1);



    }
}
