import java.util.Scanner;

public class UpahKaryawan {
    // deklarasi variabel
    private String nama;
    private char gol;
    private int upahPerJam;

    // mehtod input data karyawan
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Karyawan: ");
        nama = scanner.nextLine();

        System.out.print("Masukkan Golongan karyawan (A/B/C/D): ");
        gol = scanner.next().charAt(0);

        // bagian menentukan data si karyawan sesuai dengan gologannya
        if (gol == 'A' || gol == 'a') {
            upahPerJam = 10000;
        } else if (gol == 'B' || gol == 'b') {
            upahPerJam = 15000;
        } else if (gol == 'C' || gol == 'c') {
            upahPerJam = 20000;
        } else if (gol == 'D' || gol == 'd') {
            upahPerJam = 25000;
        } else {
            System.out.println("Golongan tidak valid!");
            upahPerJam = 0;
        }
    }

    // method untuk hasil output
    public void tampilkanData() {
        if (upahPerJam > 0) {
            System.out.println("Nama Karyawan: " + nama);
            System.out.println("Upah Per Jam: Rp" + upahPerJam);
        }
    }

    // main method, semua method yg dibuat tadi dipanggil disini
    public static void main(String[] args) {
        UpahKaryawan karyawan = new UpahKaryawan();
        karyawan.inputData();
        karyawan.tampilkanData();
    }
}
