package day02;

import java.util.Scanner;

public class Q06_Soru4 {
    public static void main(String[] args) {
        /*
         * Ask the user for a String and a sentences
         * Find and print occurrence of String in sentences.
         * (without case sensitivity)
         *
         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Lutfen aranacak kelime geriniz");
        String kelime=scan.next().toLowerCase();
       int sayac=0;
       int index=cumle.indexOf(kelime);
       while (index!=-1){
           sayac++;
           index=cumle.indexOf(kelime,index+1);
       }
       if (sayac==1){
           System.out.println("Cumlede aranan kelime bir tane");
       }else {
           System.out.println("Cumlede aranan kelime "+sayac+ " tane var");
       }



    }
}
