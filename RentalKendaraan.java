import java.util.Scanner;

public class RentalKendaraan {
    // Atribut class
    String jenisKendaraan;
    int jumlahRoda;
    double hargaSewaPerHari;

    public void pilihKendaraan(int pilihan) {
        switch (pilihan) {
            case 1:
                jenisKendaraan = "Motor";
                jumlahRoda = 2;
                hargaSewaPerHari = 50000;
                break;
            case 2:
                jenisKendaraan = "Mobil";
                jumlahRoda = 4;
                hargaSewaPerHari = 300000;
                break;
            case 3:
                jenisKendaraan = "Truk";
                jumlahRoda = 6;
                hargaSewaPerHari = 500000;
                break;
            default:
                jenisKendaraan = "Tidak diketahui";
                jumlahRoda = 0;
                hargaSewaPerHari = 0;
                break;
        }
    }

    // Methode untuk menentukan total biaya sewa
    public double hitungBiayaSewa(int lamaSewa) {
        if (lamaSewa <= 0) {
            System.out.println("Lama sewa tidak valid!");
            return 0;
        } else {
            return hargaSewaPerHari * lamaSewa;
        }
    }

    // Methode menampilkan spek kendaraan
    public void tampilkanInfo(int lamaSewa) {
        if (jumlahRoda > 0) {
            System.out.println("Kendaraan yang dipilih: " + jenisKendaraan);
            System.out.println("Jumlah roda: " + jumlahRoda);
            System.out.println("Harga sewa per hari: Rp" + hargaSewaPerHari);
            System.out.println("Lama sewa: " + lamaSewa + " hari");
            double totalBiaya = hitungBiayaSewa(lamaSewa);
            if (totalBiaya > 0) {
                System.out.println("Total biaya sewa: Rp" + totalBiaya);
            }
        } else {
            System.out.println("Pilihan kendaraan tidak valid!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RentalKendaraan rental = new RentalKendaraan();

        // Menampilkan menu pilihan kendaraan
        System.out.println("Pilih jenis kendaraan untuk disewa:");
        System.out.println("1. Motor (Rp50.000 per hari)");
        System.out.println("2. Mobil (Rp300.000 per hari)");
        System.out.println("3. Truk (Rp500.000 per hari)");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = input.nextInt();

        // Memilih kendaraan berdasarkan input
        rental.pilihKendaraan(pilihan);

        // Meminta input lama penyewaan
        System.out.print("Masukkan lama sewa (dalam hari): ");
        int lamaSewa = input.nextInt();

        // Menampilkan informasi kendaraan dan menghitung biaya sewa
        rental.tampilkanInfo(lamaSewa);
    }
}
