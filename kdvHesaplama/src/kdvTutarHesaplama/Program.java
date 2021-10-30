package kdvTutarHesaplama;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        double yazdir;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar: ");
        double fiyat = scanner.nextDouble();

        yazdir = (fiyat > 0 && fiyat < 1000)?(fiyat * 1.18):(fiyat * 1.08);

        System.out.println("KDV'siz Fiyat: "+fiyat);
        System.out.println("KDV'li Fiyat: "+((fiyat<=0)?"Girilen değer geçersizdir.":yazdir));
        System.out.println("KDV Tutarı: "+((fiyat<1000)?(fiyat * 0.18):(fiyat * 0.08)));
    }
}
