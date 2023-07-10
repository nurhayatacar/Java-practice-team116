package day02;

import java.util.Scanner;

public class Q05_soru5 {
    public static void main(String[] args) {
        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there aren’t 16 digit print
         * “Invalid credit card number”
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)
         */


            Scanner scanner = new Scanner(System.in);
            System.out.println("İsminizi, Soyisminizi ve Kredi Kartı Numaranızı Giriniz");
            String input = scanner.nextLine();
            String krediKarti= input.replaceAll("\\D","");
            if (krediKarti.length()!=16 ) {
                System.out.println("Gecersiz Kredi Kartı Numarasi");
            }
            String isimSoyisim= input.replaceAll("\\d","").replaceAll("\\s+", " ")
                    .trim();
            isimSoyisim= isimSoyisim.toUpperCase();

            System.out.print("Name: ");
            for(int i=0;i<isimSoyisim.length();i++) {


                if (i==0 || isimSoyisim.charAt(i-1)==' ') {



                    System.out.print(isimSoyisim.charAt(i));


                } else if (isimSoyisim.charAt(i)==' '){


                    System.out.print(" ");


                } else
                    System.out.print("*");
            }


            System.out.print("\nCNN : **** **** **** "+krediKarti.substring(12,16));


        }


    }






