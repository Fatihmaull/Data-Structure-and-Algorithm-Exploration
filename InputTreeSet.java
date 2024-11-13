import java.util.Scanner;
import java.util.TreeSet;

public class InputTreeSet {
    public static void main(String[] args) {
        TreeSet<String> mahasiswaSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa (ketik 'selesai' untuk sotp):");
        while (true) {
            System.out.print("Nama Mahasiswa: ");
            String nama = scanner.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            mahasiswaSet.add(nama);
        }

        System.out.println("\nData Mahasiswa dalam TreeSet:");
        for (String nama : mahasiswaSet) {
            System.out.println(nama);
        }
    }
}
