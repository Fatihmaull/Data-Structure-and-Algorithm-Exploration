import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan warna lampu (MERAH, KUNING, HIJAU): ");
        String warna = input.nextLine();

        if (warna.equals("MERAH") || warna.equals("KUNING") || warna.equals("HIJAU")) {
            if (warna.equals("MERAH")) {
                System.out.println("Berhenti!");
            } else if (warna.equals("KUNING")) {
                System.out.println("Hati-Hati!");
            } else {
                System.out.println("Jalan!");
            }
        } else {
            System.out.println("Warna salah!");
        }
        input.close();
    }
}
