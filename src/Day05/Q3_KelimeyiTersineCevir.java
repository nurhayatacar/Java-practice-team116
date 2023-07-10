package Day05;

import java.util.Scanner;

public class Q3_KelimeyiTersineCevir {
    // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
    // girilen değeri tersine  yazdıran bir method oluşturun
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scan.nextLine();
        terstenYazdir(metin);
    }
    public static void terstenYazdir(String metin){
        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);
        }
        System.out.print(tersMetin);
    }
}
