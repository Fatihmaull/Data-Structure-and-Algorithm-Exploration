import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda (dalam angka): ");
        int nilaiAngka = input.nextInt();
        input.close();

        String nilaiHuruf;

        if (nilaiAngka > 85) {
            nilaiHuruf = "A";
        } else if (nilaiAngka >= 75) {
            nilaiHuruf = "AB";
        } else if (nilaiAngka >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAngka >= 50) {
            nilaiHuruf = "BC";
        } else if (nilaiAngka >= 35) {
            nilaiHuruf = "C";
        } else if (nilaiAngka >= 20) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Anda adalah " + nilaiHuruf + ".");
    }
}
