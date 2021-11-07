import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        double alan, u;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz: ");
        a = scan.nextInt();

        System.out.print("2. Kenarı Giriniz: ");
        b = scan.nextInt();

        System.out.print("3. Kenarı Giriniz: ");
        c = scan.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Çevre: "+ 2*u);
        System.out.println("Alan: "+alan);
    }
}
