public class Q04 {
    // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.
    public static void main(String[] args) {
        int sayi1 = 8;
        int sayi2 = 15;
        int buyukSayi = Math.max(sayi1, sayi2);
        int kucukSayi = Math.min(sayi1, sayi2);

        int ekok=buyukSayi;
        while (ekok%kucukSayi!=0){
            ekok+=buyukSayi;
        }
        System.out.println(ekok);


    }
}
