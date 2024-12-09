import java.util.Scanner;

class Node {
    String nama;
    Node berikut;

    public Node(String nama) {
        this.nama = nama;
        this.berikut = null;
    }
}

class DaftarMahasiswa {
    private Node kepala;

    // Tambah nama mahasiswa ke dalam daftar secara terurut (ascending)
    public void tambahNama(String nama) {
        Node baru = new Node(nama);

        // Jika list kosong atau nama baru lebih kecil, letakkan di awal
        if (kepala == null || kepala.nama.compareToIgnoreCase(nama) > 0) {
            baru.berikut = kepala;
            kepala = baru;
        } else {
            Node sekarang = kepala;
            while (sekarang.berikut != null && sekarang.berikut.nama.compareToIgnoreCase(nama) < 0) {
                sekarang = sekarang.berikut;
            }
            baru.berikut = sekarang.berikut;
            sekarang.berikut = baru;
        }
    }

    // Tampilkan daftar mahasiswa yang telah diurutkan
    public void tampilkanDaftar() {
        if (kepala == null) {
            System.out.println("Daftar mahasiswa kosong.");
            return;
        }
        Node sekarang = kepala;
        int nomor = 1;
        System.out.println("Daftar Mahasiswa:");
        while (sekarang != null) {
            System.out.println(nomor + ". " + sekarang.nama);
            sekarang = sekarang.berikut;
            nomor++;
        }
    }

    // Cari nama mahasiswa dalam list dan kembalikan nomor urutnya
    public int cariNama(String nama) {
        Node sekarang = kepala;
        int nomor = 1;
        while (sekarang != null) {
            if (sekarang.nama.equalsIgnoreCase(nama)) {
                return nomor; // Nama ditemukan, kembalikan nomor urut
            }
            sekarang = sekarang.berikut;
            nomor++;
        }
        return -1; // Nama tidak ditemukan
    }
}

public class sslMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswa daftar = new DaftarMahasiswa();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tambah Nama Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("3. Cari Nama Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan input newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    daftar.tambahNama(nama);
                    System.out.println("Nama mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    daftar.tampilkanDaftar();
                    break;
                case 3:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    int posisi = daftar.cariNama(namaCari);
                    if (posisi != -1) {
                        System.out.println(namaCari + " ditemukan pada nomor urut ke-" + posisi + " dalam daftar.");
                    } else {
                        System.out.println(namaCari + " tidak ditemukan dalam daftar.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
