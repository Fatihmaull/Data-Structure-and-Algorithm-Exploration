import java.util.Scanner;
import java.util.Stack;

public class TumpukanBarang {
    Stack<String> tumpukan = new Stack<>();
    public void tambahBarang(String barang) {
        tumpukan.push(barang);
        System.out.println("Barang '" + barang + "' telah ditambahkan ke tumpukan.");
    }//method tambah barang

    public void keluarkanBarang() {
        if (!tumpukan.isEmpty()) {
            String barang = tumpukan.pop();
            System.out.println("Barang '" + barang + "' telah dikeluarkan dari tumpukan.");
        } else {
            System.out.println("Tumpukan kosong, tidak ada barang yang dapat dikeluarkan.");
        }
    }//method keluarkan barang

    public void lihatBarangTeratas() {
        if (!tumpukan.isEmpty()) {
            System.out.println("Barang teratas: " + tumpukan.peek());
        } else {
            System.out.println("Tumpukan kosong, tidak ada barang di dalamnya.");
        }
    }//lihat barang teratas dalam stack

    public void tampilkanTumpukan() {
        if (!tumpukan.isEmpty()) {
            System.out.println("Daftar barang dalam tumpukan: " + tumpukan);
        } else {
            System.out.println("Tumpukan kosong.");
        }
    }//tampilkan semua barang dalam stack

    public static void main(String[] args) {
        TumpukanBarang tumpukanBarang = new TumpukanBarang();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Keluarkan Barang");
            System.out.println("3. Lihat Barang Teratas");
            System.out.println("4. Tampilkan Semua Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String barang = scanner.nextLine();
                    tumpukanBarang.tambahBarang(barang);
                    break;
                case 2:
                    tumpukanBarang.keluarkanBarang();
                    break;
                case 3:
                    tumpukanBarang.lihatBarangTeratas();
                    break;
                case 4:
                    tumpukanBarang.tampilkanTumpukan();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
