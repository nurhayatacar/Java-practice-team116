package day02;

import java.util.Scanner;

public class Q07_soru6_ {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);



            System.out.println("Please insert your name and surname");
            String userInput = scanner.nextLine();

            userInput = userInput.trim();

            // En fazla 1 tane soyisim olabilecek sekilde kabul ettim.

            userInput = userInput.replaceAll("\\d", "").
                    replaceAll(" ", "0").
                    replaceAll("\\W", "").
                    replaceAll("0", " ").
                    trim().
                    replaceAll("\\s+"," ");
            /*      Yukaridaki satirda sirasiyla
                    1- Rakamlari Kaldir.
                    2- Aradaki bosluklari 0 ile degistir.
                    3- Harf veya rakam olmayan diger tum karakterleri cikar.
                    4- Bosluktan 0 a cevirdigimiz 0'lari tekrar bosluga cevir.
                    5- Basta sonda bosluk kalirsa tekrar sil.
                    6- Birden fazla bosluk birakilan yerleri tek bosluga cevir.
             */


            for (int i = 0; i < userInput.length(); i++) {

                if (i==userInput.lastIndexOf(" ")) {

                    System.out.print("\nSurname:");
                }
                if (i == 0 || userInput.charAt(i - 1) == ' '){
                    System.out.print(userInput.toUpperCase().charAt(i));
                } else {

                    System.out.print(userInput.toLowerCase().charAt(i));
                }
                }


    }
    }


