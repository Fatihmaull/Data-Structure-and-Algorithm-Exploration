import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AntrianBimbingan {
    //membuat queue nya
    Queue<String> antrian = new LinkedList<>();

    public void tambahMahasiswa(String nama) {
        antrian.add(nama);
        System.out.println("Mahasiswa '" + nama + "' telah ditambahkan ke antrian.");
    }//menambahkan mahasiswa ke queue nya

    public void layaniMahasiswa() {
        if (!antrian.isEmpty()) {
            String nama = antrian.poll();
            System.out.println("Mahasiswa '" + nama + "' sedang dalam proses bimbingan.");
        } else {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang menunggu.");
        }//method mengeluarkan mahasiswa dari antrian/melayani mahasiswa
    }

    public void lihatMahasiswaTerdepan() {
        if (!antrian.isEmpty()) {
            System.out.println("Mahasiswa terdepan: " + antrian.peek());
        } else {
            System.out.println("Antrian kosong.");
        }//melihat mahasiswa terdepan
    }

    public void tampilkanAntrian() {
        if (!antrian.isEmpty()) {
            System.out.println("Daftar mahasiswa dalam antrian: " + antrian);
        } else {
            System.out.println("Antrian kosong.");
        }// menampilkna semua mahasiswa dalam antrian
    }

    public static void main(String[] args) {
        AntrianBimbingan antrianBimbingan = new AntrianBimbingan();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Tampilkan Semua Mahasiswa dalam Antrian");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    antrianBimbingan.tambahMahasiswa(nama);
                    break;
                case 2:
                    antrianBimbingan.layaniMahasiswa();
                    break;
                case 3:
                    antrianBimbingan.lihatMahasiswaTerdepan();
                    break;
                case 4:
                    antrianBimbingan.tampilkanAntrian();
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
