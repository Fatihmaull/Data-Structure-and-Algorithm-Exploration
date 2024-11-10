import java.util.Scanner;

public class Evaluasi {
    public int[] prosesHasilUjian() {
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahGagal = 0;
        int counterSiswa = 1;
        int hasil;

        // loop menggunakan sistem while
        while (counterSiswa <= 8) {
            System.out.print("Masukkan hasil ujian (1 = lulus atau 2 = gagal): ");
            hasil = input.nextInt();
            if (hasil == 1) {
                jumlahLulus = jumlahLulus + 1;
            } else {
                jumlahGagal = jumlahGagal + 1;
            }
            counterSiswa = counterSiswa + 1;
        }
        input.close();

        return new int[]{jumlahLulus, jumlahGagal};
    }

    public static void main(String[] args) {
        Evaluasi evaluasi = new Evaluasi();
        // Memanggil method prosesHasilUjian dan menyimpan hasilnya di array
        int[] hasilUjian = evaluasi.prosesHasilUjian();
        // print output
        System.out.printf("Lulus: %d\nGagal: %d\n", hasilUjian[0], hasilUjian[1]);
    
        // eval hasil
        if (hasilUjian[0] > 4) {
            System.out.print("Kursus telah berhasil!");
        } else {
            System.out.print("Kursus tidak berhasil!");
        }
    }
}
