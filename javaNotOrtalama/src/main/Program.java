package main;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, chem, phy, music, turkish, hist;

        System.out.print("Matematik puanınızı giriniz:");
        math = input.nextInt();

        System.out.print("Kimya puanınızı giriniz:");
        chem = input.nextInt();

        System.out.print("Fizik puanınızı giriniz:");
        phy = input.nextInt();

        System.out.print("Müzik puanınızı giriniz:");
        music = input.nextInt();

        System.out.print("Türkçe puanınızı giriniz:");
        turkish = input.nextInt();

        System.out.print("Tarih puanınızı giriniz:");
        hist = input.nextInt();

        double mn = (math + chem + phy + music + turkish + hist) / 6.0;
        boolean isPass = mn > 60;

        System.out.println("Ortalamanız: "+ mn);
        System.out.println(isPass?"Geçtiniz":"Geçemediniz");
    }
}
