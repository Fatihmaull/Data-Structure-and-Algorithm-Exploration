import java.util.Scanner;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input nilai A: ");
        double A = input.nextDouble();
        System.out.print("input nilai B: ");
        double B = input.nextDouble();
        System.out.print("input nilai C: ");
        double C = input.nextDouble(); // untuk masukkan nilai abc

        double D = (B * B) - (4 * A * C); // menghitung nilai koefisien D

        if (D < 0) {
            System.out.println("Akar imajiner.");
        } else if (D == 0) {
            double X1 = -B / (2 * A);
            System.out.println("Akar identik: X1 = X2 = " + X1);
        } else {
            double X1 = (-B + Math.sqrt(D)) / (2 * A);
            double X2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("Akar adalah: X1 = " + X1 + " dan X2 = " + X2);
        } // memeriksa jenis akar berdasarkan hasil D

        input.close();
    }
}
