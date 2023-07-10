package Day07;

public class Q01_arrardekiSayilarinToplami {
    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {
        // float [] arr=new  float[5];
        float[] numbers = {1.5f, 2.2f, 3.5f, 8.4f, 6.7f};
        float toplam = 0f;
        System.out.println("******for loop cozumu*****");
        for (int i = 0; i < numbers.length; i++) {
            toplam += i;
        }
        System.out.println("Toplam for loop :" + toplam);


        System.out.println("******While loop cozumu*****");

        toplam=0;
        int i=0;//baslangic noktasi
        while (i< numbers.length){//condition
           toplam+=i;
          i++;  //artis miktari
        }
          System.out.println("Toplam for loop :" + toplam);

        System.out.println("******While loop cozumu 2 *****");

        toplam=0;
        int index= numbers.length-1;//baslangic noktasi
        while (index>=0){//condition
            toplam+=index;
            index--;  //azalis miktari
        }
        System.out.println("Toplam for loop :" + toplam);
    }
}
