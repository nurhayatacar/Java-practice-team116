package day02;

import java.util.Scanner;

public class Q3_soru3 {
    public static void main(String[] args) {
        // ask user to create a password.
        //         * it should have at least
        //         * 1 special char
        //         * 1 uppercase
        //         * 1 lowercase
        //         * 1 digit
        //         * the length of password should be at least 8 characters

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre olusturun");
       String girilenSifre= scan.next();
       byte flag=0;
        if (girilenSifre.length()<8){
        System.out.println("sifre en az 8 karakter olmali");
        flag++;
        }if (girilenSifre==girilenSifre.toUpperCase()){
            System.out.println("kucuk harf icermeli");
            flag++;
        }if (girilenSifre==girilenSifre.toLowerCase()){
            System.out.println("buyuk harf icermeli");
            flag++;
        }if (girilenSifre==girilenSifre.replaceFirst("\\w","")){
            System.out.println("bir ozel karakter icermeli");
            flag++;

        }if (girilenSifre==girilenSifre.replaceFirst("\\d","")){
            System.out.println("bir sayi icermeli");
            flag++;

        }if (flag==0){
            System.out.println("sifre basarili");

        }
    }

}
