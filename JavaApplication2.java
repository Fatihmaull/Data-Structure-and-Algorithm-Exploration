
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka Fibonacci yang ingin ditampilkan: ");
        int jumlahDeret = scanner.nextInt();
        for (int i = 0; i < jumlahDeret; i++) {
            int hasil = fiboRekursif(i);
            System.out.print(hasil + " ");
        }
    }

    public static Integer fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fiboRekursif(n - 1) + fiboRekursif(n - 2);
    }
}
