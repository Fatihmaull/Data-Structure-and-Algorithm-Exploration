import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa (ketik 'selesai' utk stop):");
        while (true) {
            System.out.print("Nama Mahasiswa: ");
            String nama = scanner.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            mahasiswaList.add(nama);
        }

        System.out.println("\nData Mahasiswa dalam ArrayList:");
        for (String nama : mahasiswaList) {
            System.out.println(nama);
        }

        scanner.close();
    }
}
