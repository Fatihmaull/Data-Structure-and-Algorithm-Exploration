import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {
    static class Mahasiswa {
        private String nama;
        private String nim;
        private String jurusan;

        // Constructor
        public Mahasiswa(String nama, String nim, String jurusan) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
        }

        // Method untuk menampilkan data mahasiswa
        public void tampilkanData() {
            System.out.println("Nama    : " + nama);
            System.out.println("NIM     : " + nim);
            System.out.println("Jurusan : " + jurusan);
        }

        // Getter untuk nama
        public String getNama() {
            return nama;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.println("=== Selamat Datang di Program Data Mahasiswa ===");
        while (true) {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Cari Data Mahasiswa");
            System.out.println("3. Tampilkan Semua Data");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    // Tambah Data Mahasiswa
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();

                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();

                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scanner.nextLine();

                    daftarMahasiswa.add(new Mahasiswa(nama, nim, jurusan));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    // Cari Data Mahasiswa
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String namaDicari = scanner.nextLine();
                    boolean ditemukan = false;

                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNama().equalsIgnoreCase(namaDicari)) {
                            System.out.println("\nData Mahasiswa Ditemukan:");
                            mhs.tampilkanData();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data mahasiswa dengan nama \"" + namaDicari + "\" tidak ditemukan.");
                    }
                    break;

                case 3:
                    // Tampilkan Semua Data
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Tidak ada data mahasiswa.");
                    } else {
                        System.out.println("\n=== Daftar Semua Mahasiswa ===");
                        for (int i = 0; i < daftarMahasiswa.size(); i++) {
                            System.out.println("\nMahasiswa ke-" + (i + 1) + ":");
                            daftarMahasiswa.get(i).tampilkanData();
                        }
                    }
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
