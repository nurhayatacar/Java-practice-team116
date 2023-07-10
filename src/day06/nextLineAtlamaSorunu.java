package day06;

import java.util.Scanner;

public class nextLineAtlamaSorunu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Adinizi ve soyadinizi giriniz :   ");
        String name = scan.nextLine();

        System.out.print("Lutfen yas girin : ");
        int age = scan.nextInt();
        // Satir sonu ara bellekte kalan bosluk kullanilmalidir.bunun icin bos bir nextLine kullanilarak sorun cozuluyor
        scan.nextLine();//DAMMY

        System.out.print("Lutfen mesleginizi girin : ");
        String job = scan.nextLine();


    }
}
