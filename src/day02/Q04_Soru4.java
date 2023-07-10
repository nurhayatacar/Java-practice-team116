package day02;

import java.util.Scanner;

public class Q04_Soru4 {
    public static void main(String[] args) {
        /*
         * Ask the user for a String and a sentences
         * Find and print occurrence of String in sentences.
         * (without case sensitivity)
         *
         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String sentences = scan.nextLine().toLowerCase();
        System.out.println("lutfen bir kelime string girin");
        String str = scan.next().toLowerCase();

        int sayac=0;

        int index = sentences.indexOf(str);
        while (index != -1) {
            sayac++;
            index = sentences.indexOf(str, index + 1);
        }
        if (sayac == 1) {
            System.out.printf("There is 1 "+ " "+str+" in the sentence.");
        } else {
            System.out.printf("There are "+"'"+sayac+"' "+str+" in the sentence.");
        }

    }



    }


