import java.util.Scanner;

public class Kiloo {
    public static void main(String[] args) {
        double boy,kilo ;
        double BoyKiloEndeksi;
        Scanner inp = new Scanner(System.in);

        System.out.println("Boyunuz Metre Cinsinden :");
        boy = inp.nextDouble();
        System.out.println("Kilonuz Kilogram Cinsinden :");
        kilo = inp.nextDouble();

        BoyKiloEndeksi = kilo/ (boy*boy);

        System.out.println("Boy Kilo Endeksiniz :" + BoyKiloEndeksi);







    }
}
