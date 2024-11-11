import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna untuk row, col, dan batas
        System.out.print("Masukkan nilai awal row: ");
        int row = scanner.nextInt();

        System.out.print("Masukkan nilai awal col: ");
        int col = scanner.nextInt();

        System.out.print("Masukkan batas segitiga: ");
        int batas = scanner.nextInt();

        cetakSegitigaSiku(row, col, batas);
    }

    static void cetakSegitigaSiku(int row, int col, int batas) {
        if (row <= batas) {
            if (col <= row) {
                System.out.print("* ");
            }
            if (col == row) {
                System.out.println();
                cetakSegitigaSiku(++row, 1, batas);
            } else {
                cetakSegitigaSiku(row, ++col, batas);
            }
        }
    }
}
