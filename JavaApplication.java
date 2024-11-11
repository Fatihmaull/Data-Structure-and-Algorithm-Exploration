import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int n = scanner.nextInt();
        int hasil = rekursif(n);

        System.out.println("Hasil faktorial dari " + n + " adalah: " + hasil);
    }

    public static int rekursif(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * rekursif(n - 1);
        }
    }
}
