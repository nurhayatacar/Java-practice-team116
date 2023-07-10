package Day07;

public class Q03 {
    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.1150
    public static void main(String[] args) {
        double atisYuksekligi = 1.00; // Topun atıldığı yükseklik (metre)
        double ziplamaYuksekligi = atisYuksekligi; // Topun ilk zıplama yüksekliği (metre)
        double toplamYol = 0.0; // Topun toplam aldığı yol (metre)
        int vurmaSayisi = 0; // Topun yere vurma sayısı

        do {
            toplamYol += ziplamaYuksekligi; // Topun aldığı yol güncelleniyor
            vurmaSayisi++; // Yere vurma sayısı artırılıyor
            ziplamaYuksekligi *= 0.75; // Zıplama yüksekliği güncelleniyor
            toplamYol+=ziplamaYuksekligi;
        } while (ziplamaYuksekligi >= 1.0); // Zıplama yüksekliği 1 metrenin altına indiğinde döngü sonlanır

        System.out.println("Topun aldığı toplam yol: " + toplamYol + " metre");
        System.out.println("Topun yere vurma sayısı: " + vurmaSayisi);
    }
}
