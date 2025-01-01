import java.util.Hashtable;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        //function pembuat hashtable
        Hashtable<String, String> kamus = new Hashtable<>();
        kamus.put("Algorithm", "Langkah-langkah logis untuk menyelesaikan masalah.");
        kamus.put("Array", "Struktur data yang menyimpan elemen-elemen dengan indeks.");
        kamus.put("Binary Tree", "Struktur data hierarkis dengan maksimum dua anak per simpul.");
        kamus.put("Compiler", "Program yang mengubah kode sumber menjadi kode mesin.");
        kamus.put("Data Structure", "Cara organisasi data untuk mempermudah akses dan modifikasi.");
        kamus.put("Encapsulation", "Konsep OOP untuk membungkus data dan metode dalam satu unit.");
        kamus.put("Hashing", "Teknik untuk memetakan data ke lokasi tetap di memori.");
        kamus.put("Inheritance", "Konsep OOP di mana satu kelas dapat mewarisi sifat kelas lain.");
        kamus.put("Polymorphism", "Konsep OOP di mana satu metode dapat memiliki banyak bentuk.");
        kamus.put("Queue", "Struktur data FIFO (First In First Out).");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Kamus Istilah Informatika!");

        while (true) {
            System.out.println("\nDaftar Istilah yang Tersedia:");
            for (String key : kamus.keySet()) {
                System.out.println("- " + key);
            }

            System.out.println("\nKetik istilah yang ingin Anda cari (atau ketik 'exit' untuk keluar):");
            System.out.print("Istilah: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah menggunakan Kamus Istilah Informatika!");
                break;
            }

            String arti = kamus.get(input);
            if (arti != null) {
                System.out.println("Arti: " + arti);
            } else {
                System.out.println("Istilah tidak ditemukan dalam kamus.");
            }
        }

        scanner.close();
    }
}
