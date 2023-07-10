package day06;

import java.util.Map;
import java.util.Scanner;

public class Q03_AdamAsmaca {
    /*
-------ADAM ASMACA OYUNU --------
Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] kelimeler = {"Java", "programlama", "yazilim", "degisken", "kodlama"};
        String sekilenKelime = kelimeler[(int) Math.random() * kelimeler.length];
        int kelimelength = sekilenKelime.length();
        System.out.println("lutfen bir harf girip enter tusuna basiniz ");
        int can = 5;
        String[] tahminEdilenHarfler=new String[sekilenKelime.length()];
        for (int i = 0; i < tahminEdilenHarfler.length; i++) {
            tahminEdilenHarfler[i]="_";
        }
        while (can>0);


    }
}
