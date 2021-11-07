import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14, dilimAlan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        r = inp.nextInt();
        System.out.print("Merkez açıyı Giriniz: ");
        a = inp.nextInt();

        dilimAlan = (pi*(r*r)*a) / 360;

        System.out.println("Dilim alanı: "+dilimAlan);
    }
}
